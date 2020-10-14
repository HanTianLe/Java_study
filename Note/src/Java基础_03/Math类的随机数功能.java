package Java基础_03;
import java.util.Scanner;

/**
 *      Math：类包含用于执行基本数学运算的方法
 *
 *      由于 Math类在 java.lang 包下，所以不需要导包。
 *
 *      特点：
 *          没有构造方法，因为他的成员变量全部是静态的。
 *
 *      掌握一个方法：
 *          获取随机数。
 *          public static double random()
 *          返回带正号的 double 值，该值大于等于 0.0 且小于 1.0 。    [0.0 , 1.0)
 *          返回值是一个伪随机选择的数，在改范围内（近似）均匀分布。
 *
 *          Math.random()   [0.0 , 1.0)
 *
 */
public class Math类的随机数功能 {
    public static void main(String[] args) {
        /** 获取一个随机数*/
        double d = Math.random();
        System.out.println("随机生成一个数："+d);

        /**
         * 如果
         * 我要获取100个 1-100 之间的随机数，怎么办？
         * (int) : 强转为整型！
         */
        System.out.println("生成100个 1-100 之间的随机整数：");
        for (int x = 1;x <= 10;x++) {
            for (int y = 1;y <= 10;y++){                     // [0.0 , 100.0)     加1后
                int num = (int) ((Math.random() * 100) + 1); // [1.0 , 101.0)   又因为强转整型，
                System.out.print(num+"\t");                  // 所以实际范围是 [1 , 100]
            }
            System.out.println();
        }
    }
}

/**
 *      作业：
 *          做一个猜字小游戏
 *
 *          分析：
 *              A、程序随机产生一个数。（被猜的数）
 *              B、键盘录入数据。（自己猜的）
 *              C、把自己猜的数和被猜的数进行比较。
 *                  a、大了
 *                  b、小了
 *                  c、猜对了
 *              D、给出多次猜的机会。猜中结束。
 *                  while() 循环，猜中就结束。
 */
class 猜字小游戏{
    public static void main(String[] args) {
        int num = (int) ((Math.random() * 100) + 1);

        while (true){
            System.out.print("请输入你要猜的数(1-100之间的整数)：");
            Scanner sc = new Scanner(System.in);
            int guessNum = sc.nextInt();
            /** 比较*/
            if (guessNum > num){
                System.out.println("你猜的数据"+guessNum+"大了~");
            }else if (guessNum < num){
                System.out.println("你猜的数据"+guessNum+"小了~");
            }else {
                System.out.println("恭喜你，猜中了！");
                break;  //跳出本次循环
            }
        }
    }

}

