package Java基础_03.B_类的继承;

/**
 *      继承的概述：          “ 继承的 ”意思
 *            把多个类中相同的内容给提取出来出来，定义到一个类中。
 *
 *      实现继承的关键字： extends
 *
 *      格式：  class 子类名 extends 父类名 {}
 *
 *      好处：
 *          A、提高代码的复用性。
 *          B、提高代码的维护性。
 *          C、让类与类之间产生了关系。（是多态的前提）
 *
 *      弊端：类的耦合性增强了。
 *
 *      开发原则：低耦合，高内聚。
 *          耦合：类与类的关系。
 *          内聚：就是自己完成某件事情的能力。
 *
 */
public class A_继承的概述 {}

class Person{
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

/** Teacher类和Student类都是继承Person类*/
class Teacher extends Person {}

class Student extends Person {}

class ExtendsDemo{
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();    //吃饭
        s.sleep();  //睡觉
        Teacher t = new Teacher();
        t.eat();    //吃饭
        t.sleep();  //睡觉
    }
}

