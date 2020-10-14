package Java基础_02.pack_3二维数组;
import java.util.Scanner;

/**
 *      打印杨辉三角形 (行数可以键盘录入)
 *      1
 *      1 1
 *      1 2 1
 *      1 2 3 1
 *      1 4 6 4 1
 *      1 5 10 10 5 1
 *      ......
 *      分析：
 *          A、任何一行的第一列和最后一列都是1
 *          B、从第3行开始，除了第1个和最后1个数据外，每一个数据都是前一行的(前一列和本列)的数据之和。
 *
 *      步骤：
 *          A、先定义一个二维数组，行数如果是n，我们把列数也定义为 n。(每行的列数与行号是相等的;如,如，2行则2列)
 *              这个n的数据也来自于键盘录入。
 *          B、给这个二维数组任何一行的第1列和最后1列赋值为1
 *              从第三行开始，每一个数据是它前一行的(前一列和本列)的数据之和。
 *          C、遍历这个二维数组。
 */
public class 练习3杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数据：");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        /** 给二维数组任何一行的第1列和最后1列赋值为1。*/
        for (int x = 0;x < arr.length;x++){
            arr[x][0] = 1;  //任何一行的第1列
            arr[x][x] = 1;  //任何一行的最后1列
        }

        /** 给其他的元素赋值*/
        for (int x = 2;x < arr.length;x++){//从第3行开始
            for (int y = 1;y <= x-1;y++){  //从每一行的第2列到倒数第2列。
                arr[x][y] = arr[x-1][y-1] + arr[x-1][y];    /** 从第3行开始，每一个数据
                                                                是它前一行的(前一列和本列)的数据之和。*/
            }
        }

        /** 遍历出二维数组*/
        for (int x = 0; x < arr.length;x++){
            for (int y = 0;y <= x;y++){     /** 这边一定要写成 : y<=x
                                                因为每行的列数跟行号是对应的;如,2行则2列
                                                如果写成 : y<arr[x].length
                                                那么遍历的则是 n 行 n 列了。 */
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }
}
