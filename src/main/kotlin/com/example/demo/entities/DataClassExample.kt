package com.example.demo.entities

// all classes that implements a sealed class needs to be known in compile time
sealed interface SealedInterface
{
   fun getString(): String
   fun getInt(): Int
   fun getDouble(): Double

   // https://kotlinlang.org/docs/data-classes.html it's like a record in Java
    data class DataClass(private val string: String, private val int: Int,private val double: Double) : SealedInterface {
        override fun getString(): String {
            return string;
        }

        override fun getInt(): Int {
           return int;
        }

        override fun getDouble(): Double {
            return double;
        }
    }

    // this data object will print it's Name "Example", when toString is called.
    data object Example : SealedInterface {
        override fun getString(): String {
            return "ExampleDataObject"
        }

        override fun getInt(): Int {
            return 0;
        }

        override fun getDouble(): Double {
            return 0.0;
        }
    }
}