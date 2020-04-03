#!/bin/bash

curl --request POST 'http://localhost:8010/oauth/token' \
          --header 'Content-Type: application/x-www-form-urlencoded' \
            --user 'webAngular:123456'  --data-urlencode 'grant_type=password' --data-urlencode 'username=admin' --data-urlencode 'password=12345'
