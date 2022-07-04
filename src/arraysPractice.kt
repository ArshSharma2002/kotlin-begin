import java.util.*

fun main(){

    val array = arrayOf(1,2,3,4)
    println(Arrays.toString(array))


//    Create two arrays, one with the first 5 even numbers and another with first 5 odd numbers and add each element of the first array with every corresponding element of the second array.
//    module 2 , cd 9
    val even = arrayOf(0,2,4,6,8)
    val odd = arrayOf(1,3,5,7,9)

    even[0] += odd[0]
    even[1] += odd[1]
    even[2] += odd[2]
    even[3] += odd[3]
    even[4] += odd[4]

    println(Arrays.toString(even))

//    module 2 , cd 10
//    calculate length/size of an array
    val newArr = arrayOf(1,2,3,5,6,7,9,4)
    println(newArr.size)

//    module 2 , cp 12
//    Create a function in Kotlin which has a string and an array which contains the index of all the vowels present in that string. Print the array, and then calculate the sum of all the values of the array. Use the string: “I am a Kotlin programmer now”
    helper()

}

fun helper(){
    var str = "I am a Kotlin programmer now"
    var vowelIndex = arrayOf(0,2,5,8,11,16,19,22,26)
    println(Arrays.toString(vowelIndex))
    println(vowelIndex.sum())
}