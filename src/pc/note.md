## 关于函数的构造器

**主函数构造器**
最常使用的一个构造函数，没有函数体，直接定义在类名的后边
``class Student(val sno: String, val grade: Int, name:String, age:Int ) : Person(name,age) {``
:
这一代码的主构造函数中不可以再添加val或者时var类型的声明，因为会自动生成为字段，和父类的字段相冲突

**次构造函数**

使用construct来定义的
```java 
constructor(name: String,age: Int):this("",0,name, age)
//    该this是指主构造函数
constructor(name: String):this(name,0)
//该this是指上一个constructor函数，间接调用了主构造函数
```
次构造函数必须调用主构造函数的方法。