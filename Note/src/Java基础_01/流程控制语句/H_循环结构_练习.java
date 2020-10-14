package Java基础_01.流程控制语句;

/**
 *      循环结构 ： 练习
 *
 *      1、请输出一个4行5列的星星⭐图案。
 *      2、请输出下面的形状：
 *          ⭐
 *          ⭐⭐
 *          ⭐⭐⭐
 *          ⭐⭐⭐⭐
 *          ⭐⭐⭐⭐⭐
 *      3、九九乘法表的输出。
 *
 */
public class H_循环结构_练习 {
    public static void main(String[] args) {
        /** 原始做法*/
        System.out.println("原始做法：");
        System.out.println("⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐");

        /** for循环做法*/        //(利用for循环嵌套)  (外循环控制行数，内循环控制列数。)
        System.out.println("for循环做法：");
        for(int x = 0;x < 4;x++){
            for(int y = 0;y < 5;y++){
                System.out.print("⭐");
            }
            System.out.println();
        }
    }
}

class 输出星星图案 {
    public static void main(String[] args) {
        /**
         * 第2题分析：
         *          第一行：1列  y=0;y<=0;y++
         *          第二行：2列  y=0;y<=1;y++
         *          第三行：3列  y=0;y<=2;y++
         *          第四行：4列  y=0;y<=3;y++
         *          第五行：5列  y=0;y<=4;y++
         */
        System.out.println("第2题：");
        for(int x = 0;x < 5;x++){
            for(int y = 0;y <= x;y++){
                System.out.print("⭐");
            }
            System.out.println();
        }
    }
}

class 九九乘法表 {
    public static void main(String[] args) {
        /**
         * 第3题分析：
         *  1*1=1
         *  1*2=2   2*2=4
         *  1*3=3   2*3=6   3*3=9
         *  ...
         *  1*9=9   2*9=18  .....   .....
         */
        for(int x = 1;x <= 9;x++){
            for (int y = 1;y<=x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");     /**  转义字符：
                 \t表示：tab键
                 \r表示：回车
                 \n表示：换行
                 */
            }
            System.out.println();
        }
    }
}

