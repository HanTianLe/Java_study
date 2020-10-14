package Java基础_01.流程控制语句;

/**
 *      do...while循环的基本格式：
 *          do{
 *              循环体语句;
 *          }while(判断条件语句);
 *
 *          扩展格式：
 *          do{
 *              循环体语句;
 *              控制条件语句;
 *          }while(判断条件语句);
 *
 */
public class G_循环结构_do_while循环 {
    public static void main(String[] args) {
        /** 输出10次hello world*/
        int x= 0;
        do{
            System.out.println("hello world");
            x++;
        }while (x<10);
        System.out.println("-------------------");

        /** 求和1-100之间整数之和。*/
        int sum = 0;
        int a = 1;
        do{
            sum += a;
            a++;
        }while (a<=100);
        System.out.println("1-100直接整数之和为："+sum);
    }
}
