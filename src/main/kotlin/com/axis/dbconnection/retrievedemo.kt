package com.axis.dbconnection

import java.sql.DriverManager

//model class
data class User(val id:Int, val name:String)


fun main(args: Array<String>) {


    val myurl = "jdbc:mysql://localhost:3306/kotlindb"
    val connection= DriverManager.getConnection(myurl,"root","Auto@12345#")
    println("connection establish successfully")

//select query - Read
    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    for(user in users) {
        println(user)
    }
}

