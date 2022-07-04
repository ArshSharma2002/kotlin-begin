// Interfaces are similar to classes but they do not have a state. So, they do not have constructors as well.
// They can have functions with or without default implementations. That is, the function definition may not necessarily have to be there.
// They are declared by using the keyword 'interface'.

interface myInterface{

    // function without body/implementation
    fun switchOff()  

    // function with body/implementation
    fun display(){
        println("I am display")
    }
}

interface myInterface2{

    // function with body/implementation
    fun display2(){
        println("I am display2")
    }
}

class InterfacesBasics:myInterface, myInterface2{

    override fun switchOff(){
        println("I am switing off")
    }

}

fun main() {
    val obj = InterfacesBasics()
    obj.switchOff()
    obj.display()
    obj.display2()
}