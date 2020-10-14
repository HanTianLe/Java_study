package B_String类;

/**
 *  1、【遍历获取字符串中每一个字符】
 *
 *  分析：
 *      A、如何拿到每一个字符呢？
 *                  char charAt(int index)
 *      B、怎么知道字符有多少个？
 *                  int length()
 *
 */
public class f_字符串遍历 {
    public static void main(String[] args) {
        //原始版本
        String s = "hello world";
//        for (int i = 0; i < 11; i++) {
//            System.out.print(s.charAt(i));
//        }
        //改进版本
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}

