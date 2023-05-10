# Prueba Automatización Pragma
Este proyecto contiene la automatización de la pagina YourStore

## **Requisitos**
Para este proyecto, se necesitará:

**Windows**
> - Java 11
> - Gradle para compilar el proyecto.
> - Configuración de SonarQube.

## **¿Cómo correr el proyecto?**

Para ejecutar el proyecto se deben seguir los siguientes pasos:

**Windows**
1. Abrir una consola de comandos o terminal en tu equipo dentro de la carpeta del proyecto.
2. Ejecutar el siguiente comando en la terminal:

`.\gradlew clean test aggregate`

**Ubuntu**
1. Abrir una consola de comandos o terminal en tu equipo dentro de la carpeta del proyecto.
2. Ejecutar el siguiente comando en la terminal:

`./gradlew clean test aggregate`

## Escenarios Automatizados
1. Agregar productos al carrito
2. Inicio de sesion 
## **Estructura de las carpetas - Patrón ScreenPlay**

**main/java/com/pragma**


> - _questions:_ Contiene las clases que incluyen preguntas claves para cada test case.
> - _tasks:_ Contiene las clases con métodos que realizan tareas específicas dentro del sistema, lo cual nos permitiría reutilizar la lógica sí es necesitarlo.
> - _ui:_ Contiene los todos los localizadores de la pagina que vamos a utilizar
> - _utils:_ Contiene las clases con métodos que nos realicen procesos que son comunes pero utiles.

**test/java/com/pragma**
> - _runners:_ Clases para correr los test cases.
> - _setup:_ Clases para configuraciones.
> - _stepdefinitions:_ Clases con la ejecución de los pasos definidos en los feature .

**test/resources/features**
> - _features:_ Contiene los gherkin con la definición de los casos de prueba en un lenguaje natural.
