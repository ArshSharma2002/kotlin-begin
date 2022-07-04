// there are 2 main ways to define Primary constructors class variables/properties

// 1. through constructor, by giving parameters inside constructor while initializing and initializing variables inside class also

// class Constructor(breed:String, color:String, age:Int){

// here the parameters which are given inside constructor are "constructor parameters" & parameters that are initialized in "init" block by 'this.breed , this.color' etc. are "member parameters".

//     var breed:String
//     var color:String
//     var age:Int


//     init{
// here this.memberVariables = constructorVariables
//         this.breed = breed
//         this.color = color
//         this.age = age
//     }

//     fun bark(){
//         println("${breed} is barking")
//     }

// }


// 2. directly initialize and give class variables/properties inside constructor as parammeters.

class Constructor(var breed:String, var color:String, var age:Int){

    fun bark(){
        println("${breed} is barking")
    }

}



fun main(){

    var tommy = Constructor("pitbull","brown",5)
    println(tommy.bark())

    var sherry = Constructor("german shepherd","black",3)
    println(sherry.bark())

}