fun main(){
    var str = "Arsh Sharma"
    var str2 = "Arsh Sharma"
    var str3 = "arsh Sharma"

    // returns length of the string
    println("length of the string is ${str.length}")
    // returns the sub string of the main string from index 2-7
    println("subsequence of the string is ${str.subSequence(2,8)}")
    // tells whether 2 string s are equal/same or not
    println("str and str2 are equal : ${str.equals(str2)}")
    println("str and str3 are equal : ${str.equals(str3)}")
    // compares 2 string according to their ASCII values
    println("str and str3 are  : ${str.compareTo(str3)}")
    println("str and str3 are  : ${str.compareTo(str2)}")
    // returns element at given index
    println("at index 2 of str is : ${str.get(2)}")
    println("at index 3 of str is : ${str[3]}")



}