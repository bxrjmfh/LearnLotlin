package pc
fun main(){
    val list=ArrayList<String>()
    list.add("Apple")
    list.add("Banana")
    list.add("Orange")
    list.add("Grape")
    list.add("Peach")
    list.add("Melon")
//    可以通过这样的方式初始化一个集合,只是会比较麻烦
    val list_2= listOf("Apple","Banana")
//    使用listof()方法就很不错
//    该集合为一个不可变的集合,只可以读取,但是不能删除及修改
    for(fruit in list_2)
    {
        println(fruit)
    }

//    改用可变的list
    val list_3= mutableListOf("Apple","Banana")
    list_3.add("Orange")
    list_3.add("Grape")
    list_3.add("Peach")
    list_3.add("Melon")
    for(fruit in list_3)
    {
        println(fruit)
    }

}
