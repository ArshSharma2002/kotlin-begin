fun main(){

//    immutable lists
    val list1 = listOf<String>("arsh","sharma","great","arsh","shubham","akshit","sparsh")
//    list[3] = "ankit"  this will throw an error as it is immutable list
    println(list1[1])
    println(list1.get(5))
    println(list1.subList(0,4))
    println(list1.lastIndexOf("arsh"))

//    mutable lists
    val list2 = mutableListOf<String>("one","two","three","four","five","six","one")
    println(list2.size)
    println(list2)
    list2[6] = "seven"
    println(list2)
    list2.add("eight added")
    list2.add(0,"zero")
    println(list2)
    list2.removeAt(0)
//    'set' will replace the element present at that index with the new one by removing old one, whereas 'add' will not replace the element but add one more element in that list .
    list2.set(0,"zero")  // list2[0] = "zero" is same as of set() func.
    println(list2)

    val list3  = mutableListOf("nine","ten")
//    we can also add arrays to lists using addAll() function
    list2.addAll(list3)
    println(list2)

//    array list : exactly same as mutable list just difference of syntax.
    var arrList1 = arrayListOf<Any>(1,"two",3,"four",5,"six")
    println(arrList1)



}