package Java基础_02.pack_3二维数组;

/**
 *      二维数组：元素为一堆数组的一个数组
 *
 *      格式1：（列固定）（动态初始化）
 *          数据类型[][] 数组名 = new 数据类型[m][n];
 *
 *          m：表示这个二维数组有多少个一维数组。
 *          n：表示每1个一维数组的元素有多少个。
 *
 *      注意：(不推荐用)
 *          以下格式也可以表示二维数组
 *              a、数据类型 数组名[][] = new 数据类型[m][n];
 *              b、数据类型[] 数组名[] = new 数据类型[m][n];
 *
 */
public class 二维数组的格式1 {
    public static void main(String[] args) {
        //定义一个二维数组arr
        int[][] arr = new int[3][2];
        System.out.println(arr);    //地址值
        //输出第几个元素一维数组的名称
        System.out.println(arr[0]);    //地址值
        System.out.println(arr[1]);    //地址值
        System.out.println(arr[2]);    //地址值
        //输出二维数组的元素
        System.out.println(arr[0][0]);    //0
        System.out.println(arr[0][1]);    //0

    }
}
