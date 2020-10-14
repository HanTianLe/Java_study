package Java基础_03.D_抽象类;

/**
 *      abstract 关键字     “ 抽象的 ”意思。
 *
 *      只能修饰：类、方法。  ⭐⭐
 *
 *      我们把一个（不是具体的功能）称为抽象的功能，
 *      而一个类中如果有抽象功能，该类必须是抽象类。 ！！！！！
 *
 *      ⭐⭐ （抽象类）是为了把相同的但不确定的东西的提取出来，为了以后的重用。（如：子类重写）
 *           定义成抽象类的目的，就是为了在子类中实现抽象类。
 *
 *      ⭐⭐ （抽象方法）在父类中不能实现，所以没有函数体。！！！！！
 *           但在后续子类继承时，要具体实现此方法。   ！！！！！
 *
 *      抽象类的特点： **
 *          A、抽象类和抽象方法必须用abstract关键字修饰。
 *          B、抽象类中不一定有抽象方法，但是有抽象方法的类，必须定义为抽象类。！！！！！
 *          C、抽象类不能实例化。（因为它不是具体的）
 *                  抽象类可以有构造方法，但是不能实例化（不能创建对象）。 ！！！！
 *                  构造方法的作用：用于子类访问父类数据的初始化。
 *          D、抽象类的子类：
 *                  a、如果不想重写父类（所有的抽象方法），则该子类是一个（抽象类）。
 *                  b、如果想重写父类（所有的抽象方法），这个时候子类一定是一个（具体类）。 !!
 *
 *      抽象类的实例化：
 *              其实是可以靠（具体的子类）实现的。是多态的方式。
 *
 */
public class A_抽象类的特点 {}

//abstract class Animal; 抽象类的声明格式。

/** 抽象类*/
abstract class Animal{
    public Animal(){}
//    public abstract void eat(){}   抽象方法（不能有主体）！！！
    /** 抽象方法    不能实体化！*/
    public abstract void eat();
    public abstract void sleep();
    /** 非抽象方法*/
    public void show(){
        System.out.println("show Animal");
    }
}

/** 子类是抽象类，不一定要重写父类的所有抽象类。*/
abstract class Dog extends Animal {
    public void sleep(){
        System.out.println("");
    }
}


/** 子类是具体类，一定要重写父类所有的抽象方法。*/
class Cat extends Animal {
    /** 重写父类的抽象方法*/
    @Override
    public void eat() {
        System.out.println("子类具体类————猫吃鱼");
    }
    @Override
    public void sleep() {

    }

    /** 重写父类的非抽象方法*/
    public void show(){
        System.out.println("show Cat");
    }
}


class AbstractDemo{
    public static void main(String[] args) {
        /**
         *  Animal a = new Animal();
         *  Animal 类是抽象的，无法实例化！
         */
        //其实抽象类可以通过多态，来实例化。（向上转型）
        Animal a = new Cat();
        a.eat();                //子类具体类————猫吃鱼
        a.show();               //show Cat
                                //如果子类Cat没有重写父类show方法，则是正常继承。
                                //那么这里输出的是show Animal。(那么用到的就不是多态了。)

//        Dog d = new Dog(); Dog是抽象类，所以也无法实例化。
    }
}


