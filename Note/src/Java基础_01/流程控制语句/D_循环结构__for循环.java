package Java基础_01.流程控制语句;
/**
 *      （三）、循环结构 ：for循环
 *
 *              [for循环格式:]
 *                  for(初始化语句;判断条件语句;控制条件语句){
 *                          循环体语句;
 *                  }
 *
 *               [执行流程:]
 *                  A:执行初始化语句
 *                  B:执行判断条件语句，看其返回值是true还是false
 *                          如果是true，就继续执行
 *                          如果是false，就结束循环
 *                  C:执行循环体语句
 *                  D:执行控制条件语句
 *                  E:回到B继续
 *
 *               [注意事项:]
 *                  A:判断条件语句无论简单还是复杂，结果都是boolean类型。
 *                  B:循环体语句如果是一条语句，大括号可以省略；
 *                    如果是多条语句，大括号不能省略。
 *
 *
 */
public class D_循环结构__for循环 {
    public static void main(String[] args) {

        /** 控制台输出10次HelloWord*/
        int i;
        for(i = 0;i < 10;i++) {
            System.out.println("HelloWord");
        }


        /** 求出1-10之间整数之和*/
        int a,sum=0;
        for (a = 1;a <= 10;a++){
            sum += a;
        }
        System.out.println("1-10之间整数之和为："+sum);


        /** 求出1-100之间偶数之和*/
        int x,sum1=0;
        for (x = 1;x <= 100;x++){
            if(x % 2 == 0){
                sum1 += x;
            }
        }
        System.out.println("1-100之间偶数之和为："+sum1);


        /**
         *  题目：在控制台输出“水仙花数”。
         *  “水仙花数” 定义：指一个三位数，其各位数字的立方和等于该数本身。
         *  如：153就是一个水仙花数。
         *  153 = 1*1*1 + 5*5*5 + 3*3*3
         *  那么，如何取出个、十、百三个位数呢？**
         *  假设数据：153
         *  ge：153 % 10 = 3
         *  shi：153/10%10 = 5   (153 / 10的值是 15，因为前面默认是int类型，是取整的！！)
         *  bai：153/10/10%10 = 1
         */
        int j;
        int count = 0;
        for(j = 100;j < 1000;j++){
            int ge = j%10;
            int shi = j/10%10;
            int bai = j/10/10%10;
            if(j == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                //如果相同，则该数就是水仙花数
                System.out.println(j);
                //统计水仙花个数
                count++;
            }
        }
        System.out.println("水仙花个数为："+count);
    }
}
