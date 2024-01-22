package org.example

fun main() {
    var a:Int;
    var b:Int;
    print("Nhap a")
    a=readLine()!!.toInt();
    var c:Int=1;
    for(i in 1..a){
        c*=i;
    }
    println(c)

}