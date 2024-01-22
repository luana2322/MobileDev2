package org.example

fun main() {
    var a:Int;
    var b:Int;
    print("Nhap a")
    a=readLine()!!.toInt();
    print("Nhap b")
    b= readLine()!!.toInt();

    print("Nghiem cua pt ${a}x+${b}=0 la ${-b/a}");

}