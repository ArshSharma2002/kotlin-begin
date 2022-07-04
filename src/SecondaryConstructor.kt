// class with only secondary constructor

// class SecondaryConstructor {

//     var name:String
//     var age:Int
//     var subject:String

//     // this is secondary constructor
//     constructor(name:String, age:Int, subject:String){
//         this.name = name
//         this.age = age
//         this.subject = subject 
//         // we can also call member func. inside constructors
//         // this.intro()
//     }

//     fun intro(){
//         println("my name is $name and i am $age yrs old")
//     }

// }

// class with one primary constructor and one secondary constructor as well 
class SecondaryConstructor(var name:String, var age:Int, var subject:String){

    var school: String? = null
    // this(name, age, subject) is written so, that secondary constructor will understand that name,age and subject are already initialized in primary constructor.
    constructor(name:String, age:Int, subject:String, school:String?): this(name, age, subject){
        this.school = school
    }
}

fun main(){
    // creating object using only primary constructor
    val stud1 = SecondaryConstructor("arsh",20,"english")
    println(stud1)

    // creating object using secondary constructor
    val stud2 = SecondaryConstructor("arsh",20,"english","JNV Kangra")
    println(stud2)
    // stud1.intro()
}