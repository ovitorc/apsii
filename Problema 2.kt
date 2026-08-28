fun main(){
    println("1 - Cadastrar usuário")
    println("2 - Consultar usuário")
    println("3 - Alterar usuário")
    println("4 - Excluir usuário")
    println("5 - Sair")

    println("Escolha uma opção: ")
    val opcao = readln().toInt()

    val mensagem = when (opcao){
        1 -> println("Usuário cadastrado")
        2 -> println("R$6000.00")
        3 -> println("Usuário alterado")
        4 -> println("Usuário excluido")
        5 -> println("Saindo..")
        else -> println("Opção inválida.")
    }

    println(mensagem)
}