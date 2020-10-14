package Java基础_01.运算符;
/**
        【比较运算符】：
            ==、!=、>、>=、<、<=             == ：是否等于  *
                                            != ：是否不等于 *

        [*结果*]：
            布尔类型（boolean类型）     ！！！
            false或者true             ！！！

        [特点]：
            无论操作是简单还是复杂，结果都是boolean类型！！！！！

        [注意]：
            == 不能写成 =      ！！！
*/

public class 比较运算符 {
    public static void main(String args[]){
        int x = 3;
        int y = 4;
        int z = 3;

        System.out.println(x == y);         //x等于y   结果false
        System.out.println(x == z);         //true
        System.out.println((x+y)==(x+z));   //false
        System.out.println("---------------------");
        System.out.println(x != y);         //x不等于y  结果：true
        System.out.println(x > y);          //false
        System.out.println(x >= y);         //false
        System.out.println(x < y);           //true
        System.out.println(x <= y);         //true
        System.out.println("----------------------------------------");
        int a = 10;
        int b = 20;
        boolean flag = (a == b);    //将a==b的结果(false)赋值给flag
        //boolean flag = (a = b);    是错误的！是不兼容的类型！
        //把b赋值给a，则a = 20 是int类型，然而所赋值给的flag是boolean类型，所以报错
        int c = (a = b);    //这样写就是的类型一致，就正确了~
        System.out.println(flag);   //false
        System.out.println(c);  //20
    }
}
