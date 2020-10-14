package Java基础_01.跳转控制语句;

/**
 *      跳转控制语句 （三）、return语句
 *
 *      return：返回 的意思。
 *
 *      其作用不是结束循环的，而是结束方法的！！
 *
 */
public class C_return语句 {
    public static void main(String[] args) {
        for(int x = 0;x < 5;x++){
            if(x == 2){
                System.out.println("退出!");
                return; //直接结束该⭐方法⭐了（main方法）！该方法后面x和over~都不打印了。
            }
            System.out.println(x);
        }
        System.out.println("over~");
    }
}

/**
 * 比较 1
 */
class Demo_211{
    public static void main(String[] args) {
        for(int x = 0;x < 5;x++){
            if(x == 2){
                System.out.println("退出!");
                break;  //直接跳出for循环，for循环后面的over~依旧打印。
            }
            System.out.println(x);
        }
        System.out.println("over~");
    }
}

/**
 * 比较 2
 */
class Demo_212{
    public static void main(String[] args) {
        for(int x = 0;x < 5;x++){
            if(x == 2){
                System.out.println("退出!");
                continue; //直接跳出本次循环，即当x = 2时，后面的x不打印。
            }
            System.out.println(x);
        }
        System.out.println("over~");
    }
}
//4.32