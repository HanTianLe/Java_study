package Java基础_03.D_抽象类;

/**
 *  抽象类的（成员）特点：
 *          成员变量：既可以是变量，也可以是常量。
 *          构造方法：可以有。 用于子类访问父类数据的初始化。
 *          成员方法：既可以是抽象的，也可以是非抽象的。
 *
 *  抽象类的（成员方法）特性：
 *          A、抽象方法     强制要求子类（具体类）做的事情！！（抽象类如果有抽象方法，那么子类必须要重写该抽象方法。）
 *          B、非抽象方法   子类正常继承，提高代码复用性。
 *
 */
public class B_抽象类的成员特点 {}

abstract class Animal1{
    /** 变量*/
    public int num = 10;
    /** 其实是常量*/
    public final int num2 = 20;
    /** 构造方法*/
    public Animal1(){}
    public Animal1(String name,int age){}
    /** 抽象方法    不能实体化！*/
    public abstract void show();
    /** 非抽象方法*/
    public void method(){
        System.out.println("method");
    }
}


class Dog1 extends Animal1 {
    /** 必须要重写父类抽象方法show*/
    @Override
    public void show() {
        System.out.println("show dog");
    }

}


class AbstractDemo1{
    public static void main(String[] args) {
        /**
         *  Animal1 a = new Animal1();
         *  错误的！
         *  因为 Animal1 类是抽象类，无法实例化！
         */
        //多态（向上转型）
        Animal1 a = new Dog1();
//        a.num = 100;
        System.out.println(a.num);  //10
//        a.num2 = 200;    //是错误的！！无法赋值，因为num2变量被final修饰了。相当于常量。
        System.out.println(a.num2); //20
        a.show();                   //show dog
        a.method();                 //method    子类正常继承了父类的method方法。
    }
}


