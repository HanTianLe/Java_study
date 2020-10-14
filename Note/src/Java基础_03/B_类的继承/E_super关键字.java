package Java基础_03.B_类的继承;

/**
 *      super 关键字
 *
 *      重要！！！！！
 *      子类不能继承父类的 (构造方法)，
 *      但可以通过 super关键字 去访问父类的 (构造方法)。
 *
 *      this 与 super 的区别：
 *          this: 本类对象的引用。
 *          super: 代表父类存储空间的标识（可理解为：父类的引用）
 *
 *      如何使用？
 *          A、调用-成员变量
 *              this.成员变量名   调用本类的成员变量
 *              super.成员变量名  调用父类的成员变量
 *          B、调用构造方法
 *              this(...)   调用本类的构造方法
 *              super(...)  调用父类的构造方法
 *          C、调用-成员方法
 *              this.成员方法名   调用本类成员方法
 *              super.成员方法名  调用父类成员方法
 *
 */
public class E_super关键字 {}

class Father3{
    /** 成员变量*/
    public int num = 10;
    /** 成员方法*/
    public void test1(){
        System.out.println("调用了父类成员方法test1~");
    }
}

class Son3 extends Father3 {
    /** 成员变量*/
    public int num = 20;
    /** 成员方法*/
    public void test1(){
        System.out.println("调用了本类成员方法test1~");
    }
    public void test2(){
        System.out.println("调用了本类成员方法test2~");
    }

    public void show(){
        int num = 30;
        this.test1();                   // 调用本类的成员方法test1。
        this.test2();                   // 调用本类的成员方法test2。
        System.out.println(num);        // 30   调用本方法里面的num（就近原则）。
        System.out.println(this.num);   // 20   调用了本类的成员变量。
                                        // 那么 this.name就表示类Son3里面的成员变量num。
        System.out.println(super.num);  // 10   调用了父类的成员变量。
        super.test1();                  // 调用父类成员方法test1。
    }
}

class ExtendsDemo4{
    public static void main(String[] args) {
        Son3 s = new Son3();
        s.show();
    }
}

/**
 *      下面专门测试super调用父类构造方法    (重要!!!!!!!)
 */
class Fu {
    /** 构造方法 (无参)*/
    Fu(){
        System.out.println("调用父类无参构造方法~");
    }
    /** 构造方法 (有参)*/
    Fu(int x){
        System.out.println("调用父类有参构造方法！");
    }
}

class Zi extends Fu {
    Zi(){
        super();      //调用了父类无参构造方法      //如果把super();注释掉，那么还是默认调用父类无参构造方法了。
//        super(3);   //调用了父类有参构造方法
        System.out.println("调用子类无参构造方法！");
    }

    Zi(int i,int j){
//        super();      //调用了父类无参构造方法
        super(4);    //调用了父类有参构造方法     //如果把super( x:4);注释掉，那么就是默认调用父类无参构造方法了。
        System.out.println("调用子类有参构造方法!!");
    }
}

class Ceshi{
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println("-----------------------");
        Zi zz = new Zi(1,2);
    }
}
/**
 *  1、创建子类对象调用(子类的构造方法)的时候会先调用(父类的构造方法)，
 *     在子类的构造方法中调用父类的构造方法是用super()，如果没有写super()，则默认调用父类的(无参构造方法)。
 *     但此时如果父类写了(有参的构造方法)，则必须在子类的构造器中写明 super(父类构造器参数)。
 */
/**
 *  2、在父类没有写（有参构造方法）的情况下，
 *     不管父类有没有写（无参构造方法），为节省代码量，
 *     (子类无参构造方法)可以写，也可以不写。       提示：这时候子类不能写（有参构造方法！！）
 *     但是实际上是已经写了，系统默认调用(父类无参构造方法)，
 */
/**
 *  3、在父类里只写了一个（有参构造方法），那么这个父类就没有（无参构造方法）了。
 *     子类在继承父类时，子类就需要在其构造方法中明确的通过super()调用父类的（带参构造方法），
 *     否则构造不出父类，从而也构造不出他自己了。
 */
/**
 *  4、当在父类里面（无参构造方法）和（有参构造方法）同时存在时，
 *     子类可以（无参构造方法），
 *      也可以无参构造方法中通过super()来调用父类的（带参构造方法）。
 *
 */

