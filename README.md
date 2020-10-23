Adaptor Pattern Split for using HazelCaste or Redis

Start redis server

`docker run –name redis -p 6379:6379 -d redis`

run application

`mvn spring-boot:run -Dspring-boot.run.arguments="--cache=hc"`
