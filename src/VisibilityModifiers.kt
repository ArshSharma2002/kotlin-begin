// 1. Private
// When we don't want another class to change the
// value of the variable of a class. This is also known as
// data hiding.

// 2. Protected
// When we need to hide data inside a class, we use this
// visibility modifier.

// 3. Public
// Used for declaring functions.

// 4. Internal
// Used in large software, where multiple modules are
// present.

public fun display1(){
    println("display outside class in public")
}

// "protected" modifiers are not for top level function
// protected fun display2(){
//     println("display outside class in public")
// }

private fun display3(){
    println("display outside class in public")
}

internal fun display4(){
    println("display outside class in public")
}

class VisibilityModifiers{

    public fun show1(){
        println("show in public")
    }

    protected fun show2(){
        println("show in public")
    }


    private fun show3(){
        println("show in public")
    }

    internal fun show4(){
        println("show in public")
    }


}

fun main(){

    val obj = VisibilityModifiers()
    obj.show1()
    // these are functions with protected and private modifiers.
    // obj.show2()
    // obj.show3()
    obj.show4()

}