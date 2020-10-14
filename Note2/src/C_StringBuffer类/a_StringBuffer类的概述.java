package C_StringBuffer类;
/**
 *  StringBuffer类的概述：
 *      1、我们如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。
 *        而StringBuffer就可以解决这个问题。
 *      2、线程【安全】的【可变】字符序列。
 *
 *  StringBuffer与String的区别？
 *      1、前者长度和内容可变，后者不可变。
 *      2、如果使用前者做字符串的拼接，不会浪费太多的资源。
 *
 *  StringBuffer的构造方法：
 *      1、public StringBuffer()：无参构造方法。构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
 *      2、public StringBuffer(int capacity)：指定容量的字符串缓冲区对象。
 *      3、public String Buffer(String str)：指定字符串内容的字符串缓冲区对象。
 *
 *  StringBuffer的方法：
 *      1、public int capacity()：返回当前容量。   理论值。
 *      2、public int length()：返回长度（字符数）。实际值。
 *
 */
public class a_StringBuffer类的概述 {
    public static void main(String[] args) {
        // 1、public StringBuffer()：构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
        StringBuffer sb = new StringBuffer();
        System.out.println("sb："+sb);
        System.out.println("sb.capacity："+sb.capacity());   //16
        System.out.println("sb.length："+sb.length());       //0
        System.out.println("-------------------------------------");

        // 2、public StringBuffer(int capacity)：指定容量的字符串缓冲区对象。
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2："+sb2);
        System.out.println("sb2.capacity："+sb2.capacity()); //50
        System.out.println("sb2.length："+sb2.length());     //0
        System.out.println("-------------------------------------");

        // 3、public String Buffer(String str)：指定字符串内容的字符串缓冲区对象。
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3："+sb3); //hello
        System.out.println("sb3.capacity："+sb3.capacity()); //21 (5 + 16)
        System.out.println("sb3.length："+sb3.length());     //5
        System.out.println("-------------------------------------");

    }
}

