package Java基础_02.pack_3二维数组;

/**
 *      1、二维数组的遍历
 *
 */
public class 练习1遍历 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        /**
         * arr[0]表示第一个数组
         * arr[0] = {1,2,3};
         *
         * arr.length 表示二维数数组的长度，也就是一维数组的个数！！⭐
         * arr[x].length 表示该一维数组的长度！！⭐
         *
         */
        //用循环表示
        for (int x = 0;x<arr.length;x++){
            for (int y = 0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------");
        //定义一个列数变化的二维数组
        int[][] arr1 = {{1},{2,3},{4,5,6}};
        //调用方法遍历arr1
        printArray(arr1);

    }

    /**
     * (二维数组遍历) 的方法
     * @param arr
     */
    public static void printArray(int[][] arr){
        for (int x = 0;x<arr.length;x++){
            for (int y = 0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }

}
