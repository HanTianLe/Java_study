package Java基础_03.E_接口;

/**
 *          类与类：    继承关系————只能单继承，不能多层继承。！！
 *          类与接口：  实现关系————可以单实现，也可以多实现。！！
 *                                 并且还可以在继承一个类的同时实现多个接口。
 *          接口与接口：继承关系————可以单继承，也可以多继承。！！
 *
 */
public class C_类与类_类与接口_接口与接口 {}

/** 父亲接口*/
interface Father{
    public abstract void show();
}

/** 母亲接口*/
interface Mother{
    public abstract void show2();
}

/** 妹妹接口*/
interface Sister extends Father, Mother {}


//class Son implements Father,Mother  //（extends Object可以省略）
class Son extends Object implements Father, Mother {

    @Override
    public void show() {
        System.out.println("show son");
    }

    @Override
    public void show2() {
        System.out.println("show2 son");
    }
}

class TestDemo{
    public static void main(String[] args) {
        /** 如果实现了多个接口，对应的接口调用对应的方法！！！！*/
        Father f = new Son();
        f.show();       //show son
        Mother m = new Son();
        m.show2();      //show2 son
    }
}

