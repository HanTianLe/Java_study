package C_StringBuffer类;

/**
 *  StringBuffer的反转功能：
 *      1、public StringBuffer reverse()：字符反转
 *
 */
public class e_StringBuffer的反转功能 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("May the force be with you!");
        System.out.println("sb："+sb);
        // 1、public StringBuffer reverse()
        sb.reverse();
        System.out.println("sb："+sb);

    }
}

