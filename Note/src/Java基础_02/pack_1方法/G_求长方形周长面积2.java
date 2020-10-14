package Java基础_02.pack_1方法;
import java.util.Scanner;

/**
 *      2、用构造方法
 */

class Test2{
    private int length;
    private int width;

    /** 构造方法1 */
    public Test2(){};
    /** 构造方法2  (重载)*/
    public Test2(int length,int width){
        this.length = length;
        this.width = width;
    }

    /** 求周长的方法*/
    public int getPerimeter(){
        return (length + width) * 2;
    }
    /** 求面积的方法*/
    public int getArea(){
        return length * width;
    }

}

public class G_求长方形周长面积2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形的长：");
        int length = sc.nextInt();
        System.out.print("请输入长方形的宽：");
        int width = sc.nextInt();

        /** 为长与宽赋值*/
        Test2 t = new Test2(length,width);
        System.out.println("周长为："+t.getPerimeter());
        System.out.println("面积为："+t.getArea());
    }
}

