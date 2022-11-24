package com.axis.dbconnection

import java.sql.DriverManager


fun main(args: Array<String>) {


    var dbconnection =DbConnection()
    var connection=dbconnection.connect()
    println("connection establish successfully")

//   insert query -Create
    val res = connection.createStatement().executeUpdate("insert into users values(4,'rohit')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }
}

