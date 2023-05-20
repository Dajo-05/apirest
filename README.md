# apirestjvn

## Importar la base de Datos

## NOTA IMPORTANTE: el gestor de base de datos sado fue MYSQL lo cual debe  TENER INSTALDO MYSQL O MARIADB, para poder usar la base datos.
1) abrir el adminsitrador de base datos.

2) crear una base datos llamda pruebajvn.

3)la opcion de importar  en su adminsitrador de base de datosss, luego busacar el archivo pruebajvn.sql que se encunetra dentro de la raiz del proyecto  frontempleados.


## inicair proyecto

1) Abrir el proyecto desde el IDE Apache Netbeans, o desde su IDE preferido

NOTA: se recomienda abrir el proyecto dede Apache Netbeans, porque fue el IDE en el cual se desarrollo, pero de igaul funciona en cualquier IDE.

2) navegar hasta la carpeta other sources/src/main/resources hatsa la crpeta que dice  <default pakage>, y abrir el aarchivo llamado application.properties y editarlo, salgra algo asi:

spring.jpa.database=MYSQL
spring.datasource.plataform=mysql
spring.datasource.url= jdbc:mysql://localhost:3306/pruebajvn
spring.datasource.username=root
spring.datasource.password=omega0418
spring.jpa.show-sql=true
spring.main.allow-circular-references=true

- se debe editar y agregar la url de la base de  aqui : datosspring.datasource.url= "Aqui url de la base de datos" 

- se debe editar y agregar el usuario  de la base de  aqui : spring.datasource.username= "Aqui usuer de la bd"

- se debe editar y agregar el contraseña   de la base de  aqui : spring.datasource.password="Aqui Contraseña de la bd"

NOTA: el nombre del user, el password y la url  debe ir sin comillas

3) Si el proyecto se abre desde Apache Netbeans dar click drecho sobre el nobre del proyecto y buscar la opcion que dice Clean and Build para cargar las dependencias del proyecto. En caso de usar otro IDE buscar la opcion que permite sincronizar las dependencias de maven.

4) Correr el proyecto




