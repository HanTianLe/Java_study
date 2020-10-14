package Java基础_03.B_类的继承;

/**
 *      继承的注意事项：
 *              A、子类只能继承父类所有 (非私有的成员)。（如：成员变量 和 成员方法）
 *              B、子类不能继承父类的 (构造方法)，但可以通过 super关键字 去访问父类的 (构造方法)。
 *              C、不要为了部分功能而去继承！
 *
 */
public class C_继承的注意事项 {}

class Father1{
    /** 私有变量*/
    private int num1 = 10;
    /** 公共变量*/
    public int num2 = 20;

    /** 私有方法*/
    private void method(){
        System.out.println(num1);
        System.out.println(num2);
    }
    /** 公共方法*/
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
}

class Son1 extends Father1 {
    /** 公共方法*/
    public void function(){
        //System.out.println(num1); 子类不能继承父类的私有成员变量。
        System.out.println(num2);
    }
}

class ExtendsDemo2{
    public static void main(String[] args){
        Son1 s = new Son1();
        //s.method();  子类Son1不能继承父类Father1的私有方法，所以不能调用。
        s.show();
        s.function();
    }
}


