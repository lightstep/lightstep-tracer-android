#!/bin/bash
  
# To increment the version, use the Makefile
# make publish
# which will call out to this script

set -e

if [ "$#" -lt 1 ]; then
        echo "Increasing minor version automatically"
	awk 'BEGIN { FS = "." }; { printf("%s.%d.%d", $1, $2, $3+1) }' gradle.properties > gradle.properties.incr
	NEW_VERSION=`awk 'BEGIN { FS = "=" }; { printf("%s", $2) }' gradle.properties.incr`
else
	awk -v VERSION=$1 'BEGIN { FS = "=" }; { printf("%s=%s", $1, VERSION) }' gradle.properties > gradle.properties.incr
	NEW_VERSION=$1
fi

# Create a branch with the version bump.
NEW_VERSION_BRANCH="v${NEW_VERSION}_bump"
git checkout -b $NEW_VERSION_BRANCH

# Add and commit the changes.
mv gradle.properties.incr gradle.properties
make -C lightstep-tracer-android generate-version-source-file-withversion NEW_VERSION=$NEW_VERSION
git add gradle.properties
git add lightstep-tracer-android/src/main/java/com/lightstep/tracer/android/Version.java
git commit -m "VERSION $NEW_VERSION"

git push --set-upstream origin $NEW_VERSION_BRANCH
