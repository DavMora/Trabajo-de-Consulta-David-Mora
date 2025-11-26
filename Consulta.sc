// METODO DE SIMPSON
def integracion(f: Double => Double, a: Double, b: Double): Double =
  val xMedio = (a + b) / 2
  val numerador = f(a) + 4 * f(xMedio) + f(b)
  (b - a) * numerador / 6

// Funciones de las integrales

// 1
val f1 = (x: Double) => -x*x + 8*x - 12
val r1 = integracion(f1, 3, 5)

// 2
val f2 = (x: Double) => 3 * x * x
val r2 = integracion(f2, 0, 2)

// 3
val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*x*x*x*x
val r3 = integracion(f3, -1, 1)

// 4
val f4 = (x: Double) => (2*x + 1) / (x*x + x)
val r4 = integracion(f4, 1, 2)

// 5
val f5 = (x: Double) => math.exp(x)
val r5 = integracion(f5, 0, 1)

// 6
val f6 = (x: Double) => 1 / math.sqrt(x - 1)
val r6 = integracion(f6, 2, 3)

// 7
val f7 = (x: Double) => 1 / (1 + x*x)
val r7 = integracion(f7, 0, 1)

// Función para calcular error absoluto
def error(valorEsperado: Double, valorObtenido: Double): Double =
  math.abs(valorEsperado - valorObtenido)

// Errores de cada aproximación
val e1 = error(7.33, r1)
val e2 = error(8.0, r2)
val e3 = error(3.333, r3)
val e4 = error(1.09861, r4)
val e5 = error(1.71828, r5)
val e6 = error(0.828427, r6)
val e7 = error(0.785398, r7)



