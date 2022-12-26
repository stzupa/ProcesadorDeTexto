# ProcesadorDeTexto

Esta es una práctica de un curso de Java que realicé, se trata de crear un procesador de texto rudimentario utilizando Swing.

![image](https://user-images.githubusercontent.com/34726470/209588388-a7399aa4-816d-49a0-a1c4-9e2eab1526cc.png)

![image](https://user-images.githubusercontent.com/34726470/209587601-455ce951-4461-4359-b534-31ed36d1db31.png)

La aplicación consta de tres clases y varias imágenes que utilizo para poblar la barra de íconos.
* La primera clase es la que contiene el metodo main.
* La segunda clase extiende de JFrame y construye la ventana utilizando los métodos de la clase.
* La tercera clase extiende de JPanel y es la encargada de generar los distintos elementos vistos en la ventana principal.

Para poblar las barras tenía dos opciones, crear los distintos elementos uno a uno o utilizar bucles, utilicé bucles pues ahorro bastantes lineas de código, y en la medida que agregue mas botones solo será necesario agragar los nuevos elementos a los arreglos. 

El método addPoblarBarras es el que realiza esta tarea utilizando bucles y los arreglos, en tiempo de ejecución agrega los eventos a cada elemento.
