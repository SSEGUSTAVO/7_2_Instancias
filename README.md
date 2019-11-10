# Lección 7_2 Instanciación de objetos

En ésta lección se enseña a realizar la instanciación de objetos para crear varios objetos a partir de una clase de objeto.
El ejercicio consiste en crear una clase prisionero, dónde se deben ingresar los siguientes datos para cada prisionero: Nombre, altura, sentencia y palabras al momento del arresto.
Se diseñó el programa "registro" para el ingreso de nuevos prisioneros y el programa "prisionero" para crear al objeto prisionero.
Se insertaron dos diferentes prisioneros.



Posteriormente se solicita cambiar los datos de uno de los prisioneros para que coincida la información de ambos prisioneros. Se realiza y se observa que se crearon dos prisioneros diferentes con los mismos datos.



Nuevamente se solicita modificar el programa esta vez definiendo la variable de referencia como igual para ambos prisioneros y modificando los datos para que la información de cada uno sea diferente. 
Se observa que al declarar las variables como igual, el programa sólo crea una instancia del objeto existiendo sólo un prisionero.



Esta vez se solicita crear dos prisioneros con los mismos datos, probar la expresion booleana == para ambos prisioneros y posteriormente imprimir el valor de cada prisionero.
Se observa que aún con los mismos datos de prisionero, mientras su nombre de etiqueta sea diferente, los datos de cada uno se almacenan en diferentes bloques de memoria creando así dos prisioneros diferentes.

