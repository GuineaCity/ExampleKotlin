package com.example.demo.databases

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbRunner : CommandLineRunner {

    @Autowired
    private lateinit var postgresql: Postgresql

    override fun run(vararg args: String?) {
        val connection = postgresql.connectToDatabase()
        if(connection != null) {
            println("Connection is not null!")
            postgresql.createTable(connection)
            postgresql.createPerson(connection)
            val person = postgresql.getPerson(connection, 1)
            println(person)
            postgresql.dropTable(connection)
        }
        else{
            println("Connection is null")
        }

    }
}