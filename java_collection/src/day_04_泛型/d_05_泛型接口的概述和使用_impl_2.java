package day_04_泛型;

public class d_05_泛型接口的概述和使用_impl_2 implements d_05_泛型接口的概述和使用<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //第一种情况
        d_05_泛型接口的概述和使用<String> e = new d_05_泛型接口的概述和使用_impl_2();
        e.show("show");
    }

}
