fun main(){

    var bemAvaliados = 0
    var avaliacaoRegular = 0
    var malAvaliados = 0

    for(i in 1..5){
        println("Digite a avaliação do aplicativo $i")
        val avaliacao = readln().toInt()

        when (avaliacao) {
            in 7..10 -> bemAvaliados++
            in 5..6 -> avaliacaoRegular++
            in 0..4 -> malAvaliados++
            else -> println("Avaliação inválida")

        }

    }

        println("Bem avaliados: $bemAvaliados")
        println("Avaliação regular: $avaliacaoRegular")
        println("Mal avalida: $malAvaliados")


}