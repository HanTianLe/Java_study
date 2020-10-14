package Java基础_03.C_多态;

/**
 *      多态的好处：
 *            A、提高了代码的维护性（继承保证）。
 *            B、提高了代码的（扩展性）。（由多态保证）
 *
 *      用到的知识：
 *            多态中（成员方法）访问的特点：
 *                                  编译看（左边），运行看（右边）。
 *
 */
public class B_多态的好处 {}

class Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sleep(){
        System.out.println("狗站着睡觉");
    }
}

class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("猫趴着睡觉");
    }
}


/** 针对动物操作的工具类*/
class AnimalTool{
    private AnimalTool(){}              //私有化，这样就不能创建对象了

//    /** 调用猫的功能*/
//    //如果方法的参数是一个类名，就说明我需要的是类名的对象。
//    public static void useCat(Cat c){
//        c.eat();
//        c.sleep();
//    }
//    /** 调用狗的功能*/
//    public static void useDog(Dog d){
//        d.eat();
//        d.sleep();
//    }

    /** 修改后*/
    /** 利用多态中（成员方法）访问的特点*/
    public static void useAnimal(Animal a){
        a.eat();
        a.sleep();
    }

}


class DuoTaiDemos {
    public static void main(String[] args) {
        //这个没问题，很easy~
        Cat c = new Cat();
        c.eat();
        c.sleep();

        Cat c2 = new Cat();
        Dog d = new Dog();
        System.out.println("---------------------------");

//        AnimalTool.useCat(c);   /** 通过类名调用useCat静态方法。*/
//        AnimalTool.useCat(c2);
//        System.out.println("---------------------------");
//        AnimalTool.useDog(d);

        /** 修改后*/
        AnimalTool.useAnimal(c);
        AnimalTool.useAnimal(c2);
        System.out.println("---------------------------");
        AnimalTool.useAnimal(d);

        /**
         * 通过上面对 AnimalTool 类里面的修改，充分利用多态的性质（成员方法）访问的特点），
         * 来实现了代码的扩展性。
         * 以后无论添加多少动物，都无需在修改 AnimalTool 类，
         * 只需添加动物类，以及对应方法，再在测试类里面创建对象即可。
         */
    }

}


