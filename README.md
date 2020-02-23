# API-CAMEL
Proyecto spring boot que implementa una API REST utilizando Apache Camel.

Se utilizaron los siguientes componentes:
 - H2
 - JPA
 - Devtools
 - Actuator
 - Swagger

### Dependencias:
| Detalle | Version |
| ------ | ------ |
| Java | 1.8u221 |
| Spring Boot | 2.2.4.RELEASE |
| Camel | 3.0.1 |
| Maven | 3.6.2 |


### Intrucciones de instalación
```sh
$ cd api-camel
$ mvn package
$ java -jar target/api-camel-0.0.1-SNAPSHOT.jar
```


### Info

| Información | URL |
| ------ | ------ |
| Swagger | http://localhost:8080/api/api-doc |
| Actuator info | http://localhost:8080/actuator/info |
| Actuator health | http://localhost:8080/actuator/health |

### Ejemplo de request

```sh
curl -X GET "http://localhost:8080/api/producto/all" -H "accept: application/json"
```

### Ejemplo de response
```json
[
    {
        "creacion": "2020-02-23 23:05:41",
        "modificacion": "2020-02-23 23:05:41",
        "id": 1,
        "nombre": "Kunstmann Torobayo",
        "img": "img/1",
        "descripcion": "Pack 4",
        "precio": 5400,
        "descuento": 0.0
    },
    {
        "creacion": "2020-02-23 23:05:41",
        "modificacion": "2020-02-23 23:05:41",
        "id": 2,
        "nombre": "Kunstmann Miel",
        "img": "img/2",
        "descripcion": "Pack 4",
        "precio": 5700,
        "descuento": 0.0
    },
    {
        "creacion": "2020-02-23 23:05:41",
        "modificacion": "2020-02-23 23:05:41",
        "id": 3,
        "nombre": "Kunstmann sin filtrar",
        "img": "img/3",
        "descripcion": "Pack 4",
        "precio": 6200,
        "descuento": 0.2
    },
    {
        "creacion": "2020-02-23 23:05:41",
        "modificacion": "2020-02-23 23:05:41",
        "id": 4,
        "nombre": "Dolbek Ale",
        "img": "img/4",
        "descripcion": "Pack 4",
        "precio": 4200,
        "descuento": 0.11
    },
    {
        "creacion": "2020-02-23 23:05:41",
        "modificacion": "2020-02-23 23:05:41",
        "id": 5,
        "nombre": "Dolbek Maqui",
        "img": "img/5",
        "descripcion": "Pack 4",
        "precio": 5200,
        "descuento": 0.0
    }
]
```

