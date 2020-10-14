package Java基础_01.流程控制语句;
/**
 *         （二）、选择结构 : switch语句
 *
 *                 [格式]：
 *                     switch (表达式){
 *                         case 值1:
 *                             语句体1;
 *                             break;
 *                         case 值2:
 *                             语句体2；
 *                             break;
 *                          .....
 *                          default:
 *                             语句体n+1;
 *                             break;
 *                     }
 *
 *                  [格式的解释]:
 *                     switch : 表示这是switch选择结构
 *
 *                     表达式 : 这个地方的取值是有限定的
 *                         byte , short , int , char
 *                         JDk5以后可以是 [枚举]
 *                         JDK7以后可以是 [字符串]
 *
 *                     case : 后面跟的是要和表达式进行比较的值
 *
 *                     语句体 ：要执行的代码
 *
 *                     break ： 表示中断，结束的意思，可以控制switch语句的结束
 *
 *                     default ： 当所有的值都和表达式不匹配的时候，就执行default控制的语句。
 *                                其实它就是相当于if语句的else
 *
 *                   [switch语句的注意事项]：
 *                         A、case后面只能是常量，不能是变量 ！
 *                            而且，多个case后面的值不可能出现相同的。
 *                         B、default可以省略，但是不建议，
 *                            因为它的作用是对不正确的情况给出提示。
 */
import java.util.Scanner;
public class C_选择结构__switch语句 {
    public static void main(String[] args) {
        /*输入一个1-7的数据，输出对应的星期*/

        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);

        //控制键盘录入数据
        System.out.print("请输入一个数据（1-7）：");
        int week = sc.nextInt();

        //switch判断语句
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
    }
}

class Demo_131{
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        switch (x){
            default:    //顺序是先匹配case，
                y++;    //没有匹配的再执行default！！！
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y); //4
        System.out.println("---------------------");

        int a = 2;
        int b = 3;
        switch (a){
            default:
                b++;    //没有break，会导致case穿透。会再执行后面的两个b++ 。
            case 3:     //case穿透
                b++;
            case 4:     //case穿透
                b++;
        }
        System.out.println("b="+b); //6
    }
}

class Demo_132{
    public static void main(String[] args) {
        System.out.println("下面的几个人你最爱谁？");
        System.out.println("65 成龙");
        System.out.println("66 王力宏");
        System.out.println("67 彭于晏");
        System.out.println("68 刘德华");

        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你的选择：");
        int choiceNumber = sc.nextInt();    //整型（int类型）！！

        //强制转换为 字符型
        char choice = (char) choiceNumber;
        //65 66 67 68 对应于ASCII码 A B C D

        switch (choice){
            case 'A':
                System.out.println("1正确~~~");
                break;
            case 'B':
                System.out.println("2错误~~~");
                break;
            case 'C':
                System.out.println("3正确~~~");
                break;
            case 'D':
                System.out.println("4错误~~~");
                break;
            default:
                System.out.println("没有该选项!!");
                break;
        }
    }
}

class Demo_133{
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //录入数据
        System.out.print("请输入你要判断的字符串：");
        String s = sc.nextLine();   //字符串类型！！

        switch(s){
            case "hello":
                System.out.println("你输入的是hello");
                break;
            case "world":
                System.out.println("你输入的是world");
                break;
            case "Java":
                System.out.println("你输入的是Java");
                break;
            default:
                System.out.println("没有找到你输入的数据！");
                break;
        }
    }
}

class Demo_134{
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //录入数据
        System.out.print("请输入月份（1-12）：");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 2:         // 利用break穿透可以简写~~
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:         // 利用break穿透可以简写~~
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:         // 利用break穿透可以简写~~
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:        // 利用break穿透可以简写~~
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("月份输入错误！");
                break;
        }
    }
}

