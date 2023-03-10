import kotlinx.coroutines.*
abstract class AbstractProduct(val name: String, var price: Double,val unit: String, val category: String, var count: Int ): InterfaceProduct {
    override suspend  fun Function1(){
        delay(3000)
        println("Название - $name" +
                "\nЦена - $price" +
                "\nЕдиницы измерения - $unit" +
                "\nВид товара - $category" +
                "\nКоличество - $count")
    }
    abstract override suspend fun Function2(n: Int)
}