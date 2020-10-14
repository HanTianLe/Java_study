package Java基础_01.运算符;
/**
       （二）【 + 运算符的用法】
        A、加法
        B、正号
        C、字符串连接符
*/

public class 加号运算符的用法 {
    public static void main(String[] args){
        //加法
        System.out.println(5+2);    //7
        System.out.println('a');    //输出字符a
        System.out.println('a'+1);  //输出字符a对应的ASCII码97再+1的值 （98）
        //正号
        System.out.println(+2); //2
        //字符串连接
        System.out.println("韩"+"天"+"乐");        //韩天乐
        System.out.println("韩"+"天"+"乐"+'a'+1);  //运算规则从左往右:韩天乐a1
        System.out.println('a'+1+"韩"+"天"+"乐");  //值是不同的：98韩天乐
    }

}
