# Conversor de monedas
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
<p>   1- Crea un proyecto en tu IDE e inicializa el paquete principal. </p>
<p>   2- Dentro del paquete, crea la clase Principal. </p>
<p>   3- Implementa el método main para que sea el punto de entrada del programa. </p>
<p> 2.	Diseñar las opciones del menú </p>
<p>   •	Implementa un menú interactivo para que el usuario seleccione el tipo de conversión. </p>
<p>   •	Usa un bucle while para mantener el programa en ejecución hasta que el usuario decida salir. </p>
<p> 3.	Implementar la clase para consumir la API </p>
<p>   1-	Crea un paquete consulta y dentro de él una clase Consulta. </p>
<p>   2-	Define métodos que se conecten a la API de tasas de cambio para obtener datos dinámicos. </p>
<p>   3-	Maneja los errores relacionados con la conexión (códigos de respuesta HTTP no exitosos). </p>
<p> 4.	Crear la estructura de la moneda </p>
<p>   1-	Crea un paquete moneda y dentro de él una clase Moneda. </p>
<p>   2-	Utiliza un record en Java para estructurar los datos de cada moneda, incluyendo: </p>
<p>     •	base_code: Código de la moneda base. </p>
<p>     •	target_code: Código de la moneda destino. </p>
<p>     •	conversion_rate: Tasa de conversión. </p>
<p> 5.	Generar un archivo JSON con cada conversión </p>
<p>   1-	Crea un paquete generador y dentro de él una clase Generador. </p>
<p>   2-	Usa la biblioteca Gson para convertir los datos de la moneda en un archivo JSON. </p>
<p>   3-	Implementa un método que guarde cada archivo con un nombre basado en las monedas convertidas, por ejemplo: USD_BOB.json. </p>
<p> 6.	Ejecutar y probar el programa </p>
<p>   1-	Ejecuta el programa desde tu IDE. </p>
<p>   2-	Prueba las diferentes opciones del menú ingresando valores y observando los resultados. </p>
<p>   3-	Revisa los archivos JSON generados en el directorio del proyecto para confirmar su creación. </p>
