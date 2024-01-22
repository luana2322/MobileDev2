package org.example
import kotlin.math.sqrt

fun main() {
    // Nhập vào các hệ số a, b, c từ người dùng
    print("Nhập hệ số a: ")
    val a = readLine()!!.toDouble()

    print("Nhập hệ số b: ")
    val b = readLine()!!.toDouble()

    print("Nhập hệ số c: ")
    val c = readLine()!!.toDouble()

    // Tính delta
    val delta = b * b - 4 * a * c

    // Kiểm tra giá trị của delta để xác định số nghiệm
    if (delta > 0) {
        val x1 = (-b + sqrt(delta)) / (2 * a)
        val x2 = (-b - sqrt(delta)) / (2 * a)
        println("Phương trình có hai nghiệm thực:")
        println("x1 = $x1")
        println("x2 = $x2")
    } else if (delta == 0.0) {
        val x = -b / (2 * a)
        println("Phương trình có một nghiệm thực kép:")
        println("x = $x")
    } else {
        println("Phương trình không có nghiệm thực.")
    }
}
