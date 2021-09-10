package pc

//要把两个类确定其继承关系，需要将继承自的class设置为open
//因为默认class不可以被继承
class Student(val sno: String, val grade: Int, name:String, age:Int )
    : Person(name,age) {

    constructor(name: String,age: Int):this("",0,name, age)
//    该this是指主构造函数
    constructor(name: String):this(name,0)
//该this是指上一个constructor函数，间接调用了主构造函数
    init {
        println("sno:  " + sno)
        println("grade:   " + grade)
//    init可以编写主构造函数的逻辑


    }
}