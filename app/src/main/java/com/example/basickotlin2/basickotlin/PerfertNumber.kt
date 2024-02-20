package com.example.basickotlin2.basickotlin

fun main() {
print("Nhap so nguyen duong n:")
    val n= readLine()!!.toInt();
    print(" tổng bình quân các số nguyên tố và số hoàn hảo la ${trungbinh(n)}")
}
fun nguyento(n:Int):Boolean{
var num:Int=0;
    for(i in 1..n){
        if(n%i==0){
            num++;
        }
    }

    if(n==2){
        return true;
    }
    return false;
}
fun hoanhao(n:Int):Boolean{
    var num:Int=0;
    for(i in 1..n/2){
        if(n%i==0){
            num+=i;
        }
    }
    if(num==n){
        return true;
    }
    return false;
}

fun trungbinh(n:Int):Double{
    var binhquan:Double=0.0;
    var total:Int=0;
    var num:Int=0;

    for(i in 1..n){
       if(nguyento(i)|| hoanhao(i)){
           num++;
           total+=i;
       }
    }

    binhquan=total/num.toDouble();
    return binhquan;
}
