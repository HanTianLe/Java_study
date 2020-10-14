package Java基础_04.C_内部类;

/**
 *      内部类分类： （根据位置）
 *          成员位置： 在成员位置定义的内部的，称为（成员内部类）。
 *          局部位置： 在局部位置定义的内部类，称为（局部内部类）。
 *
 *
 *      如何直接访问内部类成员？   (内部类无静态修饰符修饰时)
 *      格式：
 *          外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 *
 *
 */
public class b_成员内部类的使用 {}

class Outer1{
    private int num = 10;

    /** 成员内部类*/
    class Inner{
        int a = 200;
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        //局部内部类
//        class Inner{}
    }
}


class InnerClassDemo{
    public static void main(String[] args) {
        /** 访问Inner类的show()方法*/
        Outer1.Inner oi = new Outer1().new Inner();     //后面分别为（外部类匿名对象）和（内部类匿名对象）
        oi.show();               //10
        System.out.println(oi.a);//200
    }
}

