package day_01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class d_02_collection方法 {
    public static void main(String[] args) {
        // 创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        System.out.println(c1);// [abc1, abc2, abc3, abc4]
        // 创建集合2
        Collection c2 = new ArrayList();
        c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println(c2);// [abc4, abc5, abc6, abc7]

        // boolean addAll(Collection c) :添加一个集合元素。（是集合对象）
        // 两个集合里面可以有相同的元素。
        System.out.println("addAll："+c1.addAll(c2));// true
        System.out.println(c1);// [abc1, abc2, abc3, abc4, abc4, abc5, abc6, abc7]
        System.out.println(c2);// [abc4, abc5, abc6, abc7]

        // boolean removeAll(Collection c) :移除一个集合的元素。
        // 看两个集合有多少交集元素。有多少就移除多少。
        // 而且只要有1个及以上交集元素就返回true。否则返回false。
        System.out.println("removeAll："+c1.removeAll(c2));// true
        System.out.println(c1);// [abc1, abc2, abc3]
        System.out.println(c2);// [abc4, abc5, abc6, abc7]

        // boolean containsAll(Collection c) :判断集合中是否包含指定的集合元素。
        // 只有包含了指定集合所有的元素，才叫包含，才返回true。
        // 否则返回false。
        System.out.println("containsAll："+c1.containsAll(c2));// false

        // boolean retainAll(Collection c) :两个集合都有的元素。
        // 交集元素覆盖放在调用该方法的集合里面。
        // 且当交集元素为无，及为空时，也将空放在调用该方法的集合里面。
        // 返回值Boolean表示调用该方法的集合是否发生改变 ！！！
        System.out.println("retainAll："+c1.retainAll(c2));// true
        System.out.println(c1);// []
        System.out.println(c2);// [abc4, abc5, abc6, abc7]

    }
}
