package C_StringBuffer类;

/**
 *  StringBuffer的替换功能：
 *      1、public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换。
 *                                 注意：区间包左不包右！！！！ 也就是[start,end) 相当于：[start,end-1]
 *
 */
public class d_StringBuffer的替换功能 {
    public static void main(String[] args) {
        // 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();
        // 添加数据
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        System.out.println("sb："+sb);
        // 1、public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换。
        // 需求：把world这个数据替换为”节日快乐“
        sb.replace(5,10,"节日快乐");// 区间包左不包右！！  也就是[5,10) 相当于：[5,9]
        System.out.println("sb："+sb);

    }
}

