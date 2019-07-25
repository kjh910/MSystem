#!/bin/bash
# PATH_NAME=$(pwd)
arg=$1

cd ../ManagementSystem

./mvnw spring-boot:run -Ddbip=$arg
  
# ./mvnw spring-boot:run -Ddbip=$arg

