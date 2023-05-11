// Descrição: Programa que converte uma temperatura de um padrão a outro usando fórmulas.

fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", { 9.0 / 5.0 * it + 32 })
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
