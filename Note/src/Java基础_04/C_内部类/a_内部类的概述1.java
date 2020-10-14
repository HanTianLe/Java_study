package Java基础_04.C_内部类;

/**
 *      内部类的概述：
 *              把类定义在其他类的内部，这个类就被称为内部类。
 *
 *      内部类访问的特点：
 *              A、内部类可以直接访问外部类的成员，包括私有。！
 *              B、外部类要访问内部类的成员，必须创建对象。！
 *
 *      注意： 内部类 和 外部类 没有继承关系。！
 *
 */
public class a_内部类的概述1 {}

/** 外部类*/
class Outer{
    private int a = 10;
    /** 内部类*/
    class Inner{
        int b = 20;
        public void show(){
            System.out.println(a);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
        System.out.println(i.b);
    }
}

