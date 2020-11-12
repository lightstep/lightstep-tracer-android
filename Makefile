.PHONY: build publish pre-publish ci_test clean test inc-version verify-version

build:
	./gradlew build

# gradle can fail on clean, thus the "|| true"
clean:
	./gradlew clean

test: ci_test

# The publish step does a clean and rebuild as the `gradle build` hasn't seemed
# 100% reliable in rebuilding when files are changed (?).  This may very much be
# a setup error -- but for now, a clean build is done just in case.
#
# See https://bintray.com/lightstep for published artifacts
publish: pre-publish build test
	./gradlew bintrayUpload
	@echo
	@echo "\033[92mSUCCESS: published v`awk 'BEGIN { FS = "=" }; { printf("%s", $$2) }' gradle.properties` \033[0m"
	@echo

pre-publish:
	@test -n "$$BINTRAY_USER" || (echo "BINTRAY_USER must be defined to publish" && false)
	@test -n "$$BINTRAY_API_KEY" || (echo "BINTRAY_API_KEY must be defined to publish" && false)
	@test -n "$$MAVEN_CENTRAL_USER_TOKEN" || (echo "MAVEN_CENTRAL_USER_TOKEN must be defined to publish" && false)
	@test -n "$$MAVEN_CENTRAL_TOKEN_PASSWORD" || (echo "MAVEN_CENTRAL_TOKEN_PASSWORD must be defined to publish" && false)
	@git diff-index --quiet HEAD || (echo "git has uncommitted changes. Refusing to publish." && false)
	@echo "\033[92mPublishing as $$BINTRAY_USER with key <HIDDEN> \033[0m"

# CircleCI test
ci_test: build
	./gradlew test

# If no version is specified, the minor version will be automatically increased.
inc-version:
	./inc-version.sh $(NEW_VERSION)
