package day_03_arraylist_vector_linkedlist;

import java.util.Enumeration;
import java.util.Vector;

/**
 *  Vector的特有功能：
 *      1、添加功能
 *              public void addElement(Object obj)
 *      2、获取功能
 *              public Object elementAt(int index)
 *              public Enumeration elements()
 *                      boolean hasMoreElements()
 *                      Object nextElement()
 *
 */
public class d_03_Vector的特有功能 {
    public static void main(String[] args) {
        //创建集合对象
        Vector vector = new Vector();
        // 添加功能：public void addElement(Object obj)
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");
        //遍历
        for (int i = 0; i < vector.size(); i++) {
            //获取功能：public Object elementAt(int index)
            System.out.println((String) vector.elementAt(i));
        }

        System.out.println("---------------------------------");
        Enumeration elements = vector.elements();//返回的是实现类的对象
        while (elements.hasMoreElements()){
            System.out.println((String) elements.nextElement());
        }
    }
}
