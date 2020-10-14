package B_String类;

/**
 *  String类的
 *  判断功能：
 *      1、boolean equals(Object obj)：比较字符串的内容是否相同，区分大小写。
 *      2、boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同，忽略大小写。
 *      3、boolean contains(String str)：判断大字符串中是否包含小字符串。
 *      4、boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头。
 *      5、boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾。
 *      6、boolean isEmpty()：判断字符串是否为空。
 *
 *  注意：
 *      字符串内容为空 和 字符串对象为空。
 *      内容空：String s = "";
 *      对象空：String s = null;
 *
 */
public class c_String类的判断功能1 {
    public static void main(String[] args) {
        //创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        //1、boolean equals(Object obj)：比较字符串的内容是否相同，区分大小写。
        System.out.println("equals："+s1.equals(s2));    //true
        System.out.println("equals："+s1.equals(s3));    //false
        System.out.println("=====================================");
        //2、boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同，忽略大小写。
        System.out.println("equalsIgnoreCase："+s1.equalsIgnoreCase(s2));    //true
        System.out.println("equalsIgnoreCase："+s1.equalsIgnoreCase(s3));    //true
        System.out.println("=====================================");
        //3、boolean contains(String str)：判断大字符串中是否包含小字符串。
        System.out.println("contains："+s1.contains("hello"));   //true
        System.out.println("contains："+s1.contains("wo"));      //false
        System.out.println("=====================================");
        //4、boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头。
        System.out.println("startsWith："+s1.startsWith("h"));       //true
        System.out.println("startsWith："+s1.startsWith("hello"));   //true
        System.out.println("startsWith："+s1.startsWith("e"));       //false
        System.out.println("=====================================");
        //5、boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾。
        System.out.println("endsWith："+s1.endsWith("o"));       //true
        System.out.println("endsWith："+s1.endsWith("hello"));   //true
        System.out.println("endsWith："+s1.endsWith("e"));       //false
        System.out.println("=====================================");
        //6、boolean isEmpty()：判断字符串是否为空。
        String s4 = "";
        String s5 = null;
        System.out.println(s3.isEmpty());   //false
        System.out.println(s4.isEmpty());   //true
        System.out.println(s5.isEmpty());   //报错：NullPointerException 空指针异常。
                                            //原因：s5对象都不存在，那么方法也就不能调用了。
    }
}

