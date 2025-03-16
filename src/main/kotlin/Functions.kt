package org.example

class Functions {
    fun isOdd(n: Int): Boolean{
        return n%2 != 0
    }

    // #1 algoritmo que realize n iterações
    fun nint(n: Int) {
        for (i in 0..<n){
            println(i)
        }
    }


    // #2 algoritmo que imprime apenas os ímpares
    fun nintOdd(n: Int) {
        for (i in 0..<n){
            if(isOdd(i)){
                println(i)
            }
        }
    }


    // #3 retorna soma caso ambos sejam pares, multiplicação do contrário
    fun sumEven (x: Int, y: Int): Int{
        if (!isOdd(x) && !isOdd(y)){
            return (x + y)
        }
        return (x * y)
    }

    // #4 verifica o primeiro parâmetro e retorna uma operação
    fun cases (x: Int, y: Int): Float{
        if(x > 999){
            if (x > y){
                return (x - y).toFloat()
            }
            return (y - x).toFloat()
        }

        if (x > 99){
            if (x > y){
                return (x / y).toFloat()
            }
            return (y / x).toFloat()
        }

        if(x > 9){
            return (y + x).toFloat()
        }

        return (x * y).toFloat()
    }
}