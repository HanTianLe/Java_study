package Java基础_01.跳转控制语句;

/**
 *      跳转控制语句 （二）、continue语句
 *
 *      continue：继续 的意思
 *
 *      使用场景：
 *          循环中。
 *              注意：离开次场景无意义！
 *
 *      continue 到和 break 的区别：
 *          break：跳出单层循环。
 *          continue：跳出本次循环，进入下一次循环。
 */
public class B_continue语句 {
    public static void main(String[] args) {
        for(int x = 1;x <=10;x++){
            if(x % 3 == 0){
                continue;   //当 x=3,6,9 的时候，不输出Java基础班，
                            //直接跳到下一次循环。
                            //所以，本来应该输出10次的，可实际是输出7次！！
            }
            System.out.println("Java基础班");
        }
    }
}

