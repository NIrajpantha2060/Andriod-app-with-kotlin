package com.example.nirajkoproject

import androidx.compose.runtime.Immutable

fun displayList(){
    /*list*/
//    val numbers :List<String> = listOf("one" ,"two","three")
//
//    println("number of elemnts:${numbers.size}")
//    println("Third element :${numbers.get(2)}")
//    println("Fourth element :${numbers[3]}")
//    println("index of element \"two\" :${numbers.indexOf("two")}")



}
/*mutable and immutable list*/
//
//fun main(){
//    val lst = listOf("one", "two" ,"three")
//    println("mutable list ")
//
//    for (i in lst.indices) {
//        println(lst[i])
//    }
//    println()
//
//    /* mutable list */
//
//    val mutablelst = mutableListOf("one" , "two" ,"three")
//    mutablelst.add("four")
//    println("Immutable list ")
//
//    for (i in mutablelst.indices){
//        println(mutablelst[i])
//    }
//
//
//}

/* set */
//fun set () {
//val numbers = setOf(1,2,3,4)
//for (elements in numbers) {
//    println(elements)
//}
//    val numbersBackwards = setOf(4,3,2,1)
//    println("the sets are equal : ${numbers==numbersBackwards}")
//}

/* Map*/
fun map(){
//    val countriesCapitals=mapOf(
//        "Nepal" to "kathmandu",
//        "China " to "beijing",
//        "India" to "Dehli"
//    )
//
//    println("All keys: ${countriesCapitals.keys}")
//    println("All values : ${countriesCapitals.values}")
//
//    println("Capital of nepal is : ${countriesCapitals["Nepal"]}")
//




    /*mutable and immutable */

//  val studentMarks = mapOf(
//    "ram" to 45,
//    "Shyam" to 45,
//      "hari " to 45,
//      "gita" to 45,
//      )
//
//    println("enter student name :")
//    val input : String = readln().lowercase()
//    println(studentMarks[input])


    /*mutable map*/
    val studentMarks = mutableMapOf(
        "ram" to 45  ,
    "Shyam" to 45,
      "hari " to 45,
      "gita" to 45,
    )
    studentMarks["ram"]=60
    studentMarks.put("sabin",80)
    val input : String = readln().lowercase()
    println(studentMarks[input])


}


