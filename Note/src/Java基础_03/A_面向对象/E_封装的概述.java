package Java基础_03.A_面向对象;

/**
 *      封装的概述：是指隐藏对象的属性和实现细节，仅对外提供 公共的访问方式。
 *
 *      封装 包括类、方法、private修饰成员变量。
 *
        优点：
 *          A、隐藏实现细节，提供公共的访问方式
 *          B、提高代码的复用性
 *          C、提高代码的安全性
 *
 *      private：私有的。
 *              可以修饰 (成员变量) 和 (成员方法)。
 *              是封装的一种体现。
 *
 *      注意：被private修饰的 (成员变量) 只能在本类中访问！！！
 *
 *
 */
class teacher{
    String name;
    /** 私有化 age 成员变量*/
    private int age;
    /**显示所有成员变量方法*/
    public void show(){
        System.out.println("教师名："+name);
        System.out.println("年龄："+age);
    }
    /**
     * age 数据效验方法
     * @param a
     */
    public void setAge(int a){
        if (a > 0 && a < 120){      //&&：双与
            age = a;
        }else {
            System.out.println("年龄输入错误！");
        }
    }
}


class Student2{
    String name;    //默认初始化为null
    int age;        //默认初始化为 0
    /**
     * age 数据效验方法
     * 返回值类型：void
     * @param a
     */
    public void setAge(int a){
        if (a < 0 || a > 120){      //||：双或
            System.out.println("年龄输入错误！");
        }else {
            age = a;
        }
    }

    /** 显示所有成员变量方法*/
    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

}


public class E_封装的概述 {
    public static void main(String[] args) {
        /** 创建 Students2 类对象*/
        Student2 s = new Student2();
        s.show();
        System.out.println("----------------------------");

        /** 给成员变量赋值*/
        s.name = "韩天乐";
        s.age = 22;
        s.show();
        System.out.println("----------------------------");

        /** 通过方法给值*/
        s.name = "123木头人";
        s.setAge(40);
        s.show();
        System.out.println("----------------------------");

        /** 举个反例*/
        s.name = "123cnm";
        s.setAge(600);  //虽然600显示报错，但是打印会显示上面的年龄40！
        s.show();
        System.out.println("----------------------------");



        /** 创建 teacher 类的对象*/
        teacher t = new teacher();
        t.name = "孔子";
    /**
      * t.age = 100;
      * 因为 teacher 类里面的成员变量 age 私有化了。
      * 所以本类不能调用且赋值。*/
        t.setAge(100);  /** 通过方法却能给私有 age 赋值*/
        t.show();
    }
}
