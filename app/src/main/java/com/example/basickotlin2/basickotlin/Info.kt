package com.example.basickotlin2.basickotlin

fun main() {
    print("Enter your name: ")
    val name = readLine()!!;
    print("Enter your email: ")
    val email = readLine()!!;
    print("Enter your Age: ")
    val age = readLine()!!.toInt();
    print("Enter your Gpa: ")
    val gpa = readLine()!!.toDouble();
    printInfo(name, email, age, gpa)
}

fun printInfo(name:String,email:String,age:Int,gpa:Double){
    print("Your Information:\n" +
            "Name:${name}\n"+
            "Email:${email}\n"+
            "Age:${age}\n"+
            "Gpa:${gpa}\n")
}