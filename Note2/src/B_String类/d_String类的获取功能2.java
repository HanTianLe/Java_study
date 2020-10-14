package B_String类;

/**
 *  String类的
 *  获取功能：
 *      1、int length()：获取字符串的长度。
 *      2、char charAt(int index)：获取指定索引位置的字符。
 *      3、int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
 *                          为什么这里是int类型，而不是char类型呢？
 *                          原因是：'a'和97都可以代表'a'。
 *      4、int indexOf(String str)：返回指定字符串在此字符串中第一次出现处的索引。
 *      5、int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
 *      6、int indexOf(String str,int fromIndex)：返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
 *      7、String substring(int start)：从指定位置开始截取字符串，默认到末尾。
 *      8、String substring(int start,int end)：从指定位置开始到指定位置结束截取字符串。 (包左不包右！)
 *
 */
public class d_String类的获取功能2 {
    public static void main(String[] args) {
        String s = "hello world";
        // 1、int length()：获取字符串的长度。
        System.out.println("length："+s.length());   //length：11
        System.out.println("-----------------------------");
        // 2、char charAt(int index)：获取指定索引位置的字符。
        System.out.println("charAt："+s.charAt(6));  //charAt：w
        System.out.println("-----------------------------");
        // 3、int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
        System.out.println("indexOf："+s.indexOf('l'));  //indexOf：2
        System.out.println("-----------------------------");
        // 4、int indexOf(String str)：返回指定字符串在此字符串中第一次出现处的索引。
        System.out.println("indexOf："+s.indexOf("lo")); //indexOf：3   返的是lo中首字母l的索引位置。
        System.out.println("-----------------------------");
        // 5、int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
        System.out.println("indexOf："+s.indexOf('l',4)); //indexOf：9
        System.out.println("indexOf："+s.indexOf('l',40));//indexOf：-1
        System.out.println("indexOf："+s.indexOf('k',4)); //indexOf：-1
        System.out.println("-----------------------------");
        // 6、int indexOf(String str,int fromIndex)：返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
        System.out.println("indexOf："+s.indexOf("ld",40));//indexOf：-1
        System.out.println("indexOf："+s.indexOf("lk",4)); //indexOf：-1
        System.out.println("indexOf："+s.indexOf("ld",4)); //indexOf：9
        System.out.println("-----------------------------");           //返的是ld中首字母l的索引位置。
        // 7、String substring(int start)：从指定位置开始截取字符串，默认到末尾。
        System.out.println("substring："+s.substring(6));    //substring：world
        System.out.println("substring："+s.substring(0));    //substring：hello world
        System.out.println("-----------------------------");
        // 8、String substring(int start,int end)：从指定位置开始到指定位置结束截取字符串。
        System.out.println("substring："+s.substring(0,10)); //hello worl    (包左不包右)
        System.out.println("substring："+s.substring(4,7));  //o w           (包左不包右)
        System.out.println("substring："+s.substring(0,s.length())); //substring：hello world
    }
}

