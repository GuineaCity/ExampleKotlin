package com.example.demo.entities

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
public class Runner : CommandLineRunner{
    override fun run(vararg args: String?) {
        val dataClassExample = SealedInterface.DataClass("Test", 1, 0.0);
        val dataObjectExample = SealedInterface.Example;

        println(dataClassExample)
        println(dataObjectExample)


        val exampleClassNoArgsConstructor = ExampleClass()
        val exampleClassAllArgsConstructor = ExampleClass(0, "Test", "NotNull")

        val objectMapper = ObjectMapper();
        println(objectMapper.writeValueAsString(exampleClassNoArgsConstructor))
        println(objectMapper.writeValueAsString(exampleClassAllArgsConstructor))
    }
}