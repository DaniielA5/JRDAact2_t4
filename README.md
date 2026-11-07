# JRDAact2_t4: MVC con Thymeleaf, DTOs y parámetros en Spring Boot

Actividad 2 del Tema 4 de Programación Web. **Autor:** Daniel Juárez

**Autor:** Daniel Juárez

## Tecnologías
- Java 21
- Spring Boot 4.1.2 (Spring Web MVC)
- Thymeleaf
- Maven (wrapper incluido)

## Endpoints

| Método | Ruta | Controlador | Tipo | Respuesta |
|---|---|---|---|---|
| GET | `/proyecto` | `ProyectoController` (`@Controller`) | Vista HTML | Nombre, proyecto y materia |
| GET | `/materias` | `MateriasController` (`@RestController`) | JSON | Lista de materias del semestre |
| GET | `/materias/total` | `MateriasController` (`@RestController`) | Número | Total de materias |

**En línea:** http://165.22.188.79:8081/proyecto

## Ejecutar en local

```bash
.\mvnw.cmd spring-boot:run
```

Disponible en `http://localhost:8080/proyecto`.

## Generar el JAR

```bash
.\mvnw.cmd clean package
```

El archivo queda en `target/demoactividaduno-0.0.1-SNAPSHOT.jar`.

## Despliegue en el VPS

```bash
scp target/demoactividaduno-0.0.1-SNAPSHOT.jar USUARIO@IP_DEL_VPS:~/jrda_act1/jrda_act1.jar
nohup java -jar jrda_act1.jar --server.port=8081 > app.log 2>&1 &
```

Se usa el puerto 8081 porque el VPS es compartido; el 8082 es de mi compañero.