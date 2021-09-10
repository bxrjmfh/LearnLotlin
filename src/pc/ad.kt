package pc

    fun main(args: Array<String>) {
        println("aw！")
        var p1=Person("dawdaw",90)
//构造时去除了new这一关键字
        p1.age=95

        p1.eat()
        val p2=Student("dwa",4)

        p2.eat()
    }
//值得注意的是。kotlin的main方法不在某一个类中，
// 要把其放在某一个类中要把该类声明为companion object
//    由于main是静态方法，故放在静态类中