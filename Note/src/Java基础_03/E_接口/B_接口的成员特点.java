package Java基础_03.E_接口;

/**
 *      接口的成员特点：
 *              成员变量： 只能是常量，并且是静态的！！！（无法重新赋值！）
 *                        默认修饰符：public static final     （建议手动给出）
 *              构造方法： 接口是不能有构造方法的！！！
 *              成员方法： 只能是抽象方法！！！
 *                        默认修饰符：public abstract     （建议手动给出）
 *
 *      所有的类都默认继承自一个类： Object
 *      类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 *
 *      注意：跟抽象类一样，接口一旦定义了抽象方法，
 *           那么其实现类（一定要）对该抽象方法重写！！！
 *
 */
public class B_接口的成员特点 {}

interface Inter{
    /** 成员变量*/
    public int num = 10;            //系统会自动识别成：public static final int num = 10;
    public final int num2 = 20;     //系统会自动识别成：public static final int num2 = 20;

    // 接口是没有构造方法的！！
//     public Inter(){}

    /** 成员方法*/
    abstract void show();   //默认有public  系统会自动识别成：public abstract void show();
    public void method();   //默认抽象的    系统会自动识别成：public abstract void method();
}


class InterImpl implements Inter {
    public InterImpl(){
        super();    //是 Object 的super。
    }

    @Override
    public void show() {
        System.out.println("重写接口方法");
    }
    @Override
    public void method() {
        System.out.println("重写接口方法");
    }
}


class InterfaceDemo2{
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
//        i.num = 100;
//        i.num = 200;
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
    }
}


