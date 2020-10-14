package Java基础_01;

/**
 为了让程序的数据更符合开发的数据，我们就加入了键盘输入；让程序更灵活。

 【实现键盘输入】 *****
 A.导包：
 1、格式：import java.util.Scanner;
 2、位置：在class上面。
 B.创建键盘录入对象
 格式：Scanner sc = new Scanner(System.in);
 C.通过对象获取数据
 格式：int x = sc.nextInt();       //** 整型（int类型） **
 String s = sc.nextLine();   //** 字符串类型 **
 */
import java.util.Scanner;
public class 实现键盘输入 {
    public static void main(String[] args) {
        //创建键盘录入数据对象
        Scanner sc = new Scanner(System.in);    //创建对象

        System.out.print("请你输入一个数据：");
//        System.out.println("请你输入一个数据：");
        //这样写也行，只是println有换行作用而已。
        int x = sc.nextInt();

        System.out.println("你输入的数据是："+x);
    }
}

/**
 键盘输入练习：
 1、键盘录入两个数据，并对这两个数据求和，输出其结果。
 2、键盘录入两个数据，获取这两个数据中的最大值。
 3、键盘录入三个数据，获取这三个数据中的最大值。
 4、键盘录入两个数，比较这两个数据是否相等。
 */
class 实现键盘输入1{
    public static void main(String[] args) {
        //1、键盘录入两个数据，并对这两个数据求和，输出其结果。
        Scanner sc = new Scanner(System.in);

        System.out.print("请你输入第一个数据：");
        int x = sc.nextInt();

        System.out.print("请你输入第二个数据：");
        int y = sc.nextInt();

        int sum = (x + y);
        System.out.println("两个数据和为:"+sum);
    }
}

class 实现键盘输入2{
    public static void main(String[] args) {
        //2、键盘录入两个数据，获取这两个数据中的最大值。
        Scanner sc = new Scanner(System.in);

        System.out.print("请你输入第一个数据：");
        int x = sc.nextInt();

        System.out.print("请你输入第二个数据：");
        int y = sc.nextInt();

        //获取这两个数据中的最大值
        int max = (x > y ? x : y);
        System.out.println("这两个数据中的最大值为："+max);
    }
}

class 实现键盘输入3{
    public static void main(String[] args) {
        //3、键盘录入三个数据，获取这三个数据中的最大值。
        Scanner sc = new Scanner(System.in);

        System.out.print("请你输入第一个数据：");
        int x = sc.nextInt();

        System.out.print("请你输入第二个数据：");
        int y = sc.nextInt();

        System.out.print("请你输入第三个数据：");
        int z = sc.nextInt();

        //获取这三个数据中的最大值
        int temp = ((x > y) ? x : y);
        int max = ((temp > z) ? temp : z);
        System.out.println("这三个数最大值为："+max);
    }
}

class 实现键盘输入4{
    public static void main(String[] args) {
        //4、键盘录入两个数，比较这两个数据是否相等。
        Scanner sc = new Scanner(System.in);

        System.out.print("请你输入第一个数据：");
        int x = sc.nextInt();

        System.out.print("请你输入第二个数据：");
        int y = sc.nextInt();

        //比较这两个数据是否相等
        boolean flag = (x == y);
        System.out.println("这两个数据是否相等："+flag);
    }
}

