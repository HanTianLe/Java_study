package Java基础_03.B_类的继承;

/**
 *      继承中构造方法的关系：
 *          A、子类中所有的构造方法（无论是有参还是带参）默认都会访问父类中（空参数的构造方法）。
 *              原因：
 *                  因为子类会继承父类中的数据，可能还会使用父类的数据。
 *                  所以，子类初始化之前，一定要先完成父类数据的初始化。
 *
 *          B、子类的每一个构造方法的第一条语句默认都是：super();
 *              （没写系统默认有）
 *
 */
public class F_继承中构造方法的关系 {}

class Father4{
    public Father4(){
        System.out.println("Father4的无参构造方法");
    }

    public Father4(String name){
        System.out.println("Father4的带参构造方法"+"****"+name);
    }
}

class Son4 extends Father4 {
    public Son4(){
//        super();             //两种调用都可以有，如果都没有，默认super();
        super("哈哈");  //如果只有super("哈哈");则调用父类有参构造。  但是不能全有！！！
        System.out.println("Son4的无参构造方法");
    }

    public Son4(String name){
//        super();      //两种调用都可以有，如果都没有，默认super();
        super(name);    //如果只有super(name);则调用父类有参构造。  但是不能全有！！！
        System.out.println("Son4的带参构造方法"+"--"+name);
    }
}

class ExtendsDemo5{
    public static void main(String[] args) {
        Son4 s = new Son4();
        System.out.println("-----------------------");
        Son4 s2 = new Son4("Assassin");
    }
}

/**
 *      如果父类没有（无参构造方法），那么子类的构造方法会出现什么现象呢？如何解决呢？
 *      答：会报错！
 *
 *      解决方法：
 *          A、在父类加一个无参构造方法。
 *          B、通过使用super关键字去显示的调用父类的带参构造方法。
 *          C、子类通过this去调用本类的其他构造方法。
 *             (子类中一定要有一个访问了父类的构造方法，否则父类数据就没有初始化。)
 *
 *          注意事项：
 *              this(...)或者super(...) 必须出现在第一条语句上。
 *              如果不是放在第一条语句上，就可能对父类的数据进行多次初始化。
 *              所以必须放在第一条语句上。
 *
 */
class Fu1{
//    public Fu1(){
//        System.out.println("Fu1类的无参构造方法");
//    }
    public Fu1(String name){
        System.out.println("Fu1类的带参构造方法"+"----"+name);
    }
}

class Zi1 extends Fu1 {
    public Zi1(){
//        super();               //是错误的！ 如果父类只有（有参构造），那么子类是不能写super(); 的。！！！！！
        super("随便给啦~");   //这时，子类必须调用父类有参构造。！！
        System.out.println("Zi1类的无参构造方法");
    }

    public Zi1(String name,int age){
        super(name);
        System.out.println("两个参数构造方法");
    }

    public Zi1(String name){
//        super("随便给");
        this(name,2);
        System.out.println("Zi1类的带参构造方法"+"*****"+name);
    }
}

class Ceshi1{
    public static void main(String[] args){
        Zi1 z = new Zi1();
        System.out.println("----------------------------");
        Zi1 z1 = new Zi1("鬼谷");
    }
}

/**
 * Fu1类的带参构造方法----随便给啦~
 * Zi1类的无参构造方法
 * ----------------------------
 * Fu1类的带参构造方法----鬼谷
 * 两个参数构造方法
 * Zi1类的带参构造方法*****鬼谷
 */


