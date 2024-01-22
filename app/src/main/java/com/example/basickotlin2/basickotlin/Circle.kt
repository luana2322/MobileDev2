package com.example.basickotlin2.basickotlin

import kotlin.math.sqrt

fun main() {
    println("Chu vi hinh tron ban kinh 2 la ${chuvi(2.0)}")
    println("Dien tich hinh tron ban kinh 2 la ${dientich(2.0)}")
}

fun chuvi(bkinh:Double):Double{
    var chuvi:Double=2*Math.PI*bkinh;
    return chuvi;
}
fun dientich(bkinh:Double):Double{
    var dtich:Double=Math.PI* sqare(bkinh);
    return dtich;
}
fun sqare(n:Double):Double{
    return n*n;
}