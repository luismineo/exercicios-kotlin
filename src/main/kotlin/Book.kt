package org.example

// Contexto - nome: Luis -> Livraria
// Classe Livro com construtor com valor padrão para desconto
class Book (
    private val title: String,
    private val author: String,
    private var price: Double,
    private var discount: Double = 0.15) {

    // Metodo para aplicar desconto diretamente no valor do livro
    fun applyDiscount(coupon: String) {
        when(coupon){
            "DESCONTOLIVRO" -> {
                price *= (1 - discount)
                println("Cupom aplicado com sucesso!")
                println("Novo valor: $price")
            }
            else -> print("Cupom inválido")
        }
    }

    // Metodo que imprime detalhes do livro
    fun displayDetails() {
        println("Título: $title")
        println("Autor: $author")
        println("Preço: R$ $price")
        println("Desconto: ${discount * 100}%")
        println("---------------------------")
    }
}