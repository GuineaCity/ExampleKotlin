package com.example.demo.databases

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.sql.Connection
import java.sql.DriverManager

@Configuration
@EnableConfigurationProperties(PostgresConfig::class)
class Postgresql(private val config: PostgresConfig) {

    fun connectToDatabase(): Connection? {
        return try {
            Class.forName(config.driverClassName)
            DriverManager.getConnection(config.url, config.username, config.password)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun createTable(connection: Connection)
    {
        try{
            val statement = connection.createStatement();

            val createSql = "CREATE TABLE Person (" +
                    "id SERIAL PRIMARY KEY, " +
                    "firstName VARCHAR(255) NOT NULL, " +
                    "lastName VARCHAR(255) NOT NULL, " +
                    "birthday TIMESTAMP NOT NULL)"

            statement.executeUpdate(createSql)
            statement.close()
        }catch (e: Exception)
        {
            e.printStackTrace()
        }
    }

    fun dropTable(connection: Connection)
    {
        try{
            val statement = connection.createStatement();

            val createSql = "DROP TABLE Person"

            statement.executeUpdate(createSql)
            statement.close()
        }catch (e: Exception)
        {
            e.printStackTrace()
        }
    }

    fun createPerson(connection: Connection)
    {
        try{
            val statement = connection.createStatement();

            val createSql = "INSERT INTO Person" +
                    "(firstname, lastname, birthday) " +
                    "VALUES ('TestFirstName', 'TestLastname', current_timestamp)"

            statement.executeUpdate(createSql)
            statement.close()
        }catch (e: Exception)
        {
            e.printStackTrace()
        }
    }

    fun getPerson(connection: Connection, id: Int): Person?
    {
        try{
            val statement = connection.prepareStatement("SELECT id, firstname, lastname, birthday FROM Person WHERE id = ?");
            statement.setInt(1, id)
            val resultSet = statement.executeQuery()
            if(resultSet.next()){
                val personId = resultSet.getInt("id")
                val firstname = resultSet.getString("firstname")
                val lastname = resultSet.getString("lastname")
                val birthday = resultSet.getTimestamp("birthday")
                statement.close()
                return Person(personId, firstname, lastname, birthday)
            }
            return null
        }catch (e: Exception)
        {
            e.printStackTrace()
        }
        return null
    }

}