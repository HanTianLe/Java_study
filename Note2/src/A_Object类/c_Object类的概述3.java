package A_Object类;

import java.util.Objects;

/**
 *  Object类的方法：
 *          4、public boolean equals(Object obj)：指示其他某个对象是否与此对象 ”相等 “。
 *                                               默认是通过对象的【地址值】比较。
 *                                               一般通过地址值比较意义不大。
 *                                               所以，需要重写 equals方法。
 *  如何重写 equals()方法？
 *          1、自动生成（推荐）
 *          2、可以手写。
 *
 *  equals()方法默认比较的是引用类型，比较的是地址值。
 *          我们可以根据自己情况重写该方法。
 *          一般重写都是自动生成，比较对象的成员变量是否相同。
 *
 *  ==：
 *      基本类型：比较的是【值】是否相同。
 *      引用类型：比较的是【地址值】是否相同。
 *
 */
public class c_Object类的概述3 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("张三",11);
        Doctor d2 = new Doctor("张三",11);
        Doctor d3 = d1;
        System.out.println(d1 == d2);   //false
        System.out.println(d1 == d3);   //true
        System.out.println("==========================");
        /** 默认 equals()方法是 比较对象的【地址值】是否相同。*/
        System.out.println(d1.equals(d2));  //obj = d2  通过equals方法比较d1和d2是否相等。false
        System.out.println(d1.equals(d1));  // true
        System.out.println(d1.equals(d3));  // true

        System.out.println("--------------------------");
        Nurse n1 = new Nurse("张三",11);
        Nurse n2 = new Nurse("张三",11);
        Nurse n3 = new Nurse("李四",11);
        Nurse n4 = n1;
        /** 重写 equals()方法后，比较的是 name 和 age 的值是否相同。*/
        System.out.println(n1.equals(n2));  //true
        System.out.println(n1.equals(n4));  //true
        System.out.println(n1.equals(n1));  //true
        System.out.println(n1.equals(n3));  //false
        /*
            如果Nurse类中没有运用这个方法：obj instanceof Nurse
            这边就会报错。
            原因是Doctor类不能转型为Nurse类。
         */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(n1.equals(d1));  //false
    }
}


class Doctor{
    private String name;
    private int age;
    public Doctor() {}
    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
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
}

class Nurse{
    private String name;
    private int age;
    public Nurse() {}
    public Nurse(String name, int age) {
        this.name = name;
        this.age = age;
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

    /** 自己手动写的。*/
//    @Override
//    public boolean equals(Object obj){
//        /*
//            根据这里比较的成员变量来决定返回true还是false
//            这里要比较的是name和age
//            但是，name是String类型的，而String是【引用类型】的，所以，这里不能用 == 比较。
//            而是用 String 的 equals() 方法比较。
//            String 的 equals() 方法是重写自Object类的。比较的是字符串的内容是否相同。
//         */
//        // 为了提高效率可以添加如下代码：
//        if(this == obj){    //如果地址值相同，直接不用比name和age了，肯定相同。
//            return true;
//        }
//        /*
//            为了提高程序的健壮性，
//            需要先判断一下 obj 是不是一个护士类，如果是，再向下转型，如果不是，直接返回false。
//            这时候，需要一个格式：对象名 instanceof 类名。
//            表示：判断 obj 是否是该类名的一个对象。
//         */
//        if (!(obj instanceof Nurse)){   //判断传过来的obj对象（是否不是）Nurse对象。
//            return false;
//        }
//        /** 这边我们要使用的是护士类的特有成员变量，所以要向下转型。*/
//        Nurse n = (Nurse) obj;
//        // 判断name和age是否相同。
//        if (this.name.equals(n.name) && this.age == n.age){
//            return true;
//        }else {
//            return false;
//        }
//        /*
//            输出结果可优化为：
//            return this.name.equals(n.name) && this.age == n.age;
//        */
//    }

    /** 自动生成 equals()方法 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return age == nurse.age &&
                Objects.equals(name, nurse.name);
    }

}

