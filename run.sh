#!bin/bash
mvn clean install
mvn jar:jar
mvn exec:java -D exec.mainClass=Main