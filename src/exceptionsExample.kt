import java.util.*

fun main(){
//    there are majorly 3 types of exceptions
//    1. Arithmetic
//    2. ArrayIndexOutOfBound
//    3. NullPointer


//    example of Arithmetic exception
    val a = 5
    val b = 0
    try{
        println("this is try block statement before exception")
        val c = a/b
        println("this is try block statement after exception")

    } catch(e:Exception){
        println("$e" + " : this is catch block")
    } finally{
        println("this is finally block")
    }

//    example of ArrayIndexOutOfBound
    val arr:Array<Int> = arrayOf(1,2,3,4,5)
    try{

        arr[5] = 6
        println(Arrays.toString(arr))
    }catch(e:ArrayIndexOutOfBoundsException){
        println("$e" + " : this is catch block")
    }

//    example of nullPointer
    val nullvar: Int? = null

    // here "nullVar?" is safe-call , when we don't know whether a variable is gong to be null or not.
    // "nullVar!!" is a non-null call is when we don't want any variable to be null.
    // " ?: " this is elvis operator , used when we want to give a message or default value to a null variable.
    println(nullvar ?: "this is null")

    // printing values of lists/arrays without null values
    val arr1 = arrayOf(1,2,null,4,null,6)
    val list1 = listOf("one","two",null,"four",null,"six")

    println("the arr1 without null values is ${arr1.filterNotNull()}")
    println("the arr1 without null values is ${list1.filterNotNull()}")


}