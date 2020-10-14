package Java基础_03.E_接口;

/**
 *      接口的特点
 *          A、接口用关键字 interface 表示
 *                  interface 接口名 {}
 *          B、类实现接口用关键字 implements 表示
 *                  class 类名 implements 接口名 {}
 *          C、接口不能实例化
 *                  接口如何实例化？
 *                  按照多态的方式来实例化。！！！！
 *          D、接口的子类  (实现类)
 *                  a、可以是抽象类。但是意义不大。
 *                  b、可以是具体类。但（一定要）重写接口中的所有抽象方法。(推荐)
 *
 *
 */
public class A_接口的特点 {}

/** 定义动物培训接口*/  //是抽象的（无法实例化）
interface AnimalTrain {
    public abstract void jump();
    public abstract void run();
}

/** 抽象类实现接口*/
abstract class Dog implements AnimalTrain {}

/** 具体类实现接口*/
class Cat implements AnimalTrain {

    @Override
    public void jump() {
        System.out.println("猫可以跳高了~~");
    }
    @Override
    public void run() {
        System.out.println("猫可以跑了~~");
    }

}


class InterfaceDemo{
    public static void main(String[] args) {
        // AnimalTrain是抽象的，无法实例化！
//        AnimalTrain at = new AnimalTrain();
        System.out.println("--------------通过多态------------------");
        AnimalTrain at = new Cat();
        at.jump();
        at.run();
        System.out.println("--------------通过实现类对象------------");
        Cat c = new Cat();
        c.jump();
        c.run();
    }
}


