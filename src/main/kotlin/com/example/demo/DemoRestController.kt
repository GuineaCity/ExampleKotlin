package com.example.demo

import com.example.demo.entities.ExampleClass
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

// just go for localhost:8080/helloworld to try this out!
@RestController
class DemoRestController {

    @GetMapping( "/helloworld")
    fun helloWorld() = "Hello World!" // you don't need {} here


    @GetMapping( "/add")
    fun add(@RequestParam int1: Int, @RequestParam int2: Int) = int1 + int2;


    @GetMapping( "/get")
    fun get(): String
    {
        // val is read-only
        val example = ExampleClass(0, "Test", "NotNull");
        return example.toString();
    }
}