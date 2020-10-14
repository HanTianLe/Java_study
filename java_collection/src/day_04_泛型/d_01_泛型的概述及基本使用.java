package day_04_泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *      集合也能模仿数组的做法，在创建对象的时候明确元素的数据类型，这样就不会有问题了。
 *      而这种技术称为：泛型。
 *
 *      泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候，长去明确的特殊类型。
 *          参数化类型，把类型当作一种参数传递。
 *
 *      格式：<数据类型>
 *          此处的数据类型只能是引用类型。
 *
 *      好处：
 *          A、把运行时期的问题提前到了编译期间
 *          B、避免了强制类型转换
 *          C、优化程序设计，解决了黄色警告线
 */
public class d_01_泛型的概述及基本使用 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("Java");
        //下面写法就会报错了。因为创建了array的时候已经说明了数据类型为String。
        //array.add(10);

        //遍历。
        /** 此时迭代器也要说明类型。*/
        Iterator<String> it = array.iterator();
        while (it.hasNext()){
            /** 这边就不需要强转了。
             * 因为刚开始创建集合的时候，
             * 就已经声明了元素类型。
             */
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------");
        for (int x = 0; x < array.size(); x++) {
            String s = array.get(x);
            System.out.println(s);
        }
    }
}
