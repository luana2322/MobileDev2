package org.example

fun main() {
    var a:Int;
    print("Nhap a")
    try {
        a=readLine()!!.toInt();
        when(a){
            in 1..3-> println("Quy 1")
            in 4..6-> println("Quy 2")
            in 7..9-> println("Quy 3")
            in 10..12-> println("Quy 4")

        }
    }catch (e:Exception){
    println("Dmm .Nhap lai")
    }


}