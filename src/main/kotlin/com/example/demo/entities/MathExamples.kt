package com.example.demo.entities

import java.util.stream.LongStream

class MathExamples()
{

    // source: https://www.baeldung.com/java-calculate-factorial
    fun factorialForLoop(i: Int): Int
    {
        var result = 1;
        for(j in 2..i)
            result*=j

        return result
    }

    fun factorialRecursive(i: Int): Int =  if (i <= 2) i else i * factorialRecursive(i - 1)

    fun factorialStream(i: Long): Long = LongStream.rangeClosed(1,i).reduce(1){a,b -> a*b}

    fun ggT(i1: Int, i2:Int): Int = if(i2 == 0)  i1 else ggT(i2, i1 % i2)

    fun kgV(i1: Int, i2: Int): Int = (i1 * i2) / ggT(i1, i2)

    fun binomialCoefficient(l1: Long, l2: Long) : Long = factorialStream(l1) / (factorialStream (l1-l2)*factorialStream(l2))
}