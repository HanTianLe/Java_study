package Java基础_03.B_类的继承;

public class J_猫狗案例 {}


class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {}

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("该吃饭了~");
    }
}


class Cat extends Animal {
    public Cat(){}
    public Cat(String name,int age,String color){
        super(name,age,color);
    }

    public void method1(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public Dog(){}
    public Dog(String name,int age, String color){
        super(name,age,color);
    }

    public void method2(){
        System.out.println("看门");
    }
}


class DemoTest{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Tom");
        c.setAge(2);
        c.setColor("blue");
        System.out.println("猫名："+c.getName()+"\t"+"年龄："+c.getAge()+"\t"+"颜色："+c.getColor());
        c.eat();
        c.method1();


        System.out.println("-------------------------------------");
        Dog d = new Dog("Jerry",5,"white");
        System.out.println("狗名："+d.getName()+"\t"+"年龄："+d.getAge()+"\t"+"颜色："+d.getColor());
        d.eat();
        d.method2();
    }
}



