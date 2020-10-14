package Java基础_02.pack_3二维数组;

/**
 *      2、二维数组的求和
 *
 *          如何求和？
 *              通过遍历获取每一个元素，然后依次累加。
 *
 */
public class 练习2求和 {
    public static void main(String[] args) {
        int[][] arr = {{11,22,33},{44,55,66},{77,88,99},{100,200,300}};
        int sum = 0;

        for (int x = 0;x < arr.length;x++){
            for (int y = 0;y < arr[x].length;y++){
                sum += arr[x][y];
            }
        }
        System.out.println("二维数组arr的和为："+sum);


        //定义数组arr1
        int[][] arr1 = {{11,22,33},{44,55,66},{77,88,99}};
        //调用Arraysum方法
        System.out.println("二维数组arr1的和为："+Arraysum(arr1));
    }


    /**
     * 定义一个 (二维数组求和) 的方法
     * @param arr
     * @return
     */
    public static int Arraysum(int[][] arr){
        int sum = 0;
        for (int x = 0;x < arr.length;x++){
            for (int y = 0;y < arr[x].length;y++){
                sum += arr[x][y];
            }
        }
        return sum;
    }

}
