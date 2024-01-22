package org.example

fun main() {
    var a:Int;
    var b:Int;
    print("Nhap a")
    a=readLine()!!.toInt();
    var sum:Int=0;
    for(i in 1..a){
        sum+=i;
    }
    println(sum)

}