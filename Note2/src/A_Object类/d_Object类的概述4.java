package A_Object类;

/**
 *  Object类的方法：
 *          5、protected void finalize()：当垃圾回收器确定不存在对该对象的更多引用时，
 *                                  由对象的垃圾回收器调用此方法。
 *                                  用于垃圾回收，但是什么时候回收，不确定。
 *
 *          6、protected Object clone()：创建并返回此对象的一个副本。
 *                                  A、被克隆的类 需要重写该方法。
 *                                  B、被克隆的类 需要实现 Cloneable 接口。
 *
 *  Cloneable 接口:
 *          是标记接口。
 *          是一个没有方法的接口 !
 *          类实现了 Cloneable 接口，以指示 Object.clone()方法可以合法地对该类实例进行按字段复制。
 *
 */
public class d_Object类的概述4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建父亲对象
        Father f = new Father();
        f.setName("张三");
        f.setAge(11);
        //克隆父亲对象
        Object obj = f.clone();
        Father f2 = (Father) obj;
        System.out.println(f2);
        //以前做法
        Father f3 = f;
        System.out.println(f3);
        System.out.println("========================================");
        f3.setName("李四");
        f3.setAge(22);
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
    }
}


class Father implements Cloneable{
    private String name;
    private int age;
    public Father() {}
    public Father(String name, int age) {
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

