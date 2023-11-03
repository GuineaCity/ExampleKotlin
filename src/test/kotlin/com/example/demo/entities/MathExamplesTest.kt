package com.example.demo.entities

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MathExamplesTest {

    @Test
    fun factorialForLoopFor1()
    {
        val expectedValue = 1
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialForLoop(1), expectedValue)
    }

    @Test
    fun factorialForLoopFor5()
    {
        val expectedValue = 120
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialForLoop(5), expectedValue)
    }

    @Test
    fun factorialRecursiveFor1()
    {
        val expectedValue = 1
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialRecursive(1), expectedValue)
    }
    @Test
    fun factorialRecursiveFor5()
    {
        val expectedValue = 120
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialRecursive(5), expectedValue)
    }
    @Test
    fun factorialStreamFor1()
    {
        val expectedValue = 1L
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialStream(1), expectedValue)
    }
    @Test
    fun factorialStreamFor5()
    {
        val expectedValue = 120L
        val mathExamples = MathExamples()
        assertEquals(mathExamples.factorialStream(5), expectedValue)
    }

    @Test
    fun ggTFor1And1()
    {
        val expectedValue = 1
        val mathExamples = MathExamples()
        assertEquals(mathExamples.ggT(1,1), expectedValue)
    }

    @Test
    fun kgVFor1And1()
    {
        val expectedValue = 1
        val mathExamples = MathExamples()
        assertEquals(mathExamples.kgV(1,1), expectedValue)
    }
    @Test
    fun ggTFor6And9()
    {
        val expectedValue = 3
        val mathExamples = MathExamples()
        assertEquals(mathExamples.ggT(6,9), expectedValue)
    }

    @Test
    fun kgVFor6And9()
    {
        val expectedValue = 18
        val mathExamples = MathExamples()
        assertEquals(mathExamples.kgV(6,9), expectedValue)
    }

    @Test
    fun binomialCoefficientFor3And2()
    {
        val expectedValue = 3L
        val mathExamples = MathExamples()
        assertEquals(mathExamples.binomialCoefficient(3,2), expectedValue)
    }

    @Test
    fun binomialCoefficientFor10And5()
    {
        val expectedValue = 252L
        val mathExamples = MathExamples()
        assertEquals(mathExamples.binomialCoefficient(10,5), expectedValue)
    }
}