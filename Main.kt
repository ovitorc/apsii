fun main() {
    val nome: String = "Servidor Principal"
    val codigo: Int = 101
    val temperatura: Double = 55.0
    println("Nome do equipamento: $nome")
    println("Código: $codigo")
    println("Temperatura: $temperatura")

    if(temperatura >= 23 && temperatura <= 30)
        println("Equipamento em temperatura ideal")
    else if (temperatura <= 50)
        println("Equipamento em temperatura de atenção")
    else
        println("Equipamento em temperatura crítica")
}