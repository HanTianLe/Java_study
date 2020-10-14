package Java基础_04.D_匿名内部类;

/**
 *
 *      按照要求，补全下面代码
 *
 *      interface Inters{ void show();}
 *      class Outers{//补全代码}
 *      class OuterDemo{
 *          public static void main(String[] args) {
 *              Outers.method().show();
 *          }
 *      }
 *      在控制台输出 "Hello World"
 */
public class e_作业 {}

interface Inters{
    void show();
    //系统默认为：public abstract void show();
}

class Outers{
    //静态方法可以用类名直接调用。
    public static Inters method(){
        //子类对象----子类匿名对象
        //返回值类型是接口类型：Inters
        return new Inters() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}

class OuterDemo{
    public static void main(String[] args) {
        Outers.method().show();
        /**
         *  1、Outers.method()可以看出，method应该是Outers中的一个静态方法。
         *  2、Outers.method().show();可以看出Outers.method()是对象，
         *     那么method()方法的返回值是对象。
         *     又由于接口Inters中有一个show()方法，
         *     所以method()返回值类型是一个接口。
         */
    }
}

