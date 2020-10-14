package Java基础_01.跳转控制语句;

/**
 *          跳转控制语句 （一）、break语句
 *
 *          break：中断 的意思
 *          使用场景：
 *              A、switch循环。
 *              B、循环语句中。
 *                  （循环语句中加入了if判断的情况）
 *              注意：离开上面两点，无意义！！
 *          如何使用：
 *              A、跳出单层循环 ⭐
 *              B、跳出多层循环 ⭐⭐
 *                  ⭐要实现该效果，必须使用带标签的语句。
 *                      格式：
 *                          标签名:语句
 *
 */
public class A_break语句 {
    public static void main(String[] args) {

        /** A、跳出 单 层循环 */
        for(int x = 0; x < 10;x++) {
            if(x == 3){
                break;  //直接跳出了for循环层。所以hello word只打印了3次。
            }
            System.out.println("hello word");
        }

        /** B、跳出 多 层循环 */
        wc:for (int x = 0;x < 3;x++){
            nc:for (int y = 0;y<4;y++){
                if(y == 2){
                    break wc; //这样直接就跳出了外层的wc:for循环了！！
                              //外层就执行了1次，内层也就执行到y=2的时候。
                }
                System.out.println("⭐");
            }
            System.out.println("巴拉巴拉"); /** 还没来得及打印输出，就已经跳出了外层for循环了。*/
        }
        System.out.println("--------------------------");
        /** 比较 */
        for (int x = 0;x < 3;x++){
            for (int y = 0;y<4;y++){
                if(y == 2){
                    break; //如果是这样只是直接跳出了内层的for循环！！
                           //外层依旧是执行3次，内层每次都是到y=2的时候跳出循环。
                }
                System.out.print("⭐");
            }
            System.out.println("---");
        }
    }
}


