class Employee(var name:String,var jobdt:String,var salaryprthour:Double,var hour:Int){

    fun salary():Double{
        return salaryprthour*hour;
    }

}

fun main(){
    var employee=Employee("Alex","Software Engineer",200.0,80);
    println("Salary for employee ${employee.name} "+employee.salary())
}