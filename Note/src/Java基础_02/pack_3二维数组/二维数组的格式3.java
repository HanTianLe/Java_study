package Java基础_02.pack_3二维数组;

/**
 *      格式3：（静态初始化）
 *          数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};
 *
 *      简化格式：
 *          数据类型[][] 数组名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};
 *
 *      举例：
 *          int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
 *          int[][] arr = {{1,2,3},{4,5},{6}};
 *
 */
public class 二维数组的格式3 {
    public static void main (String[] args){
        int[][] arr = {{1,2,3},{4,5},{6}};
        System.out.println(arr);        //地址值[[I@1b6d3586
        System.out.println(arr[0]);     //地址值[I@4554617c
        System.out.println(arr[1]);     //地址值[I@74a14482
        System.out.println(arr[2]);     //地址值[I@1540e19d
        System.out.println(arr[0][0]);  //1
        System.out.println(arr[1][0]);  //4
        System.out.println(arr[2][0]);  //6
        System.out.println(arr[0][1]);  //2
        System.out.println(arr[1][1]);  //5
        /**索引越界*/
        //System.out.println(arr[2][1]);    错误

    }
}
