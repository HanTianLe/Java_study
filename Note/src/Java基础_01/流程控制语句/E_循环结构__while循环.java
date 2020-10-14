package Java基础_01.流程控制语句;

/***
 *          （四）、循环结构 ：while循环
 *
 *              while循环的基本格式：
 *                              while(判断条件语句){
 *                                  循环体语句;
 *                              }
 *
 *              while循环的扩展格式：
 *                              while(判断条件语句){
 *                                  循环体语句;
 *                                  控制条件语句;
 *                              }
 *
 */
public class E_循环结构__while循环 {
    public static void main(String args[]){
        /**输出10次hello word!*/
        int x=0;
        while(x<10){
            System.out.println("hello word!");
            x++;
        }

        /** 求出1-100之间整数之和*/
        int i=1;
        int sum=0;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1-100之间整数之和为："+sum);

        /** 统计水仙花个数,并输出*/
        int count = 0;
        int y = 100;
        while (y<1000){
            int ge = y%10;
            int shi = y/10%10;
            int bai = y/10/10%10;

            if (y == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                count++;
                System.out.println(y);
            }
            y++;
        }
        System.out.println("水仙花的个数为："+count);
        System.out.println("-------------------------------");


        /**
         *   假设1cm厚的纸，折叠多少次到达8848cm？
         *
         */
        int count1 = 0;     //折叠次数
        int end = 8848;     //最终厚度
        int start = 1;      //开始厚度
        while (start < end){
            count1++;
            start *=2;
            System.out.println(start);
        }
        System.out.println("需要折叠"+count1+"次。");
    }
}

