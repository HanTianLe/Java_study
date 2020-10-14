package Java基础_04.D_匿名内部类;

/**
 *      很重要！！！      很重要！！！
 *      很重要！！！      很重要！！！
 *
 *      匿名内部类：  就是内部类的简化写法。
 *
 *      前提： 存在一个（类）或（接口）！
 *
 *      格式：
 *          new 类名或者接口名() {
 *          重写方法;
 *          };
 *
 *
 *      本质： 代表的不是该抽象类或接口的对象。！！！
 *            而是一个（继承了该类）或者（实现了该接口）的（子类匿名对象）。!!!
 *
 *
 */
public class a_匿名内部类的格式 {}

/** 定义一个Inter接口*/
interface Inter{
    public abstract void show();
}

class Outer{
    public void method(){
        /** 匿名内部类
         *  仅仅是对象，一个实现了Inter接口的（子类匿名对象）！！！
         *  调用method方法时，下面的匿名对象无意义。
         */
        new Inter() {
            @Override
            public void show() {
                System.out.println("show");
            }
        };
    }
}

class InnerClassDemo{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();             //什么都没有！！
    }
}


