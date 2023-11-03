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
}