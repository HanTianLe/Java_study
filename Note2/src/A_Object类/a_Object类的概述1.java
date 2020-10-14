package A_Object类;
/**
 *  Object类：是类层次结构的根类。每个类都使用Object作为超类。
 *           每个类都直接或间接的继承Object类。
 *
 *  Object类的方法：
 *          1、public int hashCode()：返回对象的哈希码值。
 *                  注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但不是实际地址值。
 *                       可以理解为地址值。
 *          2、public final Class getClass()：返回此Object的运行时类（Class类）。
 *                  Class类的方法：
 *                       public String getName()：以String的形式返回此Class对象所表示的实体名称。
 *
 */
public class a_Object类的概述1 extends Object{
    public static void main(String[] args) {
        Teacher0 t1 = new Teacher0();
        System.out.println(t1.hashCode());  //460141958
        Teacher0 t2 = new Teacher0();
        System.out.println(t2.hashCode());  //1163157884
        Teacher0 t3 = t2;
        System.out.println(t3.hashCode());  //1163157884
        System.out.println("--------------------");

        Teacher0 t = new Teacher0();
        Class c = t.getClass();     //返回运行时类。
        String str = c.getName();   //返回Class对象所表示的实体名称。
        System.out.println(str);    //A_Object类.Teacher0
        //链式编程（跟上面原理一样）
        String str2 = t.getClass().getName();
        System.out.println(str2);   //A_Object类.Teacher0
    }
}

class Teacher0{ }


