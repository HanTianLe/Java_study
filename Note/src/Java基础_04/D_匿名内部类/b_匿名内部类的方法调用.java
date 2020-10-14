package Java基础_04.D_匿名内部类;

/**
 *      如何调用匿名内部类的方法？
 *
 *      应用场景：
 *          A、调用方法：    仅仅只调用一次的时候。 (调用多次的时候，不适合使用。)
 *                      优点： 调用完毕，就是垃圾。可以被垃圾回收器回收。
 *                      格式： new 类名/接口名(){重写方法;}.被调用的方法名();
 *
 *
 *          B、多态。   优点： 可以调用多次。
 *                     格式：类名/接口名 对象名 = new 类名/接口名(){重写方法;};
 *
 *
 *      匿名内部类：
 *              其实原理跟（匿名对象）差不多~~~~~
 *
 */
public class b_匿名内部类的方法调用 {}

interface Inter1{
    public abstract void show();
    public abstract void show2();
}

class Outer1{
    public void method(){
        /** 匿名内部类:
         *  仅仅是实现了Inter1接口的子类匿名对象，
         *  如果后面接了实现了接口的方法show()
         *  则表示调用了show()方法。
         */
        // 下面这两个匿名内部类（本质是对象!），虽然名字一样，
        // 但其实是分别表示两个不同的对象，分别调用一个方法。
        // 匿名内部类调方法只能调用一次！
        new Inter1() {
            @Override
            public void show() {
                System.out.println("show");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        }.show();   //show

        new Inter1(){
            @Override
            public void show(){
                System.out.println("show");
            }

            @Override
            public void show2(){
                System.out.println("show2");
            }
        }.show2();   //show2

        /** 改进方法*/   /** 多态！！*/
        /**
         * 子类匿名对象是对象，主要是子类的对象！
         * 那么它就可以赋给接口 Inter1 。
         * 那就是多态的原理了。
         */
        //编译看左边，左边有Inter1接口，
        //运行看右边，右边有Inter1
        Inter1 i = new Inter1() {
            @Override
            public void show() {
                System.out.println("改进后 show1");
            }

            @Override
            public void show2() {
                System.out.println("改进后 show2");
            }
        };
        i.show();   //改进后 show1
        i.show2();  //改进后 show2
        //两个 i 其实都是同一个对象。
        //同一个对象，调用了两个方法show和show2。
    }
}

class InnerClassDemo1{
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.method(); //show
                    //show2
                    //改进后 show1
                    //改进后 show2
    }
}




