package Java基础_04.A_形式参数和返回值的问题;

/**
 *      返回值类型：
 *             A、基本类型
 *             B、引用类型
 *                      类：     返回的是该类的对象。
 *                      抽象类： 返回的是该抽象类的子类对象。
 *                      接口：  返回的是该接口的实现类的对象。
 *
 *      链式编程： 每次调用完毕方法后，返回的是一个对象。
 *
 */
public class B_类名_接口_抽象类_作为返回值类型 {}

/** 类*/
class Student2{
    public void study(){
        System.out.println("巴拉巴拉~~");
    }
}

class StudentDemo2{
    public Student2 getStudent(){   //返回类型为：Student2
        return new Student2();      //其实返回匿名对象
    }
}


/** 抽象类*/
abstract class Person2{
    public abstract void study();
}

class PersonDemo2{
    public Person2 getPerson(){     //返回类型为：Person2
        return new Student3();      //其实返回匿名对象
    }
}

class Student3 extends Person2 {
    @Override
    public void study(){
        System.out.println("Too young Too Simple！");
    }

}


/** 接口*/
interface Hobby2{
    public abstract void hobby();
}

class HobbyDemo2{
    public Hobby2 getHobby(){       //返回类型为：Hobby2
        return new Teacher2();      //其实返回匿名对象
    }
}

class Teacher2 implements Hobby2 {
    @Override
    public void hobby(){
        System.out.println("老师爱学生。。");
    }

}


class StudentTest2{
    public static void main(String[] args) {
        /** 类*/
        /** 需求：使用Student2类中的study()方法*/
        //方法一
        Student2 s1 = new Student2();   //巴拉巴拉~~
        s1.study();
        //方法二
        StudentDemo2 sd = new StudentDemo2();
        Student2 s = sd.getStudent();   // 因为 sd.getStudent()返回的是new Student2，
                                        // 所以 Student2 s = new Student2
        s.study();      //巴拉巴拉~~

        /** 抽象类*/
        /** 需求：测试Person2类中的study()方法*/
        PersonDemo2 pd = new PersonDemo2();
        Person2 p = pd.getPerson();     // 因为 sd.getPerson()返回的是new Student3，
                                        // 所以 Person2 p = new Student3  //多态
        p.study();      //Too young Too Simple！
        //也可以这样（链式编程）
        pd.getPerson().study(); //Too young Too Simple！

        /** 接口*/
        HobbyDemo2 hb = new HobbyDemo2();
        Hobby2 h = hb.getHobby();        // 因为 hb.getHobby()返回的是new Teacher2，
                                        // 所以 Hobby2 h = new Teacher2  //多态
        h.hobby();      //老师爱学生。。
        //也可以这样（链式编程）
        hb.getHobby().hobby();  //老师爱学生。。

    }
}


