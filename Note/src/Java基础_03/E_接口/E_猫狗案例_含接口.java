package Java基础_03.E_接口;

/**
 *      猫狗案例
 */
public class E_猫狗案例_含接口 {}

/** 定义跳高接口*/
interface Jumping{
    public abstract void jump();
}


/** 动物类*/
abstract class Animal{
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name,int age){
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

    //吃法（抽象）
    public abstract void eat();
    //睡觉（非抽象）
    public void sleep(){
        System.out.println("睡觉觉~~");
    }

}


/** 猫类*/
class Cats extends Animal {
    public Cats(){}

    public Cats(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("猫吃鱼~");
    }
}


/** 狗类*/
class Dogs extends Animal {
    public Dogs(){}

    public Dogs(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃肉~");
    }
}


/** 有跳高功能的猫*/
class JumpCat extends Cats implements Jumping {
    public JumpCat(){}
    public JumpCat(String name,int age){
        super(name,age);
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}


/** 有跳高功能的狗*/
class JumpDog extends Dogs implements Jumping {
    public JumpDog(){}
    public JumpDog(String name,int age){
        super(name,age);
    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}


class InterfaceTest{
    public static void main(String[] args) {
        JumpCat jc = new JumpCat();
        jc.setName("哆啦A梦");
        jc.setAge(5);
        System.out.println(jc.getName()+"----"+jc.getAge()+"岁");
        jc.jump();
        jc.eat();
        jc.sleep();
        System.out.println("---------------------------------");
        JumpCat jc2 = new JumpCat("加菲猫",6);
        System.out.println(jc2.getName()+"----"+jc2.getAge()+"岁");
        jc2.jump();
        jc2.eat();
        jc2.sleep();
        System.out.println("---------------------------------");
        JumpDog jd = new JumpDog();
        jd.setName("单身狗");
        jd.setAge(11);
        System.out.println(jd.getName()+"----"+jd.getAge()+"岁");
        jd.jump();
        jd.eat();
        jd.sleep();
        System.out.println("---------------------------------");
        JumpDog jd2 = new JumpDog("看门狗",22);
        System.out.println(jd2.getName()+"----"+jd2.getAge()+"岁");
        jd2.jump();
        jd2.eat();
        jd2.sleep();
    }
}



