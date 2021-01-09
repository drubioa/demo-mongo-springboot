# Demo Spring Boot + MongoDb + Docker-Compose

![Java CI with Maven](https://github.com/drubioa/demo-mongo-springboot/workflows/Java%20CI%20with%20Maven/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Lenguaje: [English](../README.md) | Español

# Comenzando 🚀
En esta prueba vamos a generar un proyecto con spring boot en el que haya un controlador con dos enpoints: uno para insertar nuevos registros y otro para recuperar estos registros.ç

Como ejemplo utilizaremos la entidad persona: 

| Campo | tipo |
| -- | -- |
| name | string |
| surname | string |
| age | int |
| nif | int |

# Pre-requisitos 📋
Disponer de docker y docker-compose.

# Instalacion 🔧
Para este proyecto hemos configurado nuestro *docker-compose.yml* para que genere dos conteneroes 

```
    docker-compose up -d
```

Una vez lanzado tendremos levantados los siguientes contenedores:


````
    - mongo     # Con la base de datos
    - app       # Microservicio con spring boot y dos endpoints
```` 

# Ejecutando la prueba de concepto ⚙️
Para demostrar esta prueba de concepto se realizará en primer lugar una inseción en bd de datos mediante una llamada al *POST* 
y luego se obtendrá mediante una llamada al *GET*.

Dejo a continuación las llamadas que se pueden realizar con **curl** una vez la aplicación esta lanzada por el docker-compose.

1. Para insertar nuevo registro
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

2. Para recuperar el registro previamente creado
```
    curl --location --request GET 'localhost:8081/person/123456789A'
```

## Postman
Tambien es posible importar una coleccion de pruebas de [Postman](https://www.postman.com/) que permiten realizar esta prueba y que se encuentra en la carpeta **docs**.

