#!/usr/bin/env bash

echo $@

HOME_DIR=/c/Users/er23887/src/gitRepo

CLPATH=${HOME_DIR}/gitRepo-api/target/gitRepo-api-1.0-SNAPSHOT.jar
CLPATH=${CLPATH}:${HOME_DIR}/gitRepo-jdbc/target/gitRepo-jdbc-1.0-SNAPSHOT.jar
CLPATH=${CLPATH}:${HOME_DIR}/gitRepo-app/target/gitRepo-app-1.0-SNAPSHOT.jar

echo ${CLPATH}

java -classpath $CLPATH ru.rbt.gitRepo.App $@
