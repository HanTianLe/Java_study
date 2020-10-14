package B_String类;

/**
 *  需求：把一个字符串的首字母转大写，其余转小写（只考虑英文大小写字母字符）
 *
 *  举例：
 *      helloWORLD
 *  结果：
 *      Helloworld
 *  分析：
 *      A、先获取第一个字符。
 *      B、获取除了第一个字符以外的字符。
 *      C、把A转为大写。
 *      D、把B转成小写。
 *      E、C拼接D。　
 *
 */
public class h_把一个字符串的首字母转大写_其余转小写 {
    public static void main(String[] args) {
        String s = "helloWORLD";
        // 先获取第一个字符
        String s1 = s.substring(0,1);
        // 获取除了第一个字符以外的字符
        String s2 = s.substring(1);
        // 把A转为大写
        String s3 = s1.toUpperCase();
        // 把B转为小写
        String s4 = s2.toLowerCase();
        // C拼接D
        String s5 = s3.concat(s4);
        // 输出
        System.out.println("初始方法："+s5);

        /** 优化方法（炫技写法）*/
        String result = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println("优化方法："+result);
    }
}

