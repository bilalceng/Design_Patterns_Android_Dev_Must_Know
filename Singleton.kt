/**
 * We can construct singletons in [kotlin]  with objects and companion objects.
 * Thanks to this pattern we can use just single instance of our object across all of our app.
 */
object Singleton {
    fun singletonMethod() :Singleton = this
}

class NormalClass{
    fun normalMethod() = this
    companion object{
        fun companionMethod() = this
    }
}

fun main(){

    var instanceOne = Singleton.singletonMethod()
    var instanceTwo = Singleton.singletonMethod()
    //the "instanceOne" and "instanceTwo" is gie same instance respectively address always Singleton@5674cd4d === Singleton@5674cd4d
    println(instanceTwo)
    println(instanceOne)
    println(instanceTwo === instanceOne)//always true

    var normalClassOne = NormalClass().normalMethod()
    var normalClassTwo = NormalClass().normalMethod()
    //following expression gives false.
    println(normalClassOne === normalClassTwo) // false

    //this is also gives true. Because, As I said, we can construct singletons
    // with objects and companion objects in [kotlin].
    var normalClassOneC = NormalClass.companionMethod()
    var normalClassTwoC = NormalClass.companionMethod()
    println(normalClassOneC === normalClassTwoC)//always  true
}