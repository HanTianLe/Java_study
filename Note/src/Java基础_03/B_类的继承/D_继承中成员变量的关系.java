package Java基础_03.B_类的继承;

/**
 *      继承中成员变量的关系：
 *          A、子类中的成员变量和父类中的成员变量名称不一样，这个太简单。
 *          B、子类中的成员变量和父类中的成员变量名称一样时，就近原则。
 *                  在子类方法中访问一个变量的查找顺序：
 *                     a、在子类方法的局部范围找，有就使用
 *                     b、在子类的成员范围找，有就使用
 *                     c、在父类的成员范围找，有就使用
 *                     d、如果找不到就报错
 *
 */
public class D_继承中成员变量的关系 {}

class Father2{
    public int num = 10;
    public void method() {
        int num = 40;
    }
}

class Son2 extends Father2 {
    public int num2 = 20;
    public void show() {
        int num = 50;
        System.out.println(num);    //50  (就近原则)
        System.out.println(num2);   //20  (就近原则)
    }
}

class Sunzi extends Father2 {
    public int num = 30;
    public void show() {
        System.out.println(num);    //30  (就近原则)
    }
}


class ExtendsDemo3{
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.show();   //  50 20
        Sunzi sc = new Sunzi();
        sc.show();//30
    }
}
