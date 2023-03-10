import kotlinx.coroutines.*
class Product(name: String, price: Double, unit: String, category: String, count: Int): AbstractProduct(name, price, unit, category, count)
{
    override suspend fun Function2(n: Int){
        runBlocking {
            repeat(n){
                launch {
                    delay(1000)
                    do {
                        println("Введите цену $name больше 0")
                        price = readLine()!!.toDouble()
                        if(price <= 0)
                            println("Неправильный ввод!Повторите попытку")
                    }while(price <= 0)
                    println("$name купили на ${price * count} рублей")
                }
            }
        }
    }
}