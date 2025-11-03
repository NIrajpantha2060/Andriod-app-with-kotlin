package com.example.nirajkoproject

fun show(a: Int, b: Int): Unit {
    println("You entered $a and $b")
}

fun add(a: Int, b: Int): Int {
    var sum = 0
    sum = a + b
    return sum
}

fun findMinimumNumber (a:Int , b:Int) :Int {
    var minimun =0
    if  (a > b ) {
        minimun=b
    }
    else{
        minimun = a
    }
    return  minimun
}

fun  main() {
    println("enter first number ")
    var a : Int = readln()!!.toInt();
    println("enter second number ")
    var b :Int = readln()!!.toInt();
    show(a,b)
    var sum = add(a,b)
    println("sum of two entered number is $sum")
    var minimum = findMinimumNumber(a,b)
    println("and the smallest number btwn $a and $b is $minimum")

}
