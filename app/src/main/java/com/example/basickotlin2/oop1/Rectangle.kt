
class Rectangle(width: Float, height:Float) {
    var width: Float = width
    var height: Float = height

    fun area(): Float {
        // Diện tích của hình chữ nhật là chiều dài nhân chiều rộng
        return width * height
    }
    fun perimeter():Float{
        return (width + height)*2.0F;
    }
}
fun main(){
    var rectangle=Rectangle(2.0F,4.0F);
    println(rectangle.area());
    println(rectangle.perimeter());
}
