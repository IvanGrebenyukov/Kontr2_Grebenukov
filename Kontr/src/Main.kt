import kotlinx.coroutines.*
suspend fun main(){
    val product = Product("Молоко", 75.50, "л", "Молочные изделия", 3)
    product.Function1()
    var n: Int
    do {
        println("Введите число больше 0")
        n = readLine()!!.toInt()
        if(n <= 0)
            println("Неправильный ввод!Повторите попытку")
    }while(n <= 0)
    product.Function2(n)
}