package day_04_泛型;

public class d_05_泛型接口的概述和使用_impl_3<T> implements d_05_泛型接口的概述和使用<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        //第二种情况
        d_05_泛型接口的概述和使用<String> e = new d_05_泛型接口的概述和使用_impl_3<String>();
        e.show("hello");

        d_05_泛型接口的概述和使用<Integer> e2 = new d_05_泛型接口的概述和使用_impl_3<Integer>();
        e2.show(22);

        d_05_泛型接口的概述和使用<Boolean> e3 = new d_05_泛型接口的概述和使用_impl_3<Boolean>();
        e3.show(false);

    }

}
