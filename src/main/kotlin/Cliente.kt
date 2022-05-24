class Cliente(private var nome: String) {

    private var endereço = ""
    private var telefone = ""
    var listaDeCompra = mutableListOf<String>()


    constructor(nome: String, endereço: String) : this(nome) {
        this.endereço = endereço
    }

    constructor(nome: String, endereço: String, telefone: String)
            : this(nome, endereço) {
        this.telefone = telefone
    }


    init {

        if (nome == "") {
            throw Exception("A classe foi instanciada incorretamente!")
        }
    }

    fun addProduto(produto: String) {

        if (produto != "") {
            listaDeCompra.add(produto)
            println("Produto adicionado a lista de compras!")
        } else {
            println("Produto inválido!")
        }
    }

    fun excluirProduto(produto: String) {
        if (listaDeCompra.contains(produto)) {
            listaDeCompra.remove(produto)
        } else {
            println("Produto não existe na lista")

        }
    }

    fun exibirProdutos() {
        listaDeCompra.forEach() {
            println(it)
        }
    }
}