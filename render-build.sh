#!/bin/bash
# Install Maven
apt-get update && apt-get install -y maven
# Verify Maven installation
mvn -version
# Run the Maven build
mvn clean install
