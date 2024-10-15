# Sistema de Conversión de Monedas

Este proyecto/challenge es un sistema de conversión de monedas que permite convertir entre diferentes monedas usando tasas de conversión actualizadas desde una API, para Alura Latam. 

## Estructura del Proyecto

- **Principal.java**: Es la clase principal que maneja la interacción con el usuario a través de la terminal.
- **ConsultaMoneda.java**: Esta clase se encarga de hacer consultas a la API para obtener las tasas de conversión.
- **ConvertirMoneda.java**: Clase que contiene la lógica para convertir cantidades de una moneda a otra.
- **Monedas.java**: Clase que representa las tasas de conversión entre dos monedas específicas.

## Uso

1. **Ejecución del programa**:
   ```bash
   javac Principal.java
   java Principal
Interacción con el usuario:

Selecciona la opción del menú que corresponde a la conversión que deseas realizar.

Ingresa la cantidad de la moneda base que deseas convertir.

El sistema mostrará la cantidad convertida a la moneda objetivo.

Funcionalidades
Conversión entre múltiples pares de monedas incluyendo USD a ARS, ARS a USD, USD a BRL, BRL a USD, USD a CLP, y CLP a USD.

Consulta de tasas de conversión actualizadas al momento de realizar la transacción.

Manejo de conversiones para monedas adicionales según la entrada del usuario.

Dependencias
Este proyecto utiliza la librería java.net.http.HttpClient para hacer consultas a la API y la librería Gson para la conversión de JSON a objetos Java.

Autor
Martin Fauci
