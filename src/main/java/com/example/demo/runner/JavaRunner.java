package com.example.demo.runner;

import com.example.demo.entities.ExampleClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JavaRunner implements CommandLineRunner
{
    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("Testing JavaRunner");
        ExampleClass exampleClass = new ExampleClass(0, null, "NotNull");
        System.out.println(exampleClass);
    }
}
