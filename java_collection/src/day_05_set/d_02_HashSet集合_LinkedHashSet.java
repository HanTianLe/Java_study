package day_05_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
/**
 *      HashSet集合存储自定义对象并遍历。如果对象的成员变量相同即为同一个对象
 *
 *      注意：使用的HashSet集合，这个集合的底层是哈希表结构。
 *          而哈希表结构底层依赖是：hashCode()和 equals()方法。
 *          如果对象的成员变量值相同，即为同一个对象时，
 *          应该重写类中的 hashCode()和 equals()这两个方法。
 *          如何重写？-->可以自动生成。
 */
public class d_02_HashSet集合_LinkedHashSet {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Dog> hashSet = new HashSet<Dog>();
        //创建Dog对象
        Dog d1 = new Dog("秦桧",21,"红色",'男');
        Dog d2 = new Dog("秦桧",21,"红色",'男');
        Dog d3 = new Dog("秦桧",21,"红色",'女');
        Dog d4 = new Dog("高俅",21,"红色",'女');
        Dog d5 = new Dog("李莲英",21,"红色",'男');
        //添加元素
        hashSet.add(d1);
        hashSet.add(d2);
        hashSet.add(d3);
        hashSet.add(d4);
        hashSet.add(d5);
        //增强for遍历
        for (Dog dog : hashSet){
            System.out.println(dog);
        }
        System.out.println("对象个数："+hashSet.size());
        System.out.println("--------------------------------------------");

        /**
         *    HashSet 还有一个子类，叫：LinkedHashSet
         *                      特点：元素有序、唯一。
         *                          哈希表保证元素的唯一，
         *                          链表保证元素有序（存储和取出顺序一致）。
         */
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("Java");
        hs.add("hello");
        hs.add("hello");
        for (String s : hs){
            System.out.println(s);
        }
        System.out.println("元素个数："+hs.size());
    }
}

class Dog{
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dog() {}

    public Dog(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
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
    public char getSex() {
        return sex;
    }
    public void     setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex=" + sex +
                '}';
    }

    /**
     * 下面的两个方法是自动生成的。
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                sex == dog.sex &&
                Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, sex);
    }

}
