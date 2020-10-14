package Java基础_01.运算符;
/**
 【三目运算符】：(又称"三元运算符")
 格式： 比较表达式 ？ 表达式1 : 表达式2;

 比较表达式：结果应该是boolean类型。

 执行流程：
 根据比较表达式的计算返回一个 true 或 false 。
 如果是 true ，就把表达式1作为结果。
 如果是 false ，就把表达式2作为结果。
 */
public class 三元运算符 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        int z = ((x > y) ? x : y);
        int s = ((x < y) ? x : y);
        int v = ((x == y) ? x : y);
        System.out.println("z:"+z); //200
        System.out.println("s:"+s); //100
        System.out.println("v:"+v); //200
    }
}

/**
 题目：
 1、求两个数当中的最大值
 2、求三个数当中的最大值
 3、比较两个整数是否相同
 */
class Demo_091{
    public static void main(String[] args) {
        //获取两个数的最大值
        int x = 100;
        int y = 200;

        int max = ((x > y) ? x : y);
        System.out.println("max:"+max);
        System.out.println("-----------------------------");

        //获取三个数的最大值
        int a = 10;
        int b = 30;
        int c = 20;
        //分两步：
        //1、先比较a，b的最大值；
        //2、再拿a，b的最大值和c进行比较
        int temp = ((a > b) ? a : b);
        int max1 = ((temp > c) ? temp : c);
        System.out.println("max1:"+max1);

        //一步搞定
        int max2 = (a > b) ? ((a > c)?a:c) : ((b > c)?b:c);
        System.out.println("max2:"+max2);

        //比较两个整数是否相同
        int m = 100;
        int n = 200;

        boolean flag = (m == n);
        /**
         boolean flag = (m == n) ? true : false;
         这样写没问题，但是flag本身就是boolean类型，则结果也是boolean类型，
         所以后面的 ? true : false可以省略！
         */
        System.out.println(flag);
    }
}

