package Java基础_03.A_面向对象;

/**
 *      格式：    类名 对象名 = new 类名();
 *
 *      类：      是一组相关的属性和行为的集合。是一个抽象的概念。
 *      对象：    是该类事物的具体表现形式。具体存在的个体。
 *
 *      举例：    学生：类
 *                班长：对象
 */
class Student{
    //姓名
    String name;    //null
    //年龄
    int age;        //0
    //地址
    String address; //null

    //定义方法
    //1、学习的方法
    public void study() {
        System.out.println("学生学习");
    }

    //2、吃饭的方法
    public void eat() {
        System.out.println("吃饭");
    }

    //3、睡觉的方法
    public void sleep() {
        System.out.println("睡觉");
    }
}

public class A_面向对象格式 {
    public static void main(String[] args) {
        /** 类名 对象名 = new 类名();*/
        Student s = new Student();

        /** 输出成员变量*/
        System.out.println("------------------------------------输出成员变量");
        //一般写法
        System.out.println(s.name); //null
        System.out.println(s.age);  //0
        System.out.println(s.address);  //null
        //改进写法
        System.out.println(s.name+"---"+s.age+"---"+s.address);

        System.out.println("-----------------------------------给成员变量赋值");
        /** 给成员变量赋值*/
        s.name = "萨瓦迪卡";
        s.age = 20;
        s.address = "你猜";
        System.out.println(s.name+"---"+s.age+"---"+s.address);

        /** 调用方法*/
        System.out.println("----------------------------------------调用方法");
        s.study();
        s.eat();
        s.sleep();
    }
}

