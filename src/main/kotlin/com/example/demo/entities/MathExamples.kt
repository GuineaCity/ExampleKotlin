package com.example.demo.entities

import java.util.stream.LongStream

class MathExamples()
{
    fun factorialForLoop(i: Int): Int
    {
        var result = 1;
        for(j in 2..i)
            result*=j

        return result
    }

    fun factorialRecursive(i: Int): Int {
        return if (i <= 2) i else i * factorialRecursive(i - 1)
    }

    fun factorialStream(i: Long): Long = LongStream.rangeClosed(1,i).reduce(1){i,j -> i*j}

}