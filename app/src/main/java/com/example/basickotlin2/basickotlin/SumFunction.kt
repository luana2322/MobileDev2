package com.example.basickotlin2.basickotlin

fun main() {
    val total:Double= sum(5);
    println(total)
}
fun sum(n:Int):Double{
    var sum:Double=0.0;
    sum=(((1+n)*(n-1+1))/2).toDouble();
    return sum;
}