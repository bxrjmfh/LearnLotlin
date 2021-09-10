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

**接口**

java中的接口是implements，继承使用的关键字是extends。但是在kotlin中统一使用冒号，中间使用","进行分割

实际概念区别：
>区别1:
不同的修饰符修饰(interface),(extends)

>区别2:
在面向对象编程中可以有多继承!但是只支持接口的多继承,不支持’继承’的多继承哦
而继承在java中具有单根性,子类只能继承一个父类

>区别3:
在接口中只能定义全局常量,和抽象方法
而在继承中可以定义属性方法,变量,常量等…

>区别4:
某个接口被类实现时,在类中一定要实现接口中的抽象方法
而继承想调用那个方法就调用那个方法,毫无压力

All in All ,你可以有多个干爹（接口），但只能有一个亲爹（ 继承

接口中可以含有 变量和方法。但是要注意，接口中的变量会被隐式地指定为public static final变量（并且只能是public static final变量，用private修饰会报编译错误），而方法会被隐式地指定为public abstract方法且只能是public abstract方法（用其他关键字，比如private、protected、static、 final等修饰会报编译错误），并且接口中所有的方法不能有具体的实现，也就是说，接口中的方法必须都是抽象方法。

允许一个类遵循多个特定的接口。如果一个非抽象类遵循了某个接口，就必须实现该接口中的所有方法。对于遵循某个接口的抽象类，可以不实现该接口中的抽象方法。

kotlin的接口可以添加默认实现


 
