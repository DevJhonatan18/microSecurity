#!/bin/bash

SERVERPROD="localhost"


echo "Hola soy $SERVERPROD"

curl --request POST 'http://3.20.236.165:8020/oauth/token' \
          --header 'Content-Type: application/x-www-form-urlencoded' \
            --user 'webAngular:123456'  --data-urlencode 'grant_type=password' --data-urlencode 'username=admin' --data-urlencode 'password=12345' | python -mjson.tool
