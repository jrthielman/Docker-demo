# Docker-demo

1. Build een image van de dockerfile en dubbel check dan of de image "dockerdemo" heet.
2. Zorg ervoor dat je lokaal een postgres database instantie hebt draaien, met naam, username & password dat overeenkomt met wat in de .properties staat.
3. Als je gebruikt maakt van postgres, zorg er dan voor dat je in de postgreSQL --> data(postgres 10) --> pg_hba.conf bestamd de juiste ip adressen hebt toegelaten. Let hier ook op dat je de juiste netmask getal gebruikt. 
4. Verander het ip adres dat staat aangegeven in de .properties, naar jouw eigen publieke ip adres (begint met 172.xx.xx.xx). Als je linux gebruikt dan kan dit localhost blijven.
5. Start de image via de meegeleverde docker-compose, doe dit met de commando "docker-compose up".

# properties bestand

```
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

## default connection pool
spring.datasource.hikari.connectionTimeout=20000
spring.datasource.hikari.maximumPoolSize=5

## PostgreSQL
spring.datasource.url=jdbc:postgresql://172.xx.xx.xx:5432/dockerdemo <------ zelf ip adres invullen
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.username=dockerdemo
spring.datasource.password=dockerdemo
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

#drop n create table again, good for testing, comment this in production
spring.jpa.hibernate.ddl-auto=update

server.port=8080
```
