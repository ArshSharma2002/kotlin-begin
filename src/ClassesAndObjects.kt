// create your Laptop class here
class ClassesAndObjects{
    var ram:String = "8Gb"
    var brand:String = "Dell"
    var hdd:String = "1Tb"
    
    fun performComputations(){
        println("performing computations...")
    }
}


fun main(){

    // Create object of class here    
    var laptop = ClassesAndObjects()
    laptop.brand = "HP"
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()
}