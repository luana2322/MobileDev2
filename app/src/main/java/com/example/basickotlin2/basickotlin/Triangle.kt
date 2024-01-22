package com.example.basickotlin2.basickotlin

fun main() {
    print("a=: ")
    val a = readLine()!!.toDouble();
    print("b=: ")
    val b = readLine()!!.toDouble();
    print("c=: ")
    val c = readLine()!!.toDouble();

    print(kiemTraLoaiTamGiac(a,b,c))
}


fun kiemTraLoaiTamGiac(a: Double, b: Double, c: Double): String {
    if (a <= 0 || b <= 0 || c <= 0) {
        return "Không phải tam giác"
    }

    return when {
        a + b > c && a + c > b && b + c > a -> {
            when {
                a == b && b == c -> "Tam giác đều"
                a == b || a == c || b == c -> "Tam giác cân"
                a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a -> "Tam giác vuông"
                else -> "Tam giác thường"
            }
        }
        else -> "Không phải tam giác"
    }
}