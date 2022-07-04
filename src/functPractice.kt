import kotlin.math.max

fun main(){
//   module 2 ,  cp 5
    println(timesThree(4))
    println(timesFour(4))

//   module 2 , cp 6
    println("sum of 10 and 5 is ${sum(10,5)}")
    println("difference of 10 and 5 is ${diff(10,5)}")
    println("product of 10 and 5 is ${mul(10,5)}")
    println("div of 10 and 5 is ${div(10,5)}")

//    module 2 , cp 7
    println("user defined func max number is ${findMax(12,15)}")

    println("in-built func max number is ${max(12,17)}")
}

fun timesThree(x:Int):Int{
    return x*3
}

fun timesFour(x:Int) =  x*4


fun sum(a:Int,b:Int):Int{
    return a+b
}

fun diff(a:Int,b:Int) = a-b

fun mul(a:Int,b:Int):Int{
    return a*b
}

fun div(a:Int,b:Int) = a/b

fun findMax(a:Int,b:Int):Int{
    if(a>b){
        return a
    }
    return b
}