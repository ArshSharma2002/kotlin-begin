fun main() {

//    factorial number
    var num = 7
    var facto = 1
    while(num>=1){
        facto = facto*num
        num = num - 1
    }
    print("factorial of 7 is $facto")

//    factorial using recursion

    fun fact(numb:Int):Int{
        var num = numb
        while(num>=1){

            if(num==1){
                return 1
            }
            return num*fact(num-1)
        }
        return 0
    }


//    fibonacci series
    var i = 0
    var j = 1
    var k = 0
    print("$i, $j")
    for (r in 1..8) {
        k = i + j
        print(", $k")
        i = j
        j = k
    }

//    fibonacci using recursion
    fun fib(numb:Int):Int{
        var num = numb
        while(num>=0){
            if(num==1 || num==0){
                return num
            }

            return fib(num-1) + fib(num-2)
        }
        return 0
    }

}

