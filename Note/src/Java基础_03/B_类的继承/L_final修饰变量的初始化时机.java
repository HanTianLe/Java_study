package Java基础_03.B_类的继承;

/**
 *      final修饰变量的初始化时机
 *          A、被 final 修饰的变量只能被赋值一次！
 *          B、在构造方法完毕前。（非静态的常量）
 */
public class L_final修饰变量的初始化时机 {}

class Demo{
    int num1;
    final int num2;
    /** 代码块*/
    {
        //num2 = 2;
    }
    public Demo(){
        num1 = 3;
        num2 = 4;   //如果代码块里面的num2 = 2;没有注释掉，
                    //那么这行代码要注释掉，不能被重新赋值了。
    }
}


