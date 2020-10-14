package day_07_Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *      Collections：是针对集合操作的工具类，都是静态方法。
 *
 *      Collection 和 Collections 的区别：
 *      Collection：是单列集合的顶层接口，有子类接口 List 和 Set。
 *      Collections：是针对集合操作的工具类，有对集合进行排序和二分查找的方法。
 *
 *      重要的方法有：
 *          public static <T> void sort(List<T> list)：排序 （默认情况下是自然顺序）。
 *          public static <T> int binarySearch(List<?> list,T key)：二分查找。
 *          public static <T> T max(Collection<?> coll)：最大值。
 *          public static void reverse(List<?> list)：反转。
 *          public static void shuffle(List<?> list)：随机置换。
 */

public class Collections工具类介绍 {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<Integer>();
        list.add(40);
        list.add(30);
        list.add(10);
        list.add(20);
        System.out.println("list:"+list);// list:[40, 30, 10, 20]

        /** public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。*/
        Collections.sort(list);
        System.out.println("list:"+list);// list:[10, 20, 30, 40]

        /** public static <T> int binarySearch(List<?> list,T key):二分查找。*/
        //得到的是该元素在集合中的位置。（如果元素不存在，返回最大索引+2，再取反）
        System.out.println("binarySearch:"+Collections.binarySearch(list,30));//2
        System.out.println("binarySearch:"+Collections.binarySearch(list,300));//-5

        /** public static <T> T max(Collection<?> coll):最大值。*/
        System.out.println("max:"+Collections.max(list));//40

        /** public static void reverse(List<?> list):反转。*/
        Collections.reverse(list);
        System.out.println("list:"+list);// list:[40, 30, 20, 10]

        /** public static void shuffle(List<?> list):随机置换。*/
        Collections.shuffle(list);
        System.out.println("list:"+list);// list:[30, 10, 20, 40]
        // 每次编译运行的结果都不同！

    }
}
