# ProcesadorDeTexto

Esta es un proyecto de un curso de Java, se trata de crear un procesador de texto rudimentario utilizando Swing.

![image](https://user-images.githubusercontent.com/34726470/209587390-963e30f1-bf64-4f19-b1d9-aa4ff3adfb6b.png)

![image](https://user-images.githubusercontent.com/34726470/209587601-455ce951-4461-4359-b534-31ed36d1db31.png)

La aplicación consta de tres clases y varias imágenes que utilizo para poblar la barra de íconos.
La primera clase es la que contiene el metodo main.
La segunda clase extiende de JFrame y construye la ventana utilizando los métodos de la clase.
La tercera clase extiende de JPanel y es la encargada de generar los distintos elementos vistos en la ventana principal.
Para poblar las barras tenía dos opciones, crear los distintos elementos uno a uno o utilizar bucles, utilicé bucles pues ahorro bastantes lineas de código, y en la medida que agregue mas botones solo será necesario agragar los nuevos elementos a los arreglos. El método addPoblarBarras es el que realiza esta tarea utilizando bucles y los arreglos, en tiempo de ejecución agrega los efentos a cada elemento.
