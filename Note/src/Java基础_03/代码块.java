package Java基础_03;

/**
 *      代码块 ： 在Java中，使用{}括起来的代码称为代码块。
 *
 *      根据其位置和声明的不同，可以分为：
 *                       A、局部代码块：在局部位置。（ 方法里 ）
 *                                     作用：用于限定变量生命周期。
 *                       B、构造代码块：在类中的成员位置，每次调用构造方法执行前，都会先执行构造代码块。
 *                                     作用：把多个构造方法中的共同代码放到一起，对对象进行初始化。
 *                       C、静态代码块：在类中的成员位置，只不过用static修饰了。
 *                                     作用：一般是对类进行初始化。
 *
 *   静态代码块、构造代码块、构造方法的
 *      执行顺序：
 *          1、静态代码块 ———— 只执行一次。 **
 *          2、构造代码块 ———— 每次调用构造方法都执行。
 *          3、构造方法
 *
 *      执行顺序跟他们的位置顺序无关。
 */
public class 代码块 {}

class Code{
    /** 静态代码块*/
    static {
        int x = 30;
        System.out.println(x);
    }

    /** 构造代码块*/
    {
        int x = 100;
        System.out.println(x);
    }

    public Code(){
        System.out.println("code1");
    }
    public Code(int a){
        System.out.println("code2");
    }

    /** 构造代码块*/
    {
        int y = 200;
        System.out.println(y);
    }

    /** 静态代码块*/
    static {
        int y = 300;
        System.out.println(y);
    }

}

class CodeDemo{
    static {
        System.out.println("静态代码块");
    }
    public static void main(String[] args) {
        /** 局部代码块*/
        {
            int x = 10;
            System.out.println(x);
        }
//        System.out.println(x);    //这边是调用不了x的。
        System.out.println("------------------------------");
        Code c = new Code();
        System.out.println("------------------------------");
        Code c2 = new Code(1);
    }
}

/**
 *      执行结果：
 *      静态代码块
 *      10
 *      ------------------------------
 *      30
 *      300
 *      100
 *      200
 *      code1
 *      ------------------------------
 *      100
 *      200
 *      code2
 */

