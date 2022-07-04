fun main(){
//    if else conditionals
    val a = 10
    val b = 0

    if(b<=0){
        println("Denominator is zero or negative")
    }
    else{
        println(a/b)
    }

//    if else if / nested if conditionals
    val num = 7

    if (num==0){
        println("number is zero")
    }
    else if (num>0){
        println("number is positive")
    }
    else{
        println("number is negative")
    }

//    switch / when conditionals
    val condition = 4
    when(condition){
        1-> println("one")
        2-> println("two")
        3-> println("three")
        4-> println("four")
        else->println("none of the above")
    }

    val no = -2
    when{
        no>0 -> println("number is +ve")
        no<0 -> println("number is -ve")
        else -> println("number is 0")

    }

//    logical operators (|| , &&) with conditionals
//    OR operator
    val num2 = 0
    if(num2>0 || num2<0){
        println("num is non zero")
    }
    else{
        println("num is zero")
    }

//    AND operator
    val num3 = 6
    if(num3>=0 && num3<=5){
        println("num3 is between 0-5")
    }
    else if(num3>5){
        println("num3 is greater than 5")
    }
    else{
        println("num3 is less than 0")
    }

//    NOT operator with OR operator
    val num4 = 0
    if(!(num4>0 || num4<0)){
        println("num is 0 but due to not operator, num is non zero")
    }
    else{
        println("num is zero")
    }

//    check whether a number belongs to a particular range
    val numb = 21
    when(numb){
        in 1..10 -> println("Number lies between 1-10")
        in 11..20 -> println("Number lies between 11-20")
        in 21..30 -> println("Number lies between 21-30")
        else -> println("Number is out of above range")
    }

}