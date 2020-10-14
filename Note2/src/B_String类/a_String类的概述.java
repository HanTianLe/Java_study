package B_String类;
/**
 *      String类代表字符串。
 *
 *      字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 *          A、字符串字面值"abc"也可以看成是一个字符串对象。
 *          B、字符串是常量，一旦被赋值，就不能被改变。
 *
 *      构造方法：
 *          1、public String()：空构造。
 *          2、public String(byte[] bytes)：把【字节数组】转为字符串。
 *          3、public String(byte[] bytes,int offset,int length)：把【字节数组】的一部分转为字符串。
 *          4、public String(char[] value)：把【字符数组】转为字符串。
 *          5、public String(char[] value,int offset,int count)：把【字符数组】的一部分转为字符串。
 *          6、public String(String original)：把【字符常量值】转为字符串。
 *
 *      字符串的方法：
 *          1、public int length()：返回此字符串的长度。
 *
 */
public class a_String类的概述 {
    public static void main(String[] args) {
        // 1、public String()：空构造。
        String s1 = new String();
        System.out.println("s1："+s1);
        System.out.println("length："+s1.length());
        System.out.println("--------------------------------");

        // 2、public String(byte[] bytes)：把【字节数组】转为字符串。
        byte[] bys = {97,98,99,100};
        String s2 = new String(bys);
        System.out.println("s2："+s2);   //四个数字分别对应代表ASCII表中的a b c d
        System.out.println("s2.length："+s2.length());
        System.out.println("--------------------------------");

        // 3、public String(byte[] bytes,int offset,int length)：把【字节数组】的一部分转为字符串。
        String s3 = new String(bys,1,3);
        System.out.println("s3："+s3);
        System.out.println("s3.length："+s3.length());
        System.out.println("--------------------------------");

        // 4、public String(char[] value)：把【字符数组】转为字符串。
        char [] chars = {'a','b','c','d','韩','天','乐'};
        String s4 = new String(chars);
        System.out.println("s4："+s4);
        System.out.println("s4.length："+s4.length());
        System.out.println("--------------------------------");

        // 5、public String(char[] value,int offset,int count)：把【字符数组】的一部分转为字符串。
        String s5 = new String(chars,3,4);
        System.out.println("s5："+s5);
        System.out.println("s5.length："+s5.length());
        System.out.println("--------------------------------");

        // 6、public String(String original)：把【字符常量值】转为字符串。
        String s6 = new String("abcd");
        System.out.println("s6："+s6);
        System.out.println("s6.length："+s6.length());
        System.out.println("--------------------------------");

        // 字符串字面值"abc"也可以看成是一个字符串对象。
        String s7 = "adc";
        System.out.println("s7："+s7);
        System.out.println("s7.length："+s7.length());
    }
}

