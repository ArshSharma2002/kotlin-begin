fun main(){

//    module 2 , learner activity 2
    checkRange(7)

//    module 2 , cp 1
    val a = "Internshala"
    val b = "Trainings"

//    when{
//        a.length==b.length -> println("Length is same")
//        else -> println("length is not same")
//    }

//    module 2 , cp 2
//    checkCondition(100)

//    module 2 , cp 3
    val a1 = arrayOf("Internshala", "Trainings")
    val b1 = arrayOf("Android", "App", "Developement")
//    compareArrayLength(a1, b1)

}

fun checkRange(num:Int){
    if(num in 1..10){
        println("Num is between 1-10")
    }
    else if(num in 11..20){
        println("Num is between 11-20")
    }
    else{
        println("Num is not in above range")
    }
}


fun checkCondition(num:Int){
    if(num>=100){
        println("num is >=100")
    }
    else if(num<100 && num>50){
        println("num is between 51-99")
    }
    else{
        println("num is <=50")
    }
}

fun compareArrayLength(a:Array<String>,b:Array<String>){
    if(a.size==b.size){
        println("length of both string arrays is equal")
    }
    else{
        println("length of arrays is not equal")

    }
}