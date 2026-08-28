class Pessoa(
    val nome: String,
    val idade: Int
){
    fun saudacao(){
        println("Olá, meu nome é $nome e tenho $idade anos")
    }
}

fun verificarIdade(idade: Int){
    if(idade in 0..17){
        println("Menor de idade")
    } else {
        println("Maior de idade")
    }
}

fun main(){
    val pessoa1 = Pessoa("Joana", 14)
    val pessoa2 = Pessoa("Paulo", 23)
    val pessoa3 = Pessoa("Catarina", 18)

    pessoa1.saudacao()
    verificarIdade(pessoa1.idade)

    pessoa2.saudacao()
    verificarIdade(pessoa2.idade)

    pessoa3.saudacao()
    verificarIdade(pessoa3.idade)
}
