package Java基础_02.pack_1方法;
import java.util.Scanner;

/**
 *      方法的调用，[有明确返回值的调用]
 *
 *      ⭐⭐如何调用？
 *          A、单独调用，一般来说没有意义，所以不推荐。
 *          B、输出调用，有意义，但是不够好。因为我们可能针对结果进行进一步操作。
 *          C、赋值调用，推荐使用。
 *
 *      方法的注意事项：
 *          A、方法不调用，不执行。
 *          B、方法与方法是平级关系，不能嵌套定义。⭐⭐
 *          C、方法定义的时候，参数之间用逗号隔开。
 *          D、方法调用的时候不用在传递数据类型。⭐！！
 *          E、如果方法有明确的返回值，一定要有return带回一个值。⭐
 */
public class B_方法的调用__有明确返回值 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //方法1：单独调用
        sum(10,20);
        sum(x,y);

        //方式2：输出调用
        System.out.println(sum(10,10));
        System.out.println(sum(x,y));

        //方式3：赋值调用
        int result = sum(20,20);
        int result1 = sum(x,y);
        //这里result可以操作
        System.out.println(result);
        System.out.println(result1);
    }

    //定义一个sum方法
    public static int sum (int a,int b){
        return a + b;
    }
}


/**
 *  练习：
 *
 *  键盘录入两个数据，返回两个数中的较大值。
 *                  比较这两数是否相等。
 *
 */
class Demo_021{
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数据：");
        int x = sc.nextInt();

        System.out.print("请输入第二个数据：");
        int y = sc.nextInt();

        int Max = getMax(x,y);
        System.out.println("较大值为："+Max);

        boolean dy = compare(x,y);
        System.out.println("这两个数是否相等："+dy);
    }



    /***
     *  要求：比较两个数的大小
     *  2个明确：
     *      返回值类型：int
     *      参数列表：int a,int b;
     */
    public static int getMax(int a,int b){
        /** 用for循环*/
        if(a > b){
            return a;
        }else {
            return b;
        }
        /** 用三元运算符*/
//        int c = ((a > b) ? a:b);
//        return c;
    }

/**
 * 要求：比较两个数是否相等
 * 2个明确：
 *      返回值类型：boolean
 *      参数列表：int a,int b;
 */
    public static boolean compare(int x,int y){
        /** 1、用for语句*/
        if(x == y){
            return true;
        }else{
            return false;
        }
        /** 2、用三元运算符*/
//        boolean flag = ((x == y) ? true : false);
//        return flag;
        /** 3、继续改进：return ((x == y) ? true : false);*/
        /** 4、最终改进：return x == y;*/
    }
}


class Demo_022{
    /**
     *      键盘录入三个数据，返回三个数中的最大值
     *
     */
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        int x = sc.nextInt();
        System.out.print("请输入第二个数：");
        int y = sc.nextInt();
        System.out.print("请输入第三个数：");
        int z = sc.nextInt();

        int max = getMax(x,y,z);
        System.out.println("这三个数中的最大值为："+max);
    }



    /**
     *  要求：返回三个数中的最大值
     *
     *  两个明确：
     *      返回值类型：int
     *      参数列表：int a,int b,int c
     */
    public static int getMax(int a,int b,int c){
        /** if嵌套语句*/
//        if (a > b){
//            if (a > c){
//                return a;
//            }else {
//                return c;
//            }
//        }else {
//            if (b >c){
//                return b;
//            }else {
//                return c;
//            }
//        }
        /** 用三元运算符*/
//        if (a > b){
//            return (a > c ? a : c);
//        }else {
//            return (b > c ? b : c);
//        }

        /** 继续改进    (该方法不建议，因为写代码要注意阅读性强) */
//        return  (a > b) ? (a >c ? a : c) :(b > c ? b : c);

        /** 这样写最好，既简洁，又阅读性强*/
        int temp = ((a > b) ? a : b);
        int max = ((temp > c) ? temp : c);
        return max;
    }

}

/**
 * 方法的注意事项：
 *          A、方法不调用，不执行。
 *          B、方法与方法是平级关系，不能嵌套定义。⭐⭐
 *          C、方法定义的时候，参数之间用逗号隔开。
 *          D、方法调用的时候不用在传递数据类型。⭐！！
 *          E、如果方法有明确的返回值，一定要有return带回一个值。⭐
 *
 */
class Demo_023{
    public static void main(String[] args) {
        //可以这样
        sum(10,20);
        System.out.println(sum(10,20));
        //也可以这样
        int a = 22;
        int b = 33;
        System.out.println(sum(a,b));

        /**
         * 这是错误的：
         * int a = 10;
         * int b= 20;
         * sum(int a,int b);
         */
    }

    //定义 sum 求和方法
    public static int sum(int x,int y){
        return x + y;
    }
}

