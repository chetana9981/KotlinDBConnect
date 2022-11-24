package com.axis.dbconnection



import java.sql.DriverManager
import java.util.Scanner

fun main() {

    var sc= Scanner(System.`in`)
    print("Enter User Id: ")
    var id = sc.nextInt()
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Auto@12345#")
    println("Connection estabished Successfully!!!")

    //   select query -Create
    val query =connection.prepareStatement("Select * from users where id=(?)")
    query.setInt(1,id)
    val result=query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    for (user in users){
        println(user)
    }
}