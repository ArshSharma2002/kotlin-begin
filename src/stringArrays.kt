import java.util.*

fun main(){
    var strArr = arrayOf("arsh","sharma","the","great")

    // methods to access strings/elements of an array .
    println(strArr[1])
    println(strArr.get(3))

    // array before changing
    println(Arrays.toString(strArr))

    println(strArr[2])
    strArr[2] = "is"
    strArr[1] = "bahmann"
    println(strArr[2])

    // array after changing
    println(Arrays.toString(strArr))
}