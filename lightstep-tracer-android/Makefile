#
# Encapsulate the common tasks in a Makefile so one does not need to be familiar
# with gradle (or any Java-specific build tool) to get useful things done.
#
.PHONY: build clean publish

VERSION_SOURCE=src/main/java/com/lightstep/tracer/android/Version.java

build:
	../gradlew install

clean:
	../gradlew clean

generate-version-source-file:
	@echo "Updating $(VERSION_SOURCE)"
	perl -pi -e 's/(\d+)\.(\d+)\.(\d+)/ ($$1) . q{.} . ($$2) . q{.} . ($$3+1) /ge' $(VERSION_SOURCE)

# Uses $NEW_VERSION to set the value.
generate-version-source-file-withversion:
	@echo "Updating $(VERSION_SOURCE) with version $(NEW_VERSION)"
	perl -pi -e 's/(\d+)\.(\d+)\.(\d+)/$$ENV{NEW_VERSION}/ge' $(VERSION_SOURCE)
