#!/bin/bash

export CLASSIFY_JDB_URL="-DCLASSIFY_JDBC_URL=jdbc:mysql://localhost:3306/classify_service?autoReconnect=true&useTimezone=true&serverTimezone=UTC&&allowPublicKeyRetrieval=true&useSSL=false&user=dev&password=123"
echo "########## START BUILD #########"
mvn package -Dmaven.test.skip=true
