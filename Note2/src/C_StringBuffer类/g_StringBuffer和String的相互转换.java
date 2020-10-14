package C_StringBuffer类;

/**
 *  StringBuffer和String的相互转换：
 *      String转StringBuffer：
 *                      1、构造方法
 *                      2、append方法
 *      StringBuffer转String：
 *                      1、构造方法
 *                      2、通过toString()方法
 *
 */
public class g_StringBuffer和String的相互转换 {
    public static void main(String[] args) {
        /**
         * String 转 StringBuffer
         */
        String s = "hello";
        // 1、构造方法
        StringBuffer sb = new StringBuffer(s);
        System.out.println("sb："+sb);
        // 2、append方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println("sb2："+sb2);
        System.out.println("-----------------------");
        /**
         * StringBuffer 转 String
         */
        StringBuffer stringBuffer = new StringBuffer("Java");
        // 1、构造方法
        String str = new String(stringBuffer);
        System.out.println("str："+str);
        // 2、通过toString()方法
        String str2 = stringBuffer.toString();
        System.out.println("str2:"+str2);

    }
}

