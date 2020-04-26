- Ejecutar Shell Compile.sh
- Ejecutar Comando 

docker build -t servicio-seguridad:v1 .

docker run -d -p 8020:8020 --name servicio-seguridad --network demo_deposit_kafka-local servicio-seguridad:v1

docker tag servicio-seguridad:v1 jhonatandev/servicio-seguridad:v1

docker push jhonatandev/servicio-seguridad:v1

curl --request POST 'http://localhost:8010/oauth/token' \
          --header 'Content-Type: application/x-www-form-urlencoded' \
            --user 'webAngular:123456'  --data-urlencode 'grant_type=password' --data-urlencode 'username=admin' --data-urlencode 'password=12345'
