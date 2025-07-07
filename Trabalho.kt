fun main() {
    val lembrete = mutableListOf<String>()

    while (true) {
        var cont = lembrete.size
        println()
        println("1. Cadastrar lembrete")
        println("2. Listar lembrete")
        println("3. Excluir lembrete")
        println("4. Sair")


        println()
        print("Digite uma opção:")
        val opcao = readln()

        if (opcao == "1") {
            println("Digite o lembrete:")
            val novoLembrete = readln()

            lembrete.add(novoLembrete)
            println("Lembrete '$novoLembrete' cadastrado com sucesso!")

        } else if (opcao == "2") {
            if (cont == 0) {
                print("Sem lembretes:") ///
                continue
            } else {
                println("Lista de lembretes:")
                for (i in 0 until lembrete.size) {
                    print("${i + 1} - ${lembrete[i]}")

                    println()
                }
            }
        } else if (opcao == "3") {
            if (cont == 0) {
                print("sem lembretes para deletar:") ///
                continue
            } else {
                print("Digite o número do lembrete a excluir:")
                val num = readln()
                for (i in 0 until lembrete.size) {
                    println("${i + 1}. ${lembrete[i]}")
                }
                val indice = num.toInt()
                if (indice >= 0 && indice < lembrete.size) {
                    lembrete.removeAt(indice - 1)
                    println("lembrete removido")
                } else {
                    print("numero invalido")
                }
            }
        }
        if (opcao == "4") {
            println("Encerrando programa...")
            break
        }
    }
}
