package C_StringBuffer类;

/**
 *  StringBuffer的删除功能：
 *      1、public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身。
 *      2、public StringBuffer delete(int start,int end)：删除从指定位置开始指定位置结束的内容，并返回本身。
 *                                注意：区间包左不包右！！！！ 也就是[start,end) 相当于：[start,end-1]
 *
 */
public class c_StringBuffer的删除功能 {
    public static void main(String[] args) {
        // 创建对象
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World").append("Java").append('~');
        System.out.println("sb："+sb);   // sb：HelloWorldJava~
        // 1、public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身。
        // 需求：要删除e这个字符
//        sb.deleteCharAt(1);
//        System.out.println("sb："+sb);   // sb：HlloWorldJava~

        // 2、public StringBuffer delete(int start,int end)：删除从指定位置开始指定位置结束的内容，并返回本身。
        // 需求：删除World这个字符串
        sb.delete(5,10);    //区间包左不包右！！！！！  相当于区间[5,9]
        System.out.println("sb："+sb);   // sb：HelloJava~

        // 需求：删除所有数据
        sb.delete(0,sb.length());
        System.out.println("sb："+sb);   // sb：
    }
}

