package Java基础_04.C_内部类;

/**
 *      成员内部类的修饰符：
 *          private：为了保证数据的安全性。
 *          static ：为了让数据访问更方便。
 *           注意：
 *              （静态内部类）访问的（外部类数据）必须用静态修饰。
 *
 *      成员内部类 被 static 修饰后，访问的方式为
 *       格式：
 *          外部类名.内部类名 对象名 = new 外部类名.内部类名();
 *
 */
public class c_成员内部类的修饰符 {}

class Outer2{
    private int a = 1;
    private static int b = 2;
    /** 内部类之所以能用静态修饰符修饰，是因为内部类可以看成是外部类成员。*/
    /** 静态内部类*/
    public static class Inner{
        //非静态方法
        public void show(){
            //System.out.println(a);  只能访问静态
            System.out.println(b);
        }
        //静态方法
        public static void show2(){
//            System.out.println(a);  //只能访问静态
            System.out.println(b);
        }
    }
}

class InnerClassDemo1{
    public static void main(String[] args) {
        /** 访问内部类。*/
        // 错误 ！
//        Outer2.Inner oi = new Outer2().new Inner();
        /***
         *      （成员内部类）被静态修饰后，访问的方式为
         *      格式：
         *          外部类名.内部类名 对象名 = new 外部类名.内部类名();
         */
        Outer2.Inner oi = new Outer2.Inner();
        oi.show();    //2
        oi.show2();   //2
        // show2()的另一种调用。
        // show2()是Inner的静态成员，Inner有是Outer2的静态成员；
        // 静态成员可以用（类名）或者（对象名）直接调用。
        Outer2.Inner.show2();   //2
    }
}

