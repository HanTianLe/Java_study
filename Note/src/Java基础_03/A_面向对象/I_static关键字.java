package Java基础_03.A_面向对象;

/**
 *      static关键字       “ 静态的 ” 意思。
 *
 *      修饰: A、成员变量  B、成员方法
 *
 *      特点:
 *          A、随着类的加载而加载。
 *          B、优先于对象存在。
 *          C、被（类的所有对象）共享。 (重要)⭐⭐
 *          D、可以通过（类名）调用。  (推荐使用)  ⭐⭐
 *          E、可以被（对象名）调用。  ⭐⭐
 *                  静态修饰的内容一般称为：与类相关的，类成员。
 *                  非静态修饰的内容一般称为：对象成员。
 *
 */
class Person{
    //非静态
    String name;
    //非静态
    int age;
    //非静态
    String times;
    //静态
    static String country;


    /** 非静态变量*/
    int num1 = 1;
    /** 静态变量*/
    static int num2 = 2;


    /** 构造方法1  (无参)*/
    public Person(){
    }
    /** 构造方法2  (带参)(重载)*/
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    /** 构造方法3  (带参)(重载)*/
    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }
    /** 构造方法4  (带参)(重载)*/
    public Person(String name,int age,String times,String country){
        this.name = name;
        this.age = age;
        this.times = times;
        this.country = country;
    }


    /** 获取个人所有信息的方法*/
    public void show(){
        System.out.println("姓名："+name+"\t"+"年龄："+age+"\t"+"时期："+times+"\t"+"国籍："+country);
    }

    /** 静态方法*/
    public static void die(){
        System.out.println("全部嘶啦嘶啦滴~~~~");
    }

}


public class I_static关键字 {
    public static void main(String[] args) {
        //带参构造方法 对象 来赋值。
        Person p1 = new Person("白起",400,"战国","秦国"); //times非静态，country静态
        Person p2 = new Person("张仪",200);
        Person p3 = new Person("商鞅",100);
        p1.show();  //姓名：白起	年龄：400	时期：战国	国籍：秦国
        p2.show();  //姓名：张仪	年龄：200	时期：null	国籍：秦国
        p3.show();  //姓名：商鞅	年龄：100	时期：null	国籍：秦国
        System.out.println("-----------------------------------------------");
        Person.die();   //通过类名调用静态方法
        p1.die();       //通过对象名调用静态方法
        /**
         * times 变量不是静态变量，所以不会被对象所共享。
         * 而 country 变量是静态变量，所以会被所有对象所共享，所以下面的p2、p3都会被共享。
         */
        System.out.println("-----------------------------------------------");
        /** 非静态变量 的调用*/
        System.out.println(p1.num1);        //1
        /** 静态变量 通过类名调用*/
        System.out.println(Person.num2);    //2
        /** 静态变量 通过对象名调用*/
        System.out.println(p1.num2);        //2

    }
}


