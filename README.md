# Conversor de monedas 💰🏦💲💱
<p>
  Este programa es un conversor de monedas basado en Java que permite convertir valores entre varias monedas utilizando una API externa para obtener las tasas de cambio actualizadas. Además, genera un archivo JSON con los datos de cada conversión realizada.
</p>
<h2> Funcionalidades </h2>
<ul> •	Conversión entre monedas como USD, BOB, BRL, CAD y EUR. </ul>
<ul> •	Obtención en tiempo real de las tasas de cambio mediante una API. </ul>
<ul> •	Almacenamiento de las conversiones realizadas en un archivo JSON. </ul>
<h2> Requisitos previos </h2>
<p> Antes de comenzar, asegúrate de tener instalado lo siguiente: </p>
<ul> •	Java JDK 17 o superior </ul>
<ul> •	Un IDE como IntelliJ IDEA, Eclipse o Visual Studio Code. </ul>
<ul> •	Conexión a Internet (para las consultas a la API). </ul>
<ul> •	Biblioteca externa: Gson (para trabajar con JSON).</ul>
<h2> Pasos para crear el programa </h2>
<p> 1.	Crea el proyecto Java: </p>
<ul>   1- Crea un proyecto en tu IDE e inicializa el paquete principal. </ul>
<ul>   2- Dentro del paquete, crea la clase Principal. </ul>
<ul>   3- Implementa el método main para que sea el punto de entrada del programa. </ul>
<p> 2.	Diseñar las opciones del menú </p>
<ul>   •	Implementa un menú interactivo para que el usuario seleccione el tipo de conversión. </ul>
<ul>   •	Usa un bucle while para mantener el programa en ejecución hasta que el usuario decida salir. </ul>
<p> 3.	Implementar la clase para consumir la API </p>
<ul>   1-	Crea un paquete consulta y dentro de él una clase Consulta. </ul>
<ul>   2-	Define métodos que se conecten a la API de tasas de cambio para obtener datos dinámicos. </ul>
<ul>   3-	Maneja los errores relacionados con la conexión (códigos de respuesta HTTP no exitosos). </ul>
<p> 4.	Crear la estructura de la moneda </p>
<ul>   1-	Crea un paquete moneda y dentro de él una clase Moneda. </ul>
<ul>   2-	Utiliza un record en Java para estructurar los datos de cada moneda, incluyendo: </ul>
<ul>     •	base_code: Código de la moneda base. </ul>
<ul>     •	target_code: Código de la moneda destino. </ul>
<ul>     •	conversion_rate: Tasa de conversión. </p>
<p> 5.	Generar un archivo JSON con cada conversión </p>
<ul>   1-	Crea un paquete generador y dentro de él una clase Generador. </ul>
<ul>   2-	Usa la biblioteca Gson para convertir los datos de la moneda en un archivo JSON. </ul>
<ul>   3-	Implementa un método que guarde cada archivo con un nombre basado en las monedas convertidas, por ejemplo: USD_BOB.json. </ul>
<p> 6.	Ejecutar y probar el programa </p>
<ul>   1-	Ejecuta el programa desde tu IDE. </ul>
<ul>   2-	Prueba las diferentes opciones del menú ingresando valores y observando los resultados. </ul>
<ul>   3-	Revisa los archivos JSON generados en el directorio del proyecto para confirmar su creación. </ul>
<h2> Estructura del proyecto </h2>
<p>Clases principales:</p>
<ul> Principal.java: Es el punto de entrada del programa. Maneja la lógica principal del flujo de la aplicación. </ul>
<ul> Consulta.java: Realiza las consultas a la API para obtener la tasa de cambio. </ul>
<ul> Moneda.java: Representa las monedas y su tasa de conversión. </ul>
<ul> Generador.java: Crea un archivo JSON con los datos de la conversión. </ul>
<h2> Créditos </h2>
<p> Este proyecto utiliza la API ExchangeRate-API y la biblioteca Gson. </p>
<p> ¡Con este README puedes construir y ejecutar el programa desde cero! 🚀 </p>
