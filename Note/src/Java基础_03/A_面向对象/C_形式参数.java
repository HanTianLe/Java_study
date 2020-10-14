package Java基础_03.A_面向对象;

/**
 *      形式参数的问题：
 *              基本类型：形式参数的改变不影响实际参数。
 *              引用类型：形式参数的改变直接影响实际参数。
 */
class Demo{
    public int sum(int a,int b){
        return a+b;
    }
}

class Students{
    public void show(){
        System.out.println("我爱学习！");
    }
}

class StudentsDemo{
    /** 如果看到一个方法的形式参数是一个类类型（引用类型），其实是需要该类的对象！！*/
    public void method(Students s){ /**调用的时候，把main方法中的 s 传递到了这里。
                                        Students s 就相当于 Students s = new Students(); */
        s.show();
    }
}

public class C_形式参数 {
    public static void main(String[] args) {
        //形式参数的基本类型的调用
        Demo d = new Demo();
        System.out.println(d.sum(10,20));   //30
        System.out.println("-----------------");
        StudentsDemo sd = new StudentsDemo();
        Students s = new Students();
        sd.method(s);       //我爱学习！
    }
}

