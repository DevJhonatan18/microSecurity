- Ejecutar Shell Compile.sh
- Ejecutar Comando 

docker build -t servicio1:0.1 .
curl --request POST 'http://localhost:8010/oauth/token' \
          --header 'Content-Type: application/x-www-form-urlencoded' \
            --user 'webAngular:123456'  --data-urlencode 'grant_type=password' --data-urlencode 'username=admin' --data-urlencode 'password=12345'
