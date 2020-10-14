package Java基础_03.A_面向对象;

/**
 *      private 和 封装的应用:
 *          A、把成员变量用 private 修饰
 *          B、提供对应的 getXxx() 和 setXxx() 方法，
 *            来实现对私有化变量的赋值与调用。
 *
 */
class Teacher{
    private String name;    //默认初始化值：null
    private int age;        //默认初始化值：0

    /** 姓名获取值*/
    public String getName(){
        return name;
    }
    /** 姓名赋值*/
    public void setName(String n){
        this.name = n;
    }
    /** 年龄获取值*/
    public int getAge(){
        return age;
    }
    /** 年龄赋值*/
    public void setAge(int a){
        this.age = a;
    }
}


public class G_private的应用 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        //获取成员变量
        System.out.println("姓名："+t.getName()+"\t"+"年龄："+t.getAge());
        System.out.println("---------------------------------");
        //给成员变量赋值
        t.setName("鬼谷子");
        t.setAge(200);
        System.out.println("姓名："+t.getName()+"\t"+"年龄："+t.getAge());
    }

}


