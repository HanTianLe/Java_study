package Java基础_04.B_包;

/**
 *      修饰符：
 *          权限修饰符：private、默认的、protected、public
 *          状态修饰符：static、final
 *          抽象修饰符：abstract
 *
 *      类：（可以用哪些修饰？）
 *          权限修饰符：默认的、public
 *          状态修饰符：final     （static能修饰内部类）
 *          抽象修饰符：abstract
 *
 *      成员变量：（可以用哪些修饰？）
 *          权限修饰符：private、默认的、protected、public
 *          状态修饰符：static、final
 *
 *      构造方法：（可以用哪些修饰？）
 *          权限修饰符：private、默认的、protected、public
 *
 *      成员方法：（可以用哪些修饰？）
 *          权限修饰符：private、默认的、protected、public
 *          状态修饰符：static、final
 *          抽象修饰符：abstract
 *
 */
class test{
    private test(int x){}
    test(int x,int y){}
    protected test(String a){}
    public test(int a,String b){}
}

final class test1{}

abstract class test2{
    //成员方法
    abstract void show6();
}


public class D_常见的修饰符 {
    //变量
    private int x;
    protected int y;
    public int z;
    static int a;
    final int b = 2;
    //成员方法
    private void show(){}
    void show1(){}
    protected void show2(){}
    public void show3(){}
    static void show4(){}
    final void show5(){}

}



