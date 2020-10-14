package Java基础_02.pack_3二维数组;

/**
 *      格式2：（列变化）（动态初始化）
 *          数据类型[][] 数组名 = new 数据类型[m][];
 *
 *          m：表示这个二维数组有多少个一维数组。
 *          列数：没有给出，可以动态给，这一次是一个变化的数。
 *
 */
public class 二维数组的格式2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        System.out.println(arr);    //[[I@1b6d3586
        System.out.println(arr[0]); //null
        System.out.println(arr[1]); //null
        System.out.println(arr[2]); //null

        /** 动态的为每 1 个一维数组分配空间*/
        /** 二维数组名配合 1 个编号表示：一维数组*/
        arr[0] = new int[2];    //第1个一维数组
        arr[1] = new int[3];    //第2个一维数组
        arr[2] = new int[1];    //第3个一维数组

        System.out.println(arr[0]); //[I@4554617c
        System.out.println(arr[2]); //[I@74a14482
        System.out.println(arr[2]); //[I@74a14482

        /** 第1个一维数组*/
        System.out.println("第1个一维数组:");
        System.out.println(arr[0][0]);  //0
        System.out.println(arr[0][1]);  //0
        //System.out.println(arr[0][2]);
        /**出现错误：ArrayIndexOutOfBoundsException: 2       (索引越界)
         * 前面的 arr[0] = new int[2]; 只为二维数组中的第1个一维数组分配了两个空间，
         * 所以索引最大值为 1 。
         */
        /** 第2个一维数组*/
        System.out.println("第2个一维数组:");
        System.out.println(arr[1][0]);  //0
        System.out.println(arr[1][1]);  //0
        System.out.println(arr[1][2]);  //0
        /** 第3个一维数组*/
        System.out.println("第3个一维数组:");
        System.out.println(arr[2][0]);  //0

        /** 二维数组名配合 2 个编号表示：二维数组元素*/
        arr[1][0] = 200;
        arr[2][0] = 400;

    }
}

