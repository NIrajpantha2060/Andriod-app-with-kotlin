package com.example.nirajkoproject
/*task of lessonn 5 */
fun main() {

    val dictionary = mapOf(
        "koshi" to "biratnagar",
        "madesh" to "janakpur",
        "bagmati" to "hetauda",
        "gandaki" to "pokhara",
        "lumbini" to "ghorahi",
        "karnali" to "birendranagar",
        "sudurpaschim" to "dhangadhi"
    )

    print("Enter province name: ")
    val word = readLine()

    if (word != null && dictionary.containsKey(word.lowercase())) {
        println("Capital: ${dictionary[word.lowercase()]}")
    } else {
        println("Sorry, not found in dictionary.")
    }
}
