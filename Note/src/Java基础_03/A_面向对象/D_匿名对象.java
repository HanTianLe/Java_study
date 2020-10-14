package Java基础_03.A_面向对象;

/**
 *      匿名对象： 就是没有名字的对象。
 *
 *      应用场景：
 *          A、调用方法：仅仅只调用一次的时候。 (调用多次的时候，不适合使用。)
 *                优点： 匿名对象调用完毕，就是垃圾。可以被垃圾回收器回收。
 *
 *                格式： new 类名().被调用的方法名();
 *
 *          B、匿名对象可以作为：实际参数转递。⭐⭐
 *
 */

class Student1{
    public void show(){
        System.out.println("我爱学习~");
    }
}

class StudentDemo1{
    public void method(Student1 s){
        s.show();
    }
}


public class D_匿名对象 {
    public static void main(String[] args) {
        /** 带名字的调用*/
        System.out.println("----带名字的调用:----");
        Student1 s = new Student1();/** 同一个对象调用了两次方法。*/
        s.show();
        s.show();//两个都是同一个对象。


        System.out.println("-----匿名对象:-----");
        /** 匿名对象*/
        new Student1().show();/** 分别表示两个不同的对象分别调用一个方法。*/
        new Student1().show();//第二个其实是重新创建了一个新对象。 这两个对象不是同一个！


        System.out.println("-----匿名对象作为实际参数转递:-----");
        /** 匿名对象作为实际参数转递*/
        StudentDemo1 sd = new StudentDemo1();
        sd.method(new Student1());
        //多个匿名对象嵌套
        new StudentDemo1().method(new Student1());
    }
}


