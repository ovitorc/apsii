class Aplicativo(
    val nome: String,
    val categoria: Int,
    val idadeMinima: Int,
    val avaliacao: Double,
){
    fun informacoes(){

        val nomeCategoria = when (categoria){
            1 -> "Jogos"
            2 -> "Educação"
            3 -> "Finanças"
            4 -> "Entretenimento"
            else -> "Categoria inválida"
        }

        val classificacao = if (avaliacao >= 7 && avaliacao <= 10){
            println("Excelente")
        } else if (avaliacao >= 5 && avaliacao < 7){
            println("Regular")
        } else if (avaliacao >= 0 && avaliacao < 5){
            println("Ruim")
        } else {
            println("Avaliação inválida")
        }

        println("Aplicativo: $nome")
        println("Categoria: $categoria")
        println("Idade: $idadeMinima")
        println("Avaliacao: $avaliacao")
        println()
    }
}

fun main(){

    val aplicativo1 = Aplicativo("GTA", 1, 12, 8.5)
    val aplicativo2 = Aplicativo("Minecraft", 2, 6, 9.5)
    val aplicativo3 = Aplicativo("Roblox", 3, 5, 3.5)

    val aplicativos = arrayOf(aplicativo1, aplicativo2, aplicativo3)

    for(aplicativo in aplicativos){
        aplicativo.informacoes()
    }

}