package day_03_arraylist_vector_linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  ArrayList去除集合中字符串的重复值（字符串的内容相同）
 *
 *  分析：
 *      A、创建集合对象
 *      B、添加多个字符串元素（包含相同的内容）
 *      C、创建新集合
 *      D、遍历旧集合，获取得到每一个元素
 *      E、拿到这个元素到新集合去找，看看有没有
 *              有：不用搭理
 *              没有就添加到新集合
 *      F、遍历新集合
 *
 */
public class d_02_ArrayList集合中去除重复字符串1 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        //创建新集合
        ArrayList newArray = new ArrayList();

        //遍历旧集合，获取得到每一个元素
        Iterator it = array.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            //拿这个元素到新集合中去找，没有就添加
            if (!newArray.contains(s)){
                newArray.add(s);
            }
        }
        //遍历新集合
        for (int i = 0; i < newArray.size(); i++) {
            System.out.println((String) newArray.get(i));
        }

    }
}
