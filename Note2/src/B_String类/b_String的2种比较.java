package B_String类;

/**
 *      String字面值对象与构造方法创建对象的区别：
 *          前者会创建 1个对象，
 *          后者会创建 2个对象。
 *
 *          ==：比较引用类型，比较的是地址值是否相同
 *          equals：比较引用类型，默认也是比较地址值是否相同。
 *                  而 String类重写了 equals()方法，比较的是内容是否相同。
 *
 */
public class b_String的2种比较 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";

        System.out.println(s1 == s2);       //false     比较的是地址值
        System.out.println(s1.equals(s2));  //true      比较的是内容
    }
}

