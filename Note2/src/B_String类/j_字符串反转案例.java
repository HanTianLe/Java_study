package B_String类;

import java.util.Scanner;

public class j_字符串反转案例 {
    public static void main(String[] args) {
        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String line = sc.nextLine();
        // 定义一个新的字符串
        String result = "";
        // 把字符串转换字符数组
        char[] chs = line.toCharArray();
        // 逆遍历字符串，得到每一个字符
        for (int x = chs.length - 1; x >= 0; x--) {
            //用新字符串把每一个字符拼接起来
            result += chs[x];
        }
        // 输出字符串
        System.out.println("反转后的结果是："+result);

        //改进为功能实现
        String s = myReverse(line);
        System.out.println("实现功能后的结果是："+s);
    }

    /**
     * 两个明确：
     *      返回值类型：String
     *      参数类型：String
     * @param s
     * @return
     */
    public static String myReverse(String s){
        // 定义一个新字符串
        String result = "";
        // 把字符串转成字符数组
        char[] chs = s.toCharArray();
        // 逆遍历字符串，得到每一个字符
        for (int x = chs.length - 1; x >= 0; x--) {
            //用新字符串把每一个字符拼接起来
            result += chs[x];
        }
        return result;
    }

}

