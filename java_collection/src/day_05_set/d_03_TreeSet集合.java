package day_05_set;

import java.util.TreeSet;

/**
 *  TreeSet
 *      特点：能够对元素按照（某种规则）进行排序。并且，仍有元素的【唯一性】。
 *
 *      排序有两种：
 *             A、自然排序
 *             B、比较器排序   创建Set时提供的：Comparator
 *
 */
public class d_03_TreeSet集合 {
    public static void main(String[] args) {
        //创建集合对象
        //自然顺序进行排序
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(21);
        ts.add(16);
        ts.add(21);
        ts.add(45);
        ts.add(98);
        ts.add(52);
        ts.add(16);
        //增强for遍历
        for (Integer t : ts){
            System.out.println(t);
        }
        System.out.println("元素个数："+ts.size());
        //16
        //21
        //45
        //52
        //98
        //元素个数：5
    }
}
