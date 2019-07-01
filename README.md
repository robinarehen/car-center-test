# Car Center Test
Prueba para el cargo de desarrollador Java

# Creación del Modelo Entidad Relación

1. Se crea el modelo solicitado en la pagina: https://www.draw.io/

2. Se publica en la carpeta **documents** la fase 1 del modelo entidad relación **MER**, en el cual se cubre la creación de : 
   * Mecanicos.
   * Clientes
   * Usuarios.
   * El manejo de roles y permisos
   * Los clientes puedan registrar sus vehiculos.
   
   
# Creación de La Aplicación Web

1. Apache Maven 3.5.3 para la administración de las dependencias
2. Eclipse Spring Tool Suite sts-4.2.1.RELEASE ide de desarrollo
3. Spring boot 2.1.6.RELEASE [https://start.spring.io/] Framework para el desarrollo en Java
4. Tymeleaf [https://www.thymeleaf.org/] para la administración de las paginas html
5. Metrialize [https://materializecss.com/] para el diseño web

## Probar la Aplicación

1. clonar el proyecto o descargara la carpeta **car-center-test**.
2. mediante la consola o terminal ingresar a la carpeta y ejecutar el comando  **mvn clean package** para que sean descargadas las librerias necesarias para el proyeto mediante **MAVEN**
3. dentro de la carpeta ejecutar el comando **mvn spring-boot:run** para iniciar el proyecto, si termina sin error se podra ingresar a la siguiente url http://localhost:8080/ el puerto **8080** debe estar libre.
4. Para registrar un cliente se debe ingresar a la opción **Sing up** http://localhost:8080/cliente/crear
5. Para ingresar a la aplicación se debe ingresar a la opción **Login** http://localhost:8080/login
6. Un vez se ha realizado el registro y login el cliente puede actualizar sus datos en la opción **Profile** http://localhost:8080/cliente/modificar
