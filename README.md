Adaptor Pattern Split for using HazelCaste or Redis



Hazelcast setup
`mvn spring-boot:run -Dspring-boot.run.arguments="--cache=hc"`
OR 

Redis setup
`docker run –name redis -p 6379:6379 -d redis`
`mvn spring-boot:run -Dspring-boot.run.arguments="--cache=redis"`
