package Java基础_03.A_面向对象;

/**
 *      private 关键字      “ 私有的 ” 意思。
 *
 *      被 private 修饰的成员 (成员变量、成员方法)，
 *                  只可以在（定义它的类中）被访问。 ⭐⭐⭐⭐
 *
 *      private 是一个权限修饰符
 *              可以修饰 (成员变量) 和 (成员方法)
 *
 */
class Demo1{
    /** 私有化 num 变量。*/
    private int num = 10;

    public void show(){
        System.out.println(num);
    }
    public void method(){
        System.out.println("Too Young Too Simple~");
    }
    public void function(){
        method();
    }
}

public class F_private关键字 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
//        d.num;        //无法调用，因为 num 变量被私有化了。
        d.show();       //10        可以通过调用类里面的show方法来打印出10。
        d.method();     //Too Young Too Simple~
        d.function();   //Too Young Too Simple~
        /**
         * System.out.println(d.num);  错误
         * 不能调用 num 变量，因为 num 已被私有化！
         */
    }
}


