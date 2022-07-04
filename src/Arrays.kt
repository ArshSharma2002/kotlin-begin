fun main(){
//    two types of arrays
//    1. var type
//    2. val type

//    Four methods to initialize an array in kotlin

    var charArr:Array<Char> = arrayOf('a','b','c','d','e')

    var charArr2 = arrayOf<Char>('l','m','n','o','p')

    val charArr3 = arrayOf('u','v','w','x','y')

    var charArr4:Array<Char>
    charArr4 = arrayOf('A','B','C','D','E')

    // this is possible, we can inter change two arrays with same size and initialized with Var (i.e. mutable) .
    // we can change the individual elements of an array whether its initialized with Var or Val .
    // in kotlin , once we declare an array we can change its element/content but not its size .
    // size will be fixed once you declare an array .
    charArr = charArr2

    // another method to initialize an array,it is a mixed array of elements with different datatype .
    // that's why its datatype is <Any>
    var mixedArray: Array<Any> = arrayOf('a',12,6.8,"harsh",true)


}
