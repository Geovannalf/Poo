fun main(args: Array<String>) {

    while (true) {
        println("Digite seu nome: ")
        val nome = readLine()
        println("Digite seu endereço: ")
        val endereço = readLine()
        println("Digite seu telefone: ")
        val telefone = readLine()

        try {
            val cliente = Cliente(nome.toString(), endereço.toString(), telefone.toString())

            while (true) {

                println("\n***Opções***")
                println("1 - Adicionar")
                println("2 - Remover")
                println("3 - Exibir")
                println("4 - Sair\n")

                print("Opção: ")
                val opc = readLine()?.toInt()

                when (opc) {
                    1 -> {
                        println("Digite um item para adicionar: ")
                        val produto = readln()
                        cliente.addProduto(produto)
                    }
                    2 -> {
                        println("Digite um item para remover: ")
                        val produto = readln()
                        cliente.excluirProduto(produto)
                    }
                    3 -> {
                        println("Lista")
                        cliente.exibirProdutos()
                    }
                    4 -> break

                }
            }


        }catch (e:Exception){
            println(e.message)
        }
    }

}


