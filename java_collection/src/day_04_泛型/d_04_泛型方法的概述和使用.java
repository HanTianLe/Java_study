package day_04_泛型;
/**
 *      当类有泛型时：
 */
public class d_04_泛型方法的概述和使用<T> {
    public void show(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        d_04_泛型方法的概述和使用<String> d = new d_04_泛型方法的概述和使用<String>();
        d.show("hello");

        d_04_泛型方法的概述和使用<Integer> d2 = new d_04_泛型方法的概述和使用<Integer>();
        d2.show(21);

        d_04_泛型方法的概述和使用<Boolean> d3 = new d_04_泛型方法的概述和使用<Boolean>();
        d3.show(true);

    }
}
