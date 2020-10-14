package Java基础_02.pack_1方法;
import java.util.Scanner;
/**
 *      方法的调用，[void类型方法的定义和调用]
 *
 *          void类型返回值的方法调用：
 *                  A、单独调用  (只有1种⭐)
 */

/**
 *  例题：
 *          控制台输出如下现状：  (用void方法)
 *                              (最好用键盘输入)
 *                  ⭐⭐⭐⭐⭐
 *                  ⭐⭐⭐⭐⭐
 *                  ⭐⭐⭐⭐⭐
 *                  ⭐⭐⭐⭐⭐
 *
 *          两个明确：
 *              返回值类型：void
 *              参数列表：int m,int n
 *
 */
public class C_方法的调用__void类型方法的定义和调用 {
    public static void main(String[] args) {
        //单独使用
        int a = 2;
        int b = 2;
        pringxing(a, b);
        System.out.println("----------------");
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数：");
        int x = sc.nextInt();
        System.out.print("请输入列数：");
        int y = sc.nextInt();
        //调用pringxing方法
        pringxing(x, y);

    }

    /**
     * 定义一个根据 行 和 列 输出⭐的方法。
     * @param m
     * @param n
     */
    public static void pringxing(int m, int n) {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

}

/**
 *      键盘录入一个数据(1<=n<=9),
 *      在控制台输出对应的nn乘法表。
 */
class Demo_031{
    public static void main(String args[]){
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入n的值(1<=n<=9)：");
        int n = sc.nextInt();

        //调用printnn方法
        printnn(n);
    }

    /**
     * 定义一个printnn方法
     * @param n
     */
    public static void printnn(int n){
        for (int x = 1;x <= n;x++){
            for (int y =1; y <= x;y++){
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }

}


