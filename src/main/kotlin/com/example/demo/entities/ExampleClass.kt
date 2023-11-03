package com.example.demo.entities

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonInclude

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
// this class is public final
class ExampleClass(/*This is the primary constructor without args*/) {

    // this is the secondary constructor that has to call the primary constructor
    constructor(i: Int, s: String?, s1: String) : this(/*the primary constructor is called here*/) {
        this.anInt = i
        this.aString = s1
        this.aNullableString = s
    }
    // var = mutable, val = read-only
    private var anInt: Int = 0 // there is no int. Just Int
        get // this is a public Getter that returns anInt
    private var aNullableString: String? = null // this String is nullable because of the ?
        get
    private var aString: String = "NotNull" // all types without the ? are NOT nullable!
        get
        set(value) { // public setter
            if (value != "null" || value.isEmpty()) // random if as an example
                field = value // setting the field aString
        }

    override fun toString(): String {
        return "ExampleClass(anInt=$anInt, aNullableString=$aNullableString, aString='$aString')"
    }


}
