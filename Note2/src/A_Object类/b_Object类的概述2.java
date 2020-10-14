package A_Object类;
/**
 *  Object类的方法：
 *          3、public String toString()：返回该对象的字符串表示。
 *                  等价于：getClass().getName() + '@' + Integer.toHexString(hashCode())
 *                  ----> this.getClass().getName() + '@' + Integer.toHexString(this.hashCode())
 *
 *  Integer类的方法（静态）：
 *          public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串。
 *
 *  toString()方法返回的字符串是没有意义的。
 *  所以，建议所有子类都重写toString()方法。
 *  如何重写？把该类所有成员变量值返回即可。（可自动重写toString()方法）
 *
 *  注意：
 *      直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 */
public class b_Object类的概述2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());           //460141958
        System.out.println(s.getClass().getName()); //A_Object类.Student
        System.out.println(s.toString());           //A_Object类.Student@1b6d3586
        System.out.println("------------------------------");
        System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));
        System.out.println("------------------------------");
        Manage m = new Manage();
        System.out.println(m.toString());   //Manage{name='null', age=0}
        System.out.println(m.getClass().getName()+'@'+Integer.toHexString(m.hashCode()));
        System.out.println(m);  //Manage{name='null', age=0}
    }
}

class Student{
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
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

class Manage{
    private String name;
    private int age;

    public Manage() {}
    public Manage(String name, int age) {
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

    @Override
    public String toString() {
        return "Manage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

