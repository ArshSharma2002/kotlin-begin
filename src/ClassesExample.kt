// "data classes" are used to store data.
// "data classes" are used to directly perform the operations on data stored in their objects ,whereas in normal classes its little bit comlicated.
// primary constructor of "data class" must have atleast one parameter.
data class ClassesExample(var name:String, var rating:Double, var costForOne:Int){

    fun getRestaurant(){
        println("$name restaurent have a rating of $rating stars with Rs. $costForOne per person")
    }
}

fun main(){
    val resta1 = ClassesExample("president hotel",4.1,3000)
    val resta2 = ClassesExample("mahaveer hotel",4.6,3500)
    val resta3 = ClassesExample("Motel",4.0,4000)
    val resta4 = ClassesExample("Maya hotel",3.8,2500)
    val resta5 = ClassesExample("lemontree",4.4,5000)
    val resta6 = ClassesExample("president hotel",4.1,3000)
    // resta1.getRestaurant()

    // when we have "data class" then on printing its object it will print all its properties we gave into its constructor
    // "data classes" are just for holding data. objects of these classes holds the data/properties
    // println(resta1)
    var resList = mutableListOf(resta1,resta2,resta3,resta4,resta5)

    for(res in resList){
        println(res)
    }

    // if the class is "data class" this will print 'same' but if it is normal class result will be 'different'
    if(resta1==resta6){
        println("same")
    }else{
        println("different")
    }
}