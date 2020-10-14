package Java基础_03.C_多态;

public class F_南北方人案例 {}

class Person{
    public void eat(){
        System.out.println("吃饭");
    }
}


class SouthPerson extends Person {
    public void eat(){
        System.out.println("炒菜，吃米饭");
    }
    public void jingShang(){
        System.out.println("经商");
    }
}


class NorthPerson extends Person {
    public void eat(){
        System.out.println("炖菜，吃馒头");
    }
    public void yanJiu(){
        System.out.println("研究");
    }
}


class 南北方人测试类{
    public static void main(String[] args) {
        /** 南方人*/
        Person p = new SouthPerson();
        p.eat();
        System.out.println("----------------------");
        SouthPerson sp = (SouthPerson)p;
        sp.eat();
        sp.jingShang();
        System.out.println("----------------------");

        /** 北方人*/
        p = new NorthPerson();
        p.eat();
        System.out.println("----------------------");
        NorthPerson np = (NorthPerson) p;
        np.eat();
        np.yanJiu();
    }
}


