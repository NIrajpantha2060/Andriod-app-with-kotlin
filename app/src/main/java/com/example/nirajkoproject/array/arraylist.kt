package com.example.nirajkoproject.array

fun  main (args: Array<String>) {
    /*array*/
//    var age = arrayOf(1,2,3)
//    println(age)
//    println("the first element of age is "+age[0])
//    println("the second element of age is "+age[1])
//    println("the third  element of age is "+age[2])
//
//    println("*************************")
//
//    var name = arrayOf("ram","shyam","Hari")
//    name[1] = "niraj"
//    println("the first element of name is " +name[0])
//    println("the second element of name is "+name[1])
//    println("the third  element of name is "+name[2])
//
//    println(name.size)

    /* arraylist*/

    var age1 =ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var name = arrayListOf<String>("ram","shyam","hari")
    name.add("rahul")
    name.add(4,"sita")

    name.remove("shyam")
    name.removeAt(0)
    println(name)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])

     )



}