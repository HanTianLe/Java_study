package Java基础_04.C_内部类;

/**
 *      局部内部类
 *          A、可以直接访问外部类的成员。
 *          B、在局部位置，可以创建（内部类对象），
 *             通过（对象）调用（内部类方法），来使用（局部内部类功能）。
 *
 *
 *      （局部内部类）访问（局部变量）的注意事项：
 *                   ** 局部内部类访问的局部变量必须用 final 修饰。**
 *
 *                      原因：局部变量是随着方法的调用而调用，
 *                           随着调用完毕而消失，而堆内存的内容并不会立即消失。
 *                           所以 变量用 final 修饰后，就变成了常量。当变量消失时，
 *                           内存中存储的是数据。所以，还是有数据使用的。
 *
 */
public class e_局部内部类的使用 {}

class Outer4{
    private int a = 100;
    /** 局部方法*/
    public void method(){
        /** 局部变量*/
        final int b = 200;
        int c = 300;
//        int a = 400; //如果该变量没有被注释，那么下面show方法采用就近原则里面的a输出的就是400了。
        /** 局部内部类*/
        class Inner{
            public void show(){
                System.out.println(a);  //100
                //当method()调用完毕后，局部变量b就消失了。
                //所以用final修饰局部变量b后，就变成了常量。
                //内存中存的是数据200，而不是变量b了。
                System.out.println(b);  //200
                System.out.println(c);  //300
            }
        }
        //创建 内部类对象
        Inner i = new Inner();
        i.show();   //100 200
    }
}


class InnerClassTest2{
    public static void main(String[] args) {
        Outer4 o = new Outer4();
        o.method();     //100 200
    }
}

