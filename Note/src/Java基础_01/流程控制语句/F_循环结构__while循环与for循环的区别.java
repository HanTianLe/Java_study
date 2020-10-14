package Java基础_01.流程控制语句;
/**
 *
 *    while循环与for循环的区别：
 *                   使用区别：如果想在循环结束后，继续使用控制条件的那个变量，用while循环，
 *                            否则用for循环，
 *                             不知道就用for循环。
 *
 */
public class F_循环结构__while循环与for循环的区别 {
    public static void main(String[] args) {
        //for循环实现
        for(int x = 0;x < 10;x++){
            System.out.println("(⊙﹏⊙)");
        }
        //这里不能在继续访问x了！！
//        System.out.println(x);

        int y = 0;
        while (y < 10){
            System.out.println("哈哈哈");
            y++;
        }
        //这里是可以继续访问的
        System.out.println(y);  //y = 10
    }
}
