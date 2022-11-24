package com.axis.dbconnection

import java.sql.DriverManager

fun main() {
    var dbconnection =DbConnection()
    var connection=dbconnection.connect()
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val stmt =connection.createStatement()
    stmt.executeUpdate("create table product(id int ,name varchar (45));")
    print("Table Created!!")
}