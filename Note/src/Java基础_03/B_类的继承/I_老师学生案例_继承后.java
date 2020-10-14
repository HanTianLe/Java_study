package Java基础_03.B_类的继承;

public class I_老师学生案例_继承后 {}

class Persons{
    private String name;
    private int age;

    public Persons(){}

    public Persons(String name,int age){
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


class Students extends Persons {
    public Students(){}
    public Students(String name,int age){
        super(name,age);
    }
}

class Teachers extends Persons {
    public Teachers(){}
    public Teachers(String name,int age){
        super(name,age);
    }
}

class ExtendsTests{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("韩非子");
        s1.setAge(200);
        System.out.println(s1.getName()+"------"+s1.getAge());

        System.out.println("-----------------------------");
        Teachers t = new Teachers("孔夫子",400);
        System.out.println(t.getName()+"------"+t.getAge());

    }
}


