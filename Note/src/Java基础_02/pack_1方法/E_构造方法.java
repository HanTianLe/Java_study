package Java基础_02.pack_1方法;

/**
 *      构造方法：
 *              给对象的数据进行初始化
 *
 *      构造方法的作用：用于子类访问父类数据的初始化。⭐⭐
 *
 *      格式：
 *          A、方法名与类名相同。 ⭐⭐
 *          B、没有 (返回值类型)，连 void 都没有。  ⭐⭐
 *          C、没有具体的返回值。 ⭐⭐
 *
 *      注意事项：
 *          A、如果我们没有给出 (构造方法)，系统将会自动提供一个 (无参构造方法)。
 *          B、如果我们给出了 (构造方法)，系统将不再提供 (默认的无参构造方法)。
 *                  注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。
 *
 *                       ⭐⭐建议永远自己给出无参构造方法。⭐⭐
 *
 *      给 (成员变量) 赋值的 2 种方法：
 *          A、setXxx() 来赋值
 *          B、带参构造方法 来赋值
 *
 *      输出 (成员变量) 的 2 种方法：
 *          A、getXxx() 分别获取然后拼接
 *          B、通过 show()方法 来输出
 *
 *      构造方法的重载 注意：
 *          A、方法名相同
 *          B、参数个数 或 参数类型 至少有一个不同。
 *
 */
class Test{
    private String name;
    private int age;

    /** 构造方法1  (无参构造) */
    public Test(){
    }
    /** 构造方法2   (重载)*/
    public Test(String name){
        this.name = name;
    }
    /** 构造方法3   (重载)*/
    public Test(int age){
        this.age = age;
    }
    /** 构造方法4   (重载)*/
    public Test(String name,int age){
        this.name = name;
        this.age = age;
    }

    /** 定义get、set方法*/
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    /** 输出该类所有的变量值方法*/
    public void show(){
        System.out.println(name+"----"+age);
    }

}


public class E_构造方法 {
    public static void main(String[] args){
        /** (成员变量) 输出的两种方法*/
        Test t = new Test();
        System.out.println(t.getName()+"----"+t.getAge());  /** 方法一 */
        t.show();                                           /** 方法二 */
        System.out.println("-------------------------");

        Test t1 = new Test("韩非子");
        System.out.println(t1.getName()+"----"+t1.getAge());
        t1.show();
        System.out.println("-------------------------");

        Test t2 = new Test(150);
        System.out.println(t2.getName()+"----"+t2.getAge());
        t2.show();
        System.out.println("-------------------------");

        Test t3 = new Test("鬼谷子",200);
        System.out.println(t3.getName()+"----"+t3.getAge());
        t3.show();
        System.out.println("-------------------------");


        /** (成员变量) 赋值的两种方法 */
        Test t4 = new Test("庄子");           /** 方法一 */
        t4.setAge(150);                             /** 方法二 */
        t4.show();
        System.out.println("-------------------------");

        t4.setName("老子");
        t4.setAge(200);
        t4.show();
    }
}


