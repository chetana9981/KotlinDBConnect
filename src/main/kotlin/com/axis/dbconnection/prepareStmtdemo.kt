package com.axis.dbconnection

import java.sql.DriverManager
import java.util.Scanner

fun main() {

    var sc = Scanner(System.`in`)
    println("Enter user id ")
    var id = sc.nextInt()
    println("Enter user name ")
    var name = sc.next()

    val myurl = "jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection = DriverManager.getConnection(myurl, "root", "Auto@12345#")
    println("Connection estabished Successfully!!!")

    var prepStmt = connection.prepareStatement("insert into users values(?,?)")
    prepStmt.setInt(1,id)
    prepStmt.setString(2, name)
    val result = prepStmt.executeUpdate()
    if(result>0)
        println("inserted")
    else
        println("not inserted")

}