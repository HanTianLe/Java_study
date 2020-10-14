package Java基础_04.A_形式参数和返回值的问题;

/**
 *      形式参数：
 *          A、基本类型
 *          B、引用类型
 *                  类：      (匿名对象讲过。)需要的是该类的对象。
 *                  抽象类：   需要的该抽象类的子类对象。
 *                  接口：     需要的是该接口的实现类对象（子类对象）。
 *
 */

public class A_类名_接口_抽象类_作为形式参数 {}

/** 类*/
class Student{
    public void study(){
        System.out.println("好好学习，天天向上！");
    }
}

class StudentDemo{
    public void method(Student s){ //ss 传给 s ，ss = new Student();  Student s = new Student();
        s.study();
    }
}


/** 抽象类*/
abstract class Person{
    public abstract void study();
}

class Student1 extends Person {
    @Override
    public void study() {
        System.out.println("学习啦！！！");
    }

}

class PersonDemo{
    public void method(Person p){ //pp 传给 p ，pp = new Student1(); Person p = new Student1();  //多态
        p.study();
    }
}

/** 接口*/
interface Hobby{
    public abstract void hobby();
}

class Teacher implements Hobby {
    @Override
    public void hobby() {
        System.out.println("老师爱Java~");
    }

}

class HobbyDemo{
    public void method(Hobby h){ //hh 传给 h , hh = new Teacher(); Hobby hh = new Teacher(); //多态
        h.hobby();
    }
}


class StudentTest{
    public static void main(String[] args) {
        /** 类*/
        //测试Student类
        Student ss = new Student();
        ss.study();                         //好好学习，天天向上！

        //测试StudentDemo类
        StudentDemo sd = new StudentDemo();
        sd.method(ss);                      //好好学习，天天向上！

        //匿名对象 (嵌套)     复习
        //匿名对象作为实际参数转递
        new StudentDemo().method(new Student());    //好好学习，天天向上！
        /** 抽象类*/
        PersonDemo pd = new PersonDemo();
        Person pp = new Student1();
        pd.method(pp);          //学习啦！！！
        /** 接口*/
        HobbyDemo hd = new HobbyDemo();
        Hobby hh = new Teacher();
        hd.method(hh);          //老师爱Java~

    }
}


