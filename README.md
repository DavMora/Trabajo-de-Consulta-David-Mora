1. Introducción

En este proyecto se implementa el método de integración numérica de Simpson 1/3 utilizando funciones de orden superior en Scala.
El objetivo principal es demostrar cómo una función puede recibir otra función como parámetro y calcular la aproximación de una integral definida sin necesidad de resolverla de forma analítica.

Este modelo es común en programación funcional, donde las funciones son tratadas como valores y permiten crear soluciones más flexibles y expresivas.

 2. ¿Qué es una Función de Orden Superior?
    

Una función de orden superior es aquella que:

*recibe una o más funciones como argumentos,

*y/o retorna una función como resultado.

Este tipo de funciones permite separar la lógica de un proceso del comportamiento específico que se usa en cada caso.

En nuestro caso, la función integracion recibe:


*una función matemática f(x)

*el límite inferior de integración

*el límite superior de integración


permitiendo integrar cualquier función sin modificar el algoritmo base.

 3. Fundamento Matemático del Método Simpson 1/3
    

El método de Simpson 1/3 es una técnica de integración numérica que aproxima el área bajo la curva de una función usando una parábola. Es más preciso que el método del rectángulo o el trapecio y requiere solo tres evaluaciones de la función.

La fórmula de Simpson 1/3 es:

<img width="476" height="76" alt="image" src="https://github.com/user-attachments/assets/e46e4a6f-0072-44c8-8d21-d47d21d95514" />
​

donde:

<img width="218" height="86" alt="image" src="https://github.com/user-attachments/assets/78c7657b-3f3d-42e9-8c99-c548f5973dea" />

	
Conceptos clave:

*f(a): valor de la función en el límite inferior

*f(b): valor de la función en el límite superior

*f(\bar{x}): valor de la función en el punto medio

*b − a: longitud del intervalo

*División entre 6: parte de la fórmula derivada del método parabólico

*Simpson 1/3 es exacto para funciones polinómicas de hasta cuarto grado y tiene muy buena precisión para funciones suaves.

4. Conclusiones

El método de Simpson 1/3 se demuestra como una herramienta eficiente para aproximar integrales definidas utilizando muy pocas evaluaciones de la función.
Su integración con funciones de orden superior en Scala permite:

*escribir código modular

*separar la lógica del algoritmo del comportamiento matemático

*reutilizar la misma función para diferentes integrales

*mejorar la legibilidad y expresividad del programa

Este proyecto refuerza el uso de programación funcional en problemas matemáticos y demuestra la potencia de Scala en este tipo de aplicaciones.
