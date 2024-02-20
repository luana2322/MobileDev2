 interface Shape{
 fun getArea():Double
}
 class Rectangle1(var width:Double,var height:Double) : Shape{

    override fun getArea():Double {
        return width*height;
    }
}
 class Circle(var radius:Double):Shape{
     override fun getArea():Double {
         return radius*radius*Math.PI;
     }
 }
 class Triangle(var a:Double,var b:Double,var c:Double):Shape{
     override fun getArea():Double {
      var p=(a+b+c)/2;
         var area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
         return area;
     }
 }
fun main(){
var rectangle=Rectangle1(2.0,3.0);
    println("Area = "+rectangle.getArea());
    var circle=Circle(2.0);
    println("Area = "+circle.getArea());
    var triangle=Triangle(3.0,4.0,5.0);
    println("Area = "+triangle.getArea());

}