package Java基础_01.运算符;
/**
 【算数运算符】：
 +、-、*、/、%、++、--

 （一）【++,--运算符的使用】
 [作用]：对变量进行自增1或者自减1。
 1、单独使用：
 放在操作数的前面和后面效果一样。（这种方法比较常见）
 2、参与运算使用：
 放在操作数的前面，先自增或者自减，然后再参与运算。
 放在操作数的后面，先参与运算，再自增或者自减。
 */
public class 算数运算符 {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int a1 = 3;
        int b1 = 4;

        int c = a++;
        int d = b--;

        int e = ++a1;
        int f = --b1;
        System.out.println("a:"+a); //4
        System.out.println("b:"+b); //3
        System.out.println("c:"+c); //3
        System.out.println("d:"+d); //4
        System.out.println("e:"+e); //4
        System.out.println("f:"+f); //3
    }

}

/**
 ++,--练习题：

 第一题：
 int a = 10;
 int b = 10;
 int c = 10;
 a = b++;
 c = --a;
 b = ++a;
 a = c--;
 请分别计算出a,b,c的值。

 第二题：
 int x = 4;
 int y = (x++)+(++x)+(x*10);
 请分别计算出x,y的值。
 */
class Zuoye1{
    public static void main(String args[]){
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;    //a = 10;b = 11;c = 10
        c = --a;    //a = 9 ;b = 11;c = 9
        b = ++a;    //a = 10;b = 10;c = 9
        a = c--;    //a = 9 ;b = 10;c = 8

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}

class Zuoye2{
    public static void main(String args[]){
        int x = 4;
        int y = (x++)+(++x)+(x*10);
        //y = 4+6+(6*10)
        //x = 5,6,6
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
