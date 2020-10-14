package Java基础_03.C_多态;

public class E_猫狗案例多态版 {}

class Animal1{
    public void eat(){
        System.out.println("eat");
    }
}

class Dog1 extends Animal1 {
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}

class Cat1 extends Animal1 {
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}

class 猫狗测试 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();     //狗是动物——————正确
        a.eat();
        System.out.println("------------------------");
        Dog1 d = (Dog1)a;   //（由狗称的动物）强转为狗 是狗————正确
        d.eat();
        d.lookDoor();
        System.out.println("------------------------");
        a = new Cat1();     //猫是动物——————正确
        a.eat();
        System.out.println("------------------------");
        Cat1 c = (Cat1)a;   //（由猫称的动物）强转为猫 是猫————正确
        c.eat();
        c.playGame();

        /** 演示错误内容*/
//        Dog1 dd = new Animal1();      //动物是狗——————错误！
//        Dog1 dd = (Dog1)a;  //（由猫称的动物）强转为狗——————错误（无法强转）__虽然编译不报错，但运行会报错。
    }
}




