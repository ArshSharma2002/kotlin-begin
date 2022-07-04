// In inheritance there are 2 kind of classes 
// 1. base class
// 2. derived class
// in Kotlin , base class is initialized by "open" keyword + normal class declaration


// parent/base/super class
// "open" keyword is used whenever you want to reuse/inherit any class/func
open class InheritanceBasics(var color:String, var age:Int){

    fun eat(){
        println("I am eating")
    }

    fun sleep(){
        println("I am sleeping")
    }

    // here we mentioned "open" because we want to override this func.
    open fun sound(){
        println("I make sounds")
    }
}

// child/sub/derived classes
class Dog(color:String, age:Int):InheritanceBasics(color,age) {

    fun bark(){
        println("I am barking...")
    }

    // "override" keyword is used whenever we want to override any function in child class that is already defined in parent class
    override fun sound(){
        println("I make dog's sound")
    }
    
}

class Cat(color:String, age:Int):InheritanceBasics(color,age) {

    fun meow(){
        println("I am meow...")
    }

    override fun sound(){
        println("I make cat's sound")
    }
    
}


fun main(){

    val sherry = Dog("black",4)
    sherry.bark()
    sherry.eat()
    sherry.sleep()
    sherry.sound()

    val bella = Cat("white",3)
    bella.meow()
    bella.eat()
    bella.sleep()
    bella.sound()

}