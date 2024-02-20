open abstract class Vehicle(open var brand:String,open var model: String,open var year:Number,open var fueltype:String){
open fun fuelefficiency():Double{
    return 10.0;
}
    open fun distancetraveled():Double{
        return 10.0;
    }
    open fun maximumspeed():Double{
        return 10.0;
    }
}
class Truck(override var brand: String, override var model: String, override var year: Number, override var fueltype: String):Vehicle(brand,model,year,fueltype){
    override fun fuelefficiency():Double{
        return 20.0;
    }
    override fun distancetraveled():Double{
        return 20.0;
    }
    override fun maximumspeed():Double{
        return 20.0;
    }
}
class Car(override var brand: String, override var model: String, override var year: Number, override var fueltype: String):Vehicle(brand,model,year,fueltype){
    override fun fuelefficiency():Double{
        return 30.0;
    }
    override fun distancetraveled():Double{
        return 30.0;
    }
    override fun maximumspeed():Double{
        return 30.0;
    }
}
class Motorcycle(override var brand: String, override var model: String, override var year: Number, override var fueltype: String):Vehicle(brand,model,year,fueltype){
    override fun fuelefficiency():Double{
        return 40.0;
    }
    override fun distancetraveled():Double{
        return 40.0;
    }
    override fun maximumspeed():Double{
        return 40.0;
    }
}
fun main(){
var truck=Truck("VinFast","VinFast M1",2022,"diazen")
    println("Max speed "+truck.maximumspeed())
}