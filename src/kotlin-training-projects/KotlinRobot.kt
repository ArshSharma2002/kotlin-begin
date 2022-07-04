class Robot{

    fun ringAlarm(alarmTime:Int){
        println("ringing alarm......, its $alarmTime AM , Please wake up!!!")
    }
    
    fun heatWater(temper:Int){
        println("your water with $temper*C is ready. let's take a bath!")
    }
    
    fun clothes(shirt:String, pant:String){
        println("your outfit for the day is $shirt shirt with $pant pants")
    }

    fun coffeeReady(coffee:Coffee){
        if(coffee.milk==false && coffee.coffeeType=="cold"){
            
            println("your black cold coffee with ${coffee.sugar} tb. spoon sugar is ready")
        }
        else{
            println("your special milk coffee with ${coffee.sugar} tb. spoon sugar is ready")
            
        }
    }
    
    fun breakfast(){
        var breakfastMenu = arrayOf("aalo prantha","omelete","bread butter","poha")
        println("today we have ${breakfastMenu.random()} in breakfast. hope you will like it :)")
    }

    fun bagPack(timeTable:List<String> , day:String){
        
        when(day){
            "mon" -> println("packed your bag with ${timeTable[0]} books")
            "tue" -> println("packed your bag with ${timeTable[1]} books")
            "wed" -> println("packed your bag with ${timeTable[0]} books")
            "thur"-> println("packed your bag with ${timeTable[2]} books")
            "fri" -> println("packed your bag with ${timeTable[1]} books")
            else  -> println("Relax, today is your holiday :)")
        }
    }



    fun lunch(){
        var lunchMenu = arrayOf("shahi paneer","curry rice","Dosa","pulao")
        println("today we have ${lunchMenu.random()} in lunch. hope you will like it :)")
    }

    
}

data class Coffee(var milk:Boolean, var sugar:Int, var coffeeType:String) {

}


fun main(){
    val roger = Robot()
    roger.ringAlarm(10)

    roger.heatWater(36)

    roger.clothes("white", "black denim")

    val coffee = Coffee(true,2,"cold")
    roger.coffeeReady(coffee)

    roger.breakfast()

    var timeTable = listOf("operating systems,python,digital electronics,machine learning" , "java,soft skills,machine learning" , "DSA,python,AI,computer networks")
    roger.bagPack(timeTable,"thur")

    roger.lunch()
}
