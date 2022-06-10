package com

class PersonKotlin {
    fun greeting(){
        println("Hello kotlin")
    }
}

//Top-level
fun main() {
    var p = PersonKotlin()
    p.greeting()
}