package day_05_set;

import java.util.HashSet;
import java.util.Set;

/**
 *  Set集合的特点：
 *              无序（存储和取出元素的顺序不一致）、无索引、
 *                不可重复（元素不可重复，唯一性）。
 *
 *  Set 2个子类:
 *          HashSet：它不保证 set 的迭代顺序；特别是它不保证顺序恒久不变。
 *          TreeSet：能够对元素按照（某种规则）进行排序。并且，仍有元素的【唯一性】。
 *
 */
public class d_01_Set集合的概述和特点 {
    public static void main(String[] args) {
        //创建set集合对象
        Set<String> set = new HashSet<String>();
        //创建并添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hello");  //元素依旧是3个。原因就是元素的唯一性。

        //增强for遍历
        for (String s : set){
            System.out.println(s);
        }
        System.out.println("元素个数："+set.size()); //元素依旧是3个。
    }
}
