package Java基础_03.B_类的继承;

/**
 *      Java继承的特点：
 *          A、Java只支持单继承，不支持多继承。 ⭐⭐⭐⭐
 *              有些语言是支持多继承的。他们的格式：extends 类1,类2....
 *
 *          B、Java支持多层继承(继承体系)
 *
 */
public class B_继承的特点 {}

class GrandFather{
    public void show(){
        System.out.println("我是爷爷");
    }
}

class Father extends GrandFather {
    public void method(){
        System.out.println("我是爸爸");
    }
}

class Son extends Father {}

/** Son类同时拥有了show方法和method方法*/

class ExtendsDemo1{
    public static void main(String[] args) {
        Son s = new Son();
        s.method(); //使用父亲的方法
        s.show();   //使用爷爷的方法
    }
}

