package com.example.demo.entities

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

//https://kotlinlang.org/docs/idioms.html

@Component
class IdiomsRunner() : CommandLineRunner
{
    fun defaultValue(anInt: Int = 0){
        println(anInt)
    }

    fun kotlinsSwitch(o: Any)
    {
        when(o){
            "Teststring" -> println("Found our Teststring!")
            is String -> println("Given variable is a String!")
            else -> println("It's something else")
        }
    }

    override fun run(vararg args: String?) {
        println("Testing the default value")
        defaultValue()
        defaultValue(1)

        println("Testing forEach and filter")
        (0..10).forEach { print("$it," ) }
        println()
        (0..10).filter { it > 5 }.forEach { print("$it,") }
        println()
        if(1 in (0..10))
            println("Found!")
        if(1 !in (2..10))
            println("Not Found!")

        println("Testing String interpolation")
        val string = "Teststring";
        println("My String is $string")

        println("Testing Kotlins switch")
        kotlinsSwitch(string)
        kotlinsSwitch("Whatever")
        kotlinsSwitch(1)

        println("Testing mutable maps")
        val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
        println(map["a"])
        map["a"] = 5
        println(map["a"])

        println("Testing Extension Methods")
        //Why tf is it possible to define a method inside a method??
        fun String.addTestToString(): String { return this + "Test"  }
        println("TestString".addTestToString())
    }




}