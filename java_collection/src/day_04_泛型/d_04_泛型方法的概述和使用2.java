package day_04_泛型;
/**
 *  如果类没有泛型，方法还能接收任意类型的参数吗？    当然能！！
 *
 *      泛型方法：
 *            格式：
 *                public <泛型类型> 返回类型 方法名(泛型类型 ..)
 */
public class d_04_泛型方法的概述和使用2 {
    /**
     * show()方法加入泛型，便可以传如任意类型的参数了。
     */
    public <T> void show(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        d_04_泛型方法的概述和使用2 d = new d_04_泛型方法的概述和使用2();
        d.show("hello");
        d.show(20);
        d.show(true);
    }
}
