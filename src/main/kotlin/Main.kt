package org.example

fun main() {
    // ALUNO: LUIS AFONSO MINEO

    // Instância da classe Functions, que contém as soluções dos exercícios #1 ao #4
    val exercicios = Functions()

    println("====================================")
    println("==== Operações simples #1 -> #4 ====")
    println("====================================")

    println()

    // #1
    println("#1 Print do índice de n iterações")
    exercicios.nint(10)
    println("---------------------------")
    // #2
    println("#2 Print do índice dos valores ímpares de n iterações")
    exercicios.nintOdd(13)
    println("---------------------------")
    // #3
    println("#3 Soma se ambos pares, multiplicação para o contrário")
    println("SOMA")
    println(exercicios.sumEven(14, 12))
    println("-----")
    println("MULTIPLICAÇÃO")
    println(exercicios.sumEven(11, 14))
    println("---------------------------")
    // #4
    println("#4 Operações com dois números")
    println("MILHAR")
    println(exercicios.cases(1304, 243))
    println("-----")
    println("CENTENA")
    println(exercicios.cases(137, 654))
    println("-----")
    println("DEZENA")
    println(exercicios.cases(45, 79))
    println("-----")
    println("UNIDADE")
    println(exercicios.cases(4, 227))
    println("---------------------------")

    println()

    println("=====================================================")
    println("==== Operações com relação ao contexto: LIVRARIA ====")
    println("=====================================================")

    println()

    // Criacao de uma lista com várias instâncias da classe Book
    val bookList = listOf(
        Book("O Senhor dos Anéis", "J.R.R. Tolkien", 50.0),
        Book("O Rei do Inverno", "Bernard Cornwell", 45.50, 0.15),
        Book("Dom Casmurro", "Machado de Assis", 29.90, 0.05),
        Book("1984", "George Orwell", 39.90)
    )

    // Usando o metodo para aplicar desconto da classe de livros
    println("#5 Aplicando desconto sobre o valor do livro")
    bookList[0].applyDiscount("DESCONTOLIVRO")
    println("---------------------------")

    // Iterando sobre a lista de livros e imprimindo-os
    println("#6 Iterando sobre a lista de livros")
    println("==== CATÁLOGO DE LIVROS ====")
    for (book in bookList) {
        book.displayDetails()
    }
}