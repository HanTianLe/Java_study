package Java基础_01.运算符;
/**
 【赋值运算符】：
 [基本的赋值运算符]: =
 把=右边的数据赋值给左边

 [扩展的赋值运算符]：+=、-=、*=、/=、%=
 例：+=意思就是把左边和右边做加法然后赋值给左边
 -=意思就是把左边减去右边的数然后赋值给左边
 *=意思就是把左边乘以右边的数然后赋值给左边
 /=意思就是把左边除以右边的数然后赋值给左边
 %=意思就是把左边的数对右边的数取余然后赋值给左边
 */

public class 赋值运算符 {
    public static void main(String args[]){
        //定义一个变量
        int x = 5;

        //其他用法
        int a,b;
        a = b = 10;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        int x1 = 5;
        int y = 9;
        int z = 8;
        x1 %= 2;
        y -= 11;
        z /= 2;
        System.out.println(x1);  //结果为：1
        System.out.println(y);  //结果为：-2
        System.out.println(z);  //结果为：4
    }
}

class timu{
    public static void main(String args[]){

/**     short类型要参与运算，首先要转int类型，才能参与运算。
 否则可能会损失精度！
 short s = 1;
 s = s + 1;
 System.out.println(s);
 */
        //扩展的赋值运算符，其实隐含了一个强制转换！
        //s += 1;
        //不是等价于 s = s + 1;
        //而是等价于 s = (s的数据类型) (s+1);     ！！！
        short s = 1;
        s += 1;
        System.out.println(s);
    }
}
