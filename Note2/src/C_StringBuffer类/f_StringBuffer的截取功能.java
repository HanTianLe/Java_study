package C_StringBuffer类;

/**
 *  StringBuffer的截取功能：
 *      1、public String substring(int start)：截取从开始点到结尾的内容。
 *      2、public String substring(int start,int end)：截取指定区间的内容。
 *          注意：区间包左不包右！！！！ 也就是[start,end) 相当于：[start,end-1]
 *
 */
public class f_StringBuffer的截取功能 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World").append("Java");
        // 1、public String substring(int start)：
        String s = sb.substring(5);
        System.out.println("sb："+sb);
        System.out.println("s："+s);
        // 2、public String substring(int start,int end)：
        String ss = sb.substring(5,10); //区间包左不包右！！！！
        System.out.println("ss："+ss);
    }
}

