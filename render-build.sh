#!/bin/bash

# Install SDKMAN (used to install Maven)
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"

# Install Maven using SDKMAN
sdk install maven

# Verify Maven installation
mvn -version

# Run the Maven build
mvn clean install
