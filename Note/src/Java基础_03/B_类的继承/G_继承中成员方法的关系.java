package Java基础_03.B_类的继承;

/**
 *      继承中成员方法的关系：
 *          A、子类中的方法和父类中的方法声明不一样，这个太easy~
 *          B、子类中的方法和父类中的方法声明一样时，
 *              通过子类调用方法：
 *                  a、先找子类中，看有没有这个方法，有就使用。
 *                  b、再看父类中，有没有这个方法，有就使用，
 *                     如果没有就报错。
 *
 */
public class G_继承中成员方法的关系 {}

class Father5{
    public void show(){
        System.out.println("show Father_5");
    }
    public void show2(){
        System.out.println("show Father_6");
    }
}

class Son5 extends Father5 {
    public void method(){
        System.out.println("show Son5__1");
    }
    public void show(){
        System.out.println("show Son5__2");
    }
}

class ExtendsDemo6{
    public static void main(String[] args) {
        //子类对象
        Son5 s = new Son5();
        s.show();   //show Son5__2
        s.show2();  //show Father_6
        System.out.println("-----------------------------");
        s.method(); //show Son5__1
//        s.show3();//报错。因为子类与父类都没有！
    }
}


