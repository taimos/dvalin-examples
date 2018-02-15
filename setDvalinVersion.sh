#!/usr/bin/env bash

VERSION=${1?:missing target version}

for PROJECT in $(find . -type d -depth 1 | grep -v '\./\.'); do
    echo "Found ${PROJECT}"
    sed -i '' -e "s/<dvalin.version>.*<\/dvalin.version>/<dvalin.version>${VERSION}<\/dvalin.version>/g" "${PROJECT}/pom.xml"
done