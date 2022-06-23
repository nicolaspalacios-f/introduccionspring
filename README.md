# Taller spring ARSW

## Nicolas Palacios

## 22/06/2022

### En que consiste el proyecto?

El proyecto consiste en la creacion de el juego de picas y famas y subirlo a heroku. este proyecto fue realizado en 4 horas con un total de 380 lineas.

LOC/H = 95

Comando utilizado para ejecutar servidor web: mvn sprint-boot:run



Para ingresar a la pagina principal se ingresara a http://localhost:5000
El link de heroku es el siguiente:
https://getpostarsw.herokuapp.com/
Nos saldran 4 opciones
<img src= imagen\imagen.png>

Greeting:

<img src= imagen\imagen2.png>

Server Status:
<img src= imagen\imagen3.png>

POST:
<img src= imagen\imagen4.png>

Picos y Famas:

<img src= imagen\imagen6.png>

### Diagrama de Clases

<img src="imagen\imagen5.png">  
 

### Documentacion

Para ver la documentacion, se debe realizar el comando mvn javadoc:javadoc, luego en target/../index.html se visualizara esta.

### Estructura de archivos

|\_**\_pom.xml  
|\_\_**src  
| |\_**\_main  
| | |\_\_**java  
| | | |\_**\_edu  
| | | | |\_\_**escuelaing  
| | | | | |\_**\_arsw  
| | | | | | |\_**\_ASE  
| | | | | | | |\_**\_app  
| | | | | | | | |ControladorJuego.java  
| | | | | | | | |Juego.java  
| | | | | | | | |WebSiteController.java  

| |\_\_**test  
| | |\_**\_java  
| | | |\_\_**edu  
| | | | |\_**\_escuelaing  
| | | | | |\_\_**app  
| | | | | | |\_\_\_\_AppTest.java