# Course Spring Framework

## Descripción del Proyecto

Este es un proyecto educativo desarrollado como parte de un curso sobre **Spring Boot Framework**. El objetivo principal es aprender y practicar los conceptos fundamentales del framework Spring, incluyendo:

- Creación de aplicaciones web con Spring Boot
- Desarrollo de controladores (Controllers)
- Uso de plantillas dinámicas con Thymeleaf
- Creación de APIs REST
- Gestión de modelos y DTOs (Data Transfer Objects)
- Inyección de dependencias en Spring

### Características Principales

- **Controladores MVC**: Implementación de controladores tradicionales con vistas HTML
- **API REST**: Endpoints que retornan datos en formato JSON
- **Modelos de Datos**: Clases modelo como `User` para representar entidades
- **DTOs**: Data Transfer Objects para transferir datos entre capas
- **Thymeleaf**: Plantillas dinámicas para renderizar vistas del lado del servidor
- **Spring Web MVC**: Framework web MVC integrado en Spring Boot

## Lenguajes y Tecnologías Utilizadas

### Lenguajes
- **Java 17**: Lenguaje principal del proyecto
- **HTML5**: Para las plantillas Thymeleaf
- **XML**: Para configuración de Maven y archivos de construcción

### Frameworks y Librerías
- **Spring Boot 4.0.2**: Framework principal para la construcción de la aplicación
- **Spring Web MVC**: Para el manejo de solicitudes HTTP y enrutamiento
- **Thymeleaf**: Motor de plantillas para procesamiento del lado del servidor
- **Maven**: Herramienta de construcción y gestión de dependencias

### Dependencias del Proyecto
```xml
- spring-boot-starter-thymeleaf: Integración de Thymeleaf con Spring Boot
- spring-boot-starter-webmvc: Starter para aplicaciones web MVC
- spring-boot-devtools: Herramientas de desarrollo (reload automático)
- spring-boot-starter-thymeleaf-test: Testing de Thymeleaf
- spring-boot-starter-webmvc-test: Testing de Web MVC
```

## Estructura del Proyecto

```
course-spring-framework/
├── src/
│   ├── main/
│   │   ├── java/com/example/course/spring/framework/course_spring_framework/
│   │   │   ├── controllers/
│   │   │   │   ├── UserController.java (Controlador MVC tradicional)
│   │   │   │   └── UserRestController.java (Controlador REST)
│   │   │   ├── models/
│   │   │   │   ├── User.java (Modelo de usuario)
│   │   │   │   └── dto/
│   │   │   │       └── UserDto.java (DTO para transferencia de datos)
│   │   │   └── CourseSpringFrameworkApplication.java (Clase principal)
│   │   └── resources/
│   │       ├── application.properties (Configuración de la aplicación)
│   │       └── templates/ (Plantillas Thymeleaf)
│   └── test/
│       └── java/ (Pruebas unitarias)
├── pom.xml (Configuración de Maven)
└── README.md (Este archivo)
```

## Cómo Ejecutar el Proyecto

### Requisitos Previos
- JDK 17 o superior
- Maven 3.6 o superior

### Pasos para Ejecutar

1. **Clonar o navegar al directorio del proyecto**
   ```bash
   cd course-spring-framework
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean install
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```

4. **Acceder a la aplicación**
   - Vistas MVC: http://localhost:8080/details
   - API REST: http://localhost:8080/api/details

## Endpoints Disponibles

### Controlador MVC (UserController)
- **GET /details** - Retorna una vista HTML con los detalles del usuario

### API REST (UserRestController)
- **GET /api/details** - Retorna los detalles del usuario en formato JSON

## Notas de Aprendizaje

Este proyecto es ideal para aprender:
- Conceptos básicos de Spring Boot
- Cómo crear y estructurar una aplicación web con Spring
- La diferencia entre controladores MVC tradicionales y REST
- Inyección de dependencias
- Uso de plantillas dinámicas con Thymeleaf
- Gestión de modelos y transferencia de datos con DTOs

---

**Desarrollado como parte de un curso de Spring Framework**
