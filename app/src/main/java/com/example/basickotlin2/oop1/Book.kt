class Book(var title:String,var author:String,var ISBN:String){

}

fun add(list:MutableList<Book> ,book: Book){
    list.add(book);
}
fun remove(list: MutableList<Book>,book: Book){
    for(b in list){
        if(b==book){
            list.remove(b)
        }
    }
}
fun printlist(list: MutableList<Book>){
    for (b in list){
        println(b.title)
    }
}
fun main(){
    val list= mutableListOf<Book>();
var book1=Book("Book 1","Alex","1234")
    var book2=Book("Book 2","Alex1","12345")
    add(list,book1)
    add(list,book2)
    printlist(list)
    remove(list,book1)
    println("List after remove:")
    printlist(list)


}
