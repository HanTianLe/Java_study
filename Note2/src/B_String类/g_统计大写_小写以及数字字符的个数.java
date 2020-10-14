package B_String类;
 /**
  *  2、【统计大写、小写以及数字字符的个数】
  *
  *     举例：Hello123World
  *
  *     结果：
  *         大写字符：2个
  *         小写字符：8个
  *         数字字符：3个
  *
  *     分析：
  *         A、定义三个统计变量。
  *             bigCount = 0;
  *             smallCount = 0;
  *             numberCount = 0;
  *         B、遍历字符串，得到每一个字符。
  *             length()和charAt()结合
  *         C、判断该字符串到底是属于那种类型
  *             大：bigCount++
  *             小：smallCount++             【 该案例的难点就是如何判断某个字符是大的，还是小的，还是数字的 】
  *             数字：numberCount++
  *
  *             ASCII码表:0   48
  *                      A   65
  *                      a   97
  *                 char ch = s.charAt(x);
  *                 if(ch >= '0' && ch <= '9') numberCount++
  *                 if(ch >= 'a' && ch <= 'z') smallCount++
  *                 if(ch >= 'A' && ch <= 'Z') bigCount++
  *         D、输出结果
  *
  */
public class g_统计大写_小写以及数字字符的个数 {
    public static void main(String[] args) {
        //定义字符串
        String s = "Hello123World";

        //定义三个统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历得到每一个字符串
        for (int x = 0; x < s.length(); x++) {
            char ch  =s.charAt(x);
            //判断类型
            if (ch >= '0' && ch <= '9'){
                numberCount++;
            }else if (ch >= 'a' && ch <= 'z'){
                smallCount++;
            }else if (ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }
        }

        //输出结果
        System.out.println("大写字母个数："+bigCount);
        System.out.println("小写字母个数："+smallCount);
        System.out.println("数字个数："+numberCount);
    }
}

