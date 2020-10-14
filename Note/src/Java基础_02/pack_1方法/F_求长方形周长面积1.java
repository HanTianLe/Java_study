package Java基础_02.pack_1方法;
import java.util.Scanner;

/**
 *      1、用定义方法
 */
class Test1{
    private int length;
    private int width;

    public Test1(){};

    /**获取长宽的方法*/
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
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


public class F_求长方形周长面积1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形的长：");
        int length = sc.nextInt();
        System.out.print("请输入长方形的宽：");
        int width = sc.nextInt();

        /** 为长与宽赋值*/
        Test1 t = new Test1();
        t.setLength(length);
        t.setWidth(width);
        System.out.println("周长是："+t.getPerimeter());
        System.out.println("面积是："+t.getArea());

    }
}


