import scala.io.StdIn.readLine
import scala.util.Random

object AdivinarNumero {

  // Función para verificar el número
  def verificar(numeroSecreto: Int, intento: Int): String = {
    if (intento < numeroSecreto) {
      "Muy bajo"
    } else if (intento > numeroSecreto) {
      "Muy alto"
    } else {
      "Correcto"
    }
  }

  def main(args: Array[String]): Unit = {
    val numeroSecreto = Random.nextInt(10) + 1
    var adivinado = false

    println("Adivina el número (1-10)")

    while (!adivinado) {
      print("Ingresa tu número: ")
      val intento = readLine().toInt

      val resultado = verificar(numeroSecreto, intento)
      println(resultado)

      if (resultado == "Correcto") {
        adivinado = true
      }
    }

    println("¡Ganaste!")
  }
}