package Java基础_03.C_多态;

/**
 *      多态的弊端：
 *              不能使用子类的特有功能。
 *
 *      如果非要使用，如何做呢？
 *              A、创建子类对象调用方法即可。（虽然可以，但不合理，占内存。）
 *              B、把父类的引用强制转换为子类的引用。（向下转型）
 *
 *      对象间的转型问题：
 *              A、向上转型：
 *                  Fu f = new Zi();
 *              B、向下转型：
 *                  Zi z = (Zi)f;      该 f 必须是能够转换为 Zi 的。
 *
 */
public class C_多态的弊端 {}

class Fu1{
    public void show(){
        System.out.println("show fu");
    }
}

class Zi1 extends Fu1 {
    public void show(){
        System.out.println("show zi");
    }
    public void method(){
        System.out.println("method zi");
    }
}


class DuoTaiDemo1{
    public static void main(String[] args) {
        Fu1 f = new Zi1();
        f.show();   //show zi   多态中（成员方法）访问的特点： 编译看（左边），运行看（右边）。
//        f.method();
        System.out.println("--------------------------------------");
        /** 能不能把父的引用赋值给子的引用呢？*/
        Zi1 z = (Zi1)f; //之所以把 f 强转为子类，因为 f 本身就是子类。
        z.show();   //show zi
        z.method(); //method zi
    }
}



