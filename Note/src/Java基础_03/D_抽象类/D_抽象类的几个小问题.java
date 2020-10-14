package Java基础_03.D_抽象类;

/**
 *      如果一个类，没有抽象方法，可不可以定义为抽象类？
 *      却定义为抽象类有什么意义？
 *
 *      abstract 不能和哪些关键字共存？
 *          private     冲突
 *          final       冲突
 *          static      无意义
 *
 *
 */
public class D_抽象类的几个小问题 {}

abstract class Fu{
//    public abstract void show();
    /** 非法的修饰符组合：abstract 和 private 冲突。*/
//    private abstract void show();
    /** 非法的修饰符组合*/
//    final abstract void show();
    /** 非法的修饰符组合*/
//    static abstract void show();
    /** 非抽象静态方法*/
    public static void method(){
        System.out.println("method 静态方法--父");
    }
}

class Zi extends Fu {}

class AbstractTests{
    public static void main(String[] args) {
        Zi z = new Zi();
        //通过子类继承的对象调用（静态方法）
        z.method();
        //通过父类的类名直接（静态方法）
        Fu.method();
        //通过子类的类名直接（静态方法）
        Zi.method();
    }
}

