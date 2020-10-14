package day_03_arraylist_vector_linkedlist;

import java.util.LinkedList;

/**
 *  LinkedList的特有功能：
 *          A、添加功能
 *                  public void addFirst(Object e)  最前添加
 *                  public void addLast(Object e)   最后添加（意义不大）
 *          B、获取功能
 *                  public Object getFirst()        获取最前
 *                  public Object getLast()         获取最后
 *          C、删除功能
 *                  public Object removeFirst()
 *                  public Object removeLast()
 *
 */
public class d_04_LinkedList的特有功能 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList link = new LinkedList();
        //添加元素
        link.add("hello");
        link.add("world");
        link.add("java");

        System.out.println(link);   // [hello, world, java]

        // 添加功能：public void addFirst(Object e)
        link.addFirst("Javaee");    //最前添加
        // 添加功能：public void addLast(Object e)
        link.addLast("C++");        //最后添加

        //输出
        System.out.println(link);   // [Javaee, hello, world, java, C++]

        // 获取功能：public Object getFirst()
        System.out.println("getFirst："+link.getFirst());//Javaee
        // 获取功能：public Object getLast()
        System.out.println("getLast："+link.getLast());//C++

        // 删除功能：public Object removeFirst()
        System.out.println("removeFirst："+link.removeFirst());  // Javaee
        // 删除功能：public Object removeLast()
        System.out.println("removeLast："+link.removeLast());    // C++

        //输出
        System.out.println(link);// [hello, world, java]
    }
}
