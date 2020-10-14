package Java基础_03.D_抽象类;

/**
 *          【猫狗案例】
 *
 *   猫狗案例
 *      具体事物：猫、狗
 *      共   性：姓名、年龄、吃饭
 *
 *   分析：
 *      猫：
 *          成员变量：姓名、年龄
 *          构造方法：无参、带参
 *          成员方法：吃饭（吃鱼）
 *      狗：
 *           成员变量：姓名、年龄
 *           构造方法：无参、带参
 *           成员方法：吃饭（吃肉）
 *
 *      因为有共性，所以就提取了一个父类：动物类。
 *      但是又由于吃饭的内容不一样，所以吃饭的这个方法是抽象的，
 *      所以吃饭的方法是抽象方法，那么类就必须为抽象类！！
 *
 *      抽象动物类：
 *           成员变量：姓名，年龄
 *           构造方法：无参，带参
 *           成员方法：吃饭()
 *
 *      狗类：继承动物类，
 *           重写吃饭（）;
 *
 *      猫类：继承动物类，
 *           重写吃饭（）;
 *
 */
public class C_抽象类猫狗案例 {}

abstract class Animals{
    private String name;
    private int age;

    public Animals(){}
    public Animals(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    /** 定义一个吃饭抽象方法*/
    public abstract void eat();
}


class Dogs extends Animals {
    public Dogs(){}

    public Dogs(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉~");
    }

}


class Cats extends Animals {
    public Cats(){}

    public Cats(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼~");
    }

}


class AbstractTest{
    public static void main(String[] args) {
        //方式1
        Dogs d = new Dogs();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+"----"+d.getAge());
        //方式2
        Dogs d2 = new Dogs("旺财2号",4);
        System.out.println(d2.getName()+"----"+d2.getAge());
        System.out.println("-----------------------------------");
        //多态
        Animals a = new Dogs();
        a.setName("旺财3号");
        a.setAge(5);
        System.out.println(a.getName()+"----"+a.getAge());
        a.eat();
    }
}






