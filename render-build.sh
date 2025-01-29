#!/bin/bash

# Install SDKMAN (used to install Java & Maven)
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"

# Install Java (Replace with the required version)
sdk install java 17.0.9-tem

# Set JAVA_HOME (Needed for Maven)
export JAVA_HOME="$HOME/.sdkman/candidates/java/current"
export PATH="$JAVA_HOME/bin:$PATH"

# Verify Java installation
java -version

# Install Maven
sdk install maven

# Verify Maven installation
mvn -version

# Run the Maven build
mvn clean install
