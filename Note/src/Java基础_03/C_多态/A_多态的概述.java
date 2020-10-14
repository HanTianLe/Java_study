package Java基础_03.C_多态;

/**
 *      多态：同一个对象(事物)，在不同时刻体现出来的不同状态。
 *
 *      举例：水（固体、气体、液体）
 *
 *      多态的前提：（重要 !!）
 *              A、一定要有继承关系！！！ ⭐⭐
 *              B、一定要有方法重写！！！⭐⭐
 *              C、一定要有父类引用指向子类对象。⭐⭐
 *                 如: 父 f = new 子();
 *
 *      多态中成员访问的特点：
 *              A、成员变量
 *                      编译看（左边），运行看（左边）。    (包括静态变量)
 *              B、构造方法
 *                      创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化。
 *     (特殊)   C、成员方法
 *                      编译看（左边），运行看（右边）。
 *              D、静态方法
 *                      编译看（左边），运行看（左边）。
 *
 *      由于 成员方法 存在重写，所以它运行看 右边。
 */
public class A_多态的概述 {}

class Fu {
    public int num = 10;
    public Fu(){
        System.out.println("无参构造 Fu");
    }
    public void show(){
        System.out.println("show Fu");
    }
    public void show1(){
        System.out.println("show1 fu");
    }
    public static void function(){
        System.out.println("function Fu");
    }
}

class Zi extends Fu {
    public int num = 100;
    public int num2 = 200;
    public void show(){
        System.out.println("show Zi");
    }   //如果该方法注释掉，则说明Zi类没有重写Fu类方法，而是正常继承了。
    public void method(){
        System.out.println("method Zi");
    }
    public static void function(){
        System.out.println("function Zi");
    }
}

class DuoTaiDemo{
    public static void main(String[] args) {
        /** 父 f = new 子();*/
        Fu f = new Zi();            //无参构造 Fu
        /** 编译时，父类里面有 num。运行时，父类里面有 num。*/
        System.out.println(f.num);  //10
        /** 编译时，父类里面找不到符号 num2。*/
//        System.out.println(f.num2);
        /** 编译时，父类里面有show方法。运行时，子类里面有show。*/
        f.show();       //show Zi
        /** 编译时，父类里面有show1方法。运行时，子类里面没有show1，那么子类就继承了父类的show1。*/
        f.show1();      //show1 fu
        /** 编译时，父类里面找不到 method方法。所以报错。*/
//        f.method();
        /** 编译时，父类里面有function，运行时，父类里面有function。*/
        f.function();   //function Fu
    }
}


