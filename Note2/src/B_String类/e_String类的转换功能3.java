package B_String类;

/**
 *  String类的
 *  转换功能：
 *      1、byte[] getBytes()：把字符串转为字节数组。
 *      2、char[] toCharArray()：把字符串转为字符数组。
 *      3、static String valueOf(char[] chs)：把字符数组转成字符串。
 *      4、static String valueOf(int i)：把 int类型的数据转为字符串。
 *              注意：String 类的 valueOf方法可以把任意类型的数据转为字符串。
 *      5、String toLowerCase()：把字符串转为小写。（相当于产生一个新的小写字符串，原来的字符串没变。）
 *      6、String toUpperCase()：把字符串转为大写。（相当于产生一个新的大写字符串，原来的字符串没变。）
 *      7、String concat(String str)：把字符串拼接。
 *
 */
public class e_String类的转换功能3 {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "JavaSE";

        /** 1、byte[] getBytes()：把字符串转为字节数组。*/
        byte[] bytes = s.getBytes();
        for (int x = 0; x < bytes.length; x++) {
            System.out.println(bytes[x]);
        }
        System.out.println("-----------------------");

        /** 2、char[] toCharArray()：把字符串转为字符数组。*/
        char[] chars = s.toCharArray();
        for (int x = 0; x < chars.length; x++) {
            System.out.println(chars[x]);
        }
        System.out.println("-----------------------");

        /** 3、static String valueOf(char[] chs)：把字符数组转成字符串。*/
        String ss = String.valueOf(chars);
        System.out.println(ss);
        System.out.println("-----------------------");

        /** 4、static String valueOf(int i)：把 int类型的数据转为字符串。*/
        int i = 100;
        String sss = String.valueOf(i);
        System.out.println(sss);
        System.out.println("-----------------------");

        /** 5、String toLowerCase()：把字符串转为小写。（相当于产生一个新的小写字符串，原来的字符串没变。）*/
        System.out.println("toLowerCase()："+s.toLowerCase());
        System.out.println("原来的s："+s);
        System.out.println("-----------------------");


        /** 6、String toUpperCase()：把字符串转为大写。（相当于产生一个新的大写字符串，原来的字符串没变。）*/
        System.out.println("toUpperCase："+s.toUpperCase());
        System.out.println("原来的s："+s);
        System.out.println("-----------------------");

        /** 7、String concat(String str)：把字符串拼接。*/
        //原来：
        String s1 ="Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        //现在：
        String s4 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}

