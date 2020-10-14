package Java基础_04.D_匿名内部类;

/**
 *      不管是不是 抽象类，
 *
 *      都能用匿名内部类都能用！！！
 *
 */
public class d_测试 {}

/** 抽象类 */
abstract class Test{
    public abstract void show();
}

/** 具体类 */
class Test1{
    public void show(){
        System.out.println("原来的方法。");
    }
}


class OutTest{
    public void method(){
        /** 子类抽象对象 */
        new Test() {
            @Override
            public void show() {
                System.out.println("重写啦~~~");
            }
        }.show();   //重写啦~~~

        Test t = new Test() {
            @Override
            public void show() {
                System.out.println("利用多态来重写啦~");
            }
        };
        t.show();   //利用多态来重写啦~


        new Test1(){
            @Override
            public void show() {
                System.out.println("原来的方法，重写啦~~~");
            }
        }.show();   //原来的方法，重写啦~~~

        Test1 t1 = new Test1() {
            @Override
            public void show() {
                System.out.println("原来的方法，利用多态来重写啦~");
            }
        };
        t1.show();   //原来的方法，利用多态来重写啦~


    }
}


class OutTestDemo{
    public static void main(String[] args) {
        OutTest ot = new OutTest();
        ot.method();
    }
}



