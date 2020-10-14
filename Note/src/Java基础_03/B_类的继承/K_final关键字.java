package Java基础_03.B_类的继承;

/**
 *      final关键字        “ 最终的 ” 意思。
 *
 *      继承中，会出现方法重写的现象；有些时候，
 *      我们不想让子类去覆盖父类的功能，只能让他使用。
 *      这个时候，Java提供了一个关键字：final。
 *
 *      final：可以修饰：类、方法、变量。
 *
 *      特点：
 *      1、 final修饰类的特点：  被 final 修饰的类是不能被（继承）的！！
 *      2、 final修饰方法的特点：被 final 修饰的方法是不可以被（重写）的！！
 *      3、 final修饰变量的特点：被 final 修饰的变量是不能被（重新赋值）的！！
 *                                         (其实这个变量是：常量)
 *
 *      final 修饰局部变量的问题：
 *                 修饰 基本类型：基本类型的值不能发生改变。
 *                 修饰 引用类型：引用类型的（地址值）不能发生改变。
 *
 */
public class K_final关键字 {}

class Fulei {
    public int num1 = 1;
    final int num2 = 10;    //实际是常量了。
    public final void show(){
        System.out.println("这里是绝密资源，不得修改！！");
    }
}

class Zilei extends Fulei {
    //Zilei中的show()无法覆盖Fulei中的show()。
//    public void show(){
//        System.out.println("巴拉巴拉~");
//    }
    public void method(){
        num1 = 100;
        //num2 = 1000; 不能被重新赋值
        System.out.println(num1);   //100
    }
}

class FinalDemo{
    public static void main(String[] args) {
        final int x = 2;
        System.out.println(x);  //2
        Fulei f = new Fulei();
        f.num1 = 11;    //父类的（非final变量）可以重新赋值。
//        f.num2 = 22;  //父类的（final变量）不可以重新赋值。
        System.out.println(f.num1); //11
        System.out.println(f.num2); //10
        System.out.println("-----------------------");
        final Fulei ss = new Fulei(); /** 这里 final 修饰的是对象的（地址值）！*/
        System.out.println(ss.num1); //1
        System.out.println(ss.num2); //10
        System.out.println("-----------------------");
        ss.num1 = 44;
        System.out.println(ss.num1); //44
        /** 重新分配内层空间（也就是地址值要改变了）*/
//        ss = new Fulei(); //错误的！！！
    }
}

