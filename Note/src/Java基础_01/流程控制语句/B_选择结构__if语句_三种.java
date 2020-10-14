package Java基础_01.流程控制语句;
/**
 （二）、选择结构 :if语句  <三种>

 [第一种格式]：
 if (关系表达式){
 语句体;
 }

 */
import java.util.Scanner;
public class B_选择结构__if语句_三种 {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10){
            System.out.println("x=10");
        }
    }
}

/**
 [第二种格式]：
 if (关系表达式){
 语句体1;
 }else{
 语句体2;
 }
 */

class Demo_121{
    public static void main(String[] args) {
        //判断两个数据是否相等
        int a = 10;
        int b = 20;

        if (a == b){
            System.out.println("a等于b");
        }else {
            System.out.println("a不等于b");
        }
    }
}

/**
 练习：A、获取两个数据中较大的值
 B、判断一个数据是奇数还是偶数。
 */
class Demo_122{
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //A、获取两个数据中较大的值
        System.out.print("请输入第一个数据：");
        int a = sc.nextInt();

        System.out.print("请输入第二个数据：");
        int b = sc.nextInt();

        //定义一个变量接收最大值
        int max;

        if (a > b){
            max = a;
        }else {
            max = b;
        }
        System.out.println("最大值为："+max);

        System.out.println("-------------------------------------");

        //B、判断一个数据是奇数还是偶数。
        System.out.print("请输入你要判断的数据：");
        int c = sc.nextInt();

        if (c%2 == 0){
            System.out.println(c+"这个数是偶数");
        }else {
            System.out.println(c+"这个数是奇数");
        }
    }
}

/**
 [第三种格式]：
 if (关系表达式1){
 语句体1;
 }else if (关系表达式2){
 语句体2;
 }else if (关系表达式3){
 语句体3;
 }
 .....
 */
class Demo_123{
    public static void main(String[] args) {
        //需求：键盘录入一个成绩，并判断输出成绩的等级
        /*
            90-100  优秀
            80-90   好
            70-80   良
            60-70   及格
            0-60    不及格
         */
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你的成绩：");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("优秀");
        }else if (score >= 80 && score < 90){
            System.out.println("好");
        }else if (score >=70 && score < 80){
            System.out.println("良");
        }else if (score >=60 && score < 70){
            System.out.println("及格");
        }else if (score >= 0 && score <60){
            System.out.println("不及格");
        }else {
            System.out.println("你输入的成绩有误");
        }
    }
}

/*
    键盘录入x的值，计算出y的值并输出。
    x>=3    y = 2x+1;
    -1<x<3  y = 2x;
    x<=-1   y = 2x - 1;
 */
class Demo_124{
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入x的值：");
        int x = sc.nextInt();

        //定义一个y
        int y;

        //用if语句格式3进行判断
        if (x >= 3){
            y = 2*x + 1;
        }else if (x > -1 & x < 3){
            y = 2*x;
        }else {
            y = 2*x - 1;
        }
        System.out.println("y=" + y);
    }
}


