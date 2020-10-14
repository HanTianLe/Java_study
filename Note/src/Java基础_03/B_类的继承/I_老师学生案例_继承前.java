package Java基础_03.B_类的继承;

public class I_老师学生案例_继承前 {}

class Students1{
    private String name;
    private int age;

    public Students1(){}

    public Students1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}


class Teachers1{
    private String name;
    private int age;

    public Teachers1(){}

    public Teachers1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}


class ExtendsTests1{
    public static void main(String[] args) {
        Teachers1 t1 = new Teachers1();
        t1.setName("鬼谷子");
        t1.setAge(600);
        System.out.println(t1.getName()+"------"+t1.getAge());

        System.out.println("-----------------------------");
        Students1 s1 = new Students1("孟夫子",300);
        System.out.println(s1.getName()+"------"+s1.getAge());

    }
}


