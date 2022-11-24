package com.axis.dbconnection

import java.sql.DriverManager

fun main() {
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Auto@12345#")
    println("Connection estabished Successfully!!!")

    //   update
    val stmt =connection.createStatement()
    val update_res = stmt.executeUpdate("update users set name = 'Rohit' where id = 1")
    if (update_res > 0) {
        println("successfully updated record into users db !!!")
        println("$update_res updated")
    } else {
        println("Update Not sucessful")
    }
}