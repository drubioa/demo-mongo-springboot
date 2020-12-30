# Demo Spring Boot + MongoDb + Docker-Compose
![Java CI with Maven](https://github.com/drubioa/demo-mongo-springboot/workflows/Java%20CI%20with%20Maven/badge.svg)
Language: English | [Español](docs/README-es-ES.md)

# Starting 🚀
In this demo we generate a project with spring boot, which have got a controller with 2 entpoints. The firts is for insert new register and the other to obtains inserted registries.

For this example, we using the entity *Person* with the following values:

| Field | type |
| -- | -- |
| name | string |
| surname | string |
| age | int |
| nif | int |

# Requirements 📋
Yo should got installed *docker* and *docker-compose*.

# Instalation 🔧
For this project we use *docker-compose.yml* to generate to containers. Use following command:

```
    docker-compose up -d
```
Once the application will be running, you should got the next containers:

````
    - mongo     # Con la base de datos
    - app       # Microservicio con spring boot y dos endpoints
```` 

# Test demo ⚙️
For this demo, we should be do two calls. One to insert new user in db with POST request and other to obtains inserted user with *GET* rquest.

Use the followind *curl* calls to demostrate this test once the *docker-compose* was executing. 

1. To insert new user:
```
    curl --location --request POST 'localhost:8081/person' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "name": "Diego",
        "surname": "AAA",
        "nif": "123456789A",
        "age": 20
    }'
```

2. For recovery inserted user.
```
    curl --location --request GET 'localhost:8081/person/123456789A'
```

## Postman
Is possible launch http request in postman. You find collection with test in **docs/Demo Mongo.postman_collection** file.
