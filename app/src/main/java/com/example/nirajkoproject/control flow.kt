package com.example.nirajkoproject

import java.util.Date.from
import kotlin.random.Random

/*if else*/

fun main(){

    fun ifelse(){
        print("Please enter your age :: ")
        var yourAge: Int = readln()!!.toInt()
        if (yourAge < 13) {
            print("You are a child")
        } else if (yourAge < 19) {
            print("You are a teenager")
        } else {
            if (yourAge < 50) {
                print("You are an adult")
            } else {
                print("You are a senior")
            }
    }

}

    /*nested if */
    fun nestedIf (){
        println("Please enter 3 numbers : ")
        var number1: Int = readln()!!.toInt()
        var number2: Int = readln()!!.toInt()
        var number3: Int = readln()!!.toInt()
        var largestNumber: Int
        if (number1 >= number2) {
            if (number1 >= number3) {
                largestNumber = number1
            } else {
                largestNumber = number3
            }
        } else {
            if (number2 >= number3) {
                largestNumber = number2
            } else {
                largestNumber = number3
            }
        }
        println("The largest number is $largestNumber")
    }

    /* when statement*/

    print("Please enter a day number of week : - ")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when(dayNumber)
    {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)

    fun loop () {
        var sum: Int = 0
        for (x in 0..10) {
            if (x % 2 == 0) {
                println(x)
                sum += x // sum = sum + x
            }
        }
        println("The sum of even number is $sum")
    }

    fun for_each (){
        var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
        for(y in vehicle.indices){
            println("The value in $y index is : - " + vehicle[y])
        }
    }

    fun While_loop (){
        var i: Int = 0;
        while (i < 5) {
            println(i)
            i++
        }
        // 3 -> 3*2*1 factorial of 3 - 3!
// 5 -> 5*4*3*2*1 factorial of 5 - 5!
// In math factorial is represented by ! -> 5!

        var k = 1
        var fact = 1
        while (k<6){ //setting the conditions while k < 6
            fact*=k; // fact = fact * k
            println("$k! = $fact");
            k++
        }

    }
    fun infiniteLoop (){
        var number = Random.nextInt(from: 0, until: 10000)
        println("Please enter any number from 0 to 10000: - ")
        while (2>1){
            var userGuess:Int = readln()!!.toInt()
            if(userGuess == number){
                println("congratulations!!!!, you won")
                break
            }else if(userGuess<number){
                println("Increase your guess")
            }else{
                println("Decrease your guess")
            }
        }
    }



}
