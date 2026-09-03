fun main(){
    val nome: String = "Vitor Carolino"
    val idade: Int = 23
    val pontuacao: Int = 10

    println("Nome do usuário: $nome")
    println("Idade do usuário: $idade")
    println("Pontuação do usuário: $pontuacao")

    if(pontuacao < 5 && pontuacao > 0)
        println("Nome: $nome / Idade: $idade / Pontuação: $pontuacao --> Usuário com baixo desempenho.")
    else if(pontuacao >= 5 && pontuacao <= 6)
        println("Nome: $nome / Idade: $idade / Pontuação: $pontuacao --> Usuário com desempenho regular.")
    else if(pontuacao > 6 && pontuacao <= 10)
        println("Nome: $nome / Idade: $idade / Pontuação: $pontuacao --> Usuário com excelente desempenho")

}