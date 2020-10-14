package C_StringBuffer类;

/**
 *  把数组拼接成一个字符串
 *
 */
public class h_练习 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {11,22,33,55,44,66};

        // 定义功能
        // 方式一：用String做拼接的方式
        String s1 = arrayToString(arr);
        System.out.println("s1："+s1);

        // 方式二：用StringBuffer做拼接的方式
        String s2 = arrayToString2(arr);
        System.out.println("s2："+s2);
    }

    /**
     * 用 String做拼接的方法
     * @param arr
     * @return
     */
    public static String arrayToString(int[] arr){
        String s = "";
        s += "[";
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1){
                s += arr[x];
            }else {
                s += arr[x];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    /**
     * 用 StringBuffer做拼接的方法
     * @param arr
     * @return
     */
    public static String arrayToString2(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

