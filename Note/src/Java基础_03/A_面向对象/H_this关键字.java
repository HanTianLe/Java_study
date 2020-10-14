package Java基础_03.A_面向对象;

/**
 *      this 关键字
 *
 *      代表：(当前类的对象)引用。⭐⭐
 *
 *      使用方法：               格式
 *          A、调用成员变量    this.变量名            调用本类的成员变量
 *          B、调用成员方法    this.方法名(参数..)    调用本类的成员方法
 *          C、调用构造方法    this.(参数..)         调用本类的构造方法
 *
 *      注意：谁调用这个方法，在改方法内部的 this 就代表谁。
 *           (方法被哪个对象调用，this 就代表那个对象。)
 *
 *      之所以推荐使用 this 是为了 “见名知意”。
 *
 */
class Student3{
    private String name;
    private int age;

    /** 本类无参构造方法*/
    Student3(){
        this.print();   /** 调用成员 print 方法*/
    }
    /** 本类有参构造方法1*/
    Student3(int x){
        this();         /** 调用无参构造方法*/
        System.out.println("调用了无参构造方法");
    }
    /** 本类有参构造方法2*/
    Student3(int x,int y){
        this(x);         /** 调用有参构造方法1*/
        System.out.println("调用了有参构造方法1");
    }
    
    /** 定义了 print 方法*/
    public void print() {
        System.out.println("*********************");
    }
    /** 姓名获取值*/
    public String getName(){
        return name;
    }
    /** 姓名赋值*/
    public void setName(String name){
        this.name = name;
    }
    /** 年龄获取值*/
    public int getAge(){
        return age;
    }
    /** 年龄赋值*/
    public void setAge(int age){
        this.age = age;
    }
}

public class H_this关键字 {
    public static void main(String[] args) {
        Student3 s = new Student3();    //无参构造方法Student3调用了print方法
        s.setName("张仪");
        s.setAge(100);
        System.out.println("学生："+s.getName());
        System.out.println("年龄："+s.getAge());

        System.out.println(new Student3(3).getAge());       //调用无参构造方法，无参构造方法又调用成员 print 方法。
        System.out.println(new Student3(4).getName());      //调用无参构造方法，无参构造方法又调用成员 print 方法。
        System.out.println(new Student3(1,2).getName()); //调用有参构造方法1,
                                                               //有参构造方法1又调用无参构造方法,
                                                               //无参构造方法又调用成员 print 方法。
    }
}


