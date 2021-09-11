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

/*/    在该集合中找出名字长度最大的一个
//    写法1：
    var max=""
    for(fruit in list_3)
    {
        if(fruit.length>max.length)
        {
            max=fruit
        }
    }
    println("The max fruit is "+max)
//写法2
    val max_2=list_3.maxByOrNull { it.length }
    println("The max fruit is "+max_2)
//    val max_2=list_3.maxByOrNull { it.length }变化过程如下：
//    val lambda ={fruit:String->fruit.length}
//    {参数名：参数类型->函数体}
//    val max_3=list.maxByOrNull(lambda)
//    使用lambda

//    不定义lambda变量，直接把花括号整进去
//    val max_3=list.maxByOrNull({fruit:String->fruit.length})

//    lambda是函数的最后一个参数的时候，可以把花括号放在外边
//    val max_3=list.maxByOrNull(){fruit:String->fruit.length}

//    若lambda是函数的唯一参数可以将空的括号省略
//    val max_3=list.maxByOrNull{fruit:String->fruit.length}

//    lambda在必要的时候可以不声明参数类型
//    val max_3=list.maxByOrNull{fruit->fruit.length}

//    只有一个参数的话也没有必要声明参数名
    val max_3=list.maxByOrNull{it.length}
//    如上*/



//    map

    val newlist=list_3.map { it.uppercase() }
    for(fruit in newlist)
    {
        println(fruit)
    }
//map函数是对于集合中的元素进行任意的映射转换



}
