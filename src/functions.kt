fun main(){

//    default function
    fun displayName(){
        println("I am default function")
    }
//    displayName()

//    parameterized function
    fun sum(a:Int , b:Int){
        val c = a+b
        println("sum of $a and $b is $c")
    }
    sum(10,20)


//    functions with return type
    fun returnNothing():Unit{
        println("I am ddefault func with Unit/void return type")
    }
//    returnNothing()

//    functions with block body
    fun returnSum(a: Int, b: Int): Int {
        return a + b
    }

//    functions with expression body
    fun returnMul(a:Int, b:Int) = a*b

    println("Sum of 2 digits are ${returnSum(60,9)}")


//    another syntax to initialize functions

    fun anotherSyntax()= print("I am function with modified syntax")
//    anotherSyntax()


}
