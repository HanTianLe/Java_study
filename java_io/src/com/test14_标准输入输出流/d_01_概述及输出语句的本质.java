package com.test14_标准输入输出流;

import java.io.PrintStream;
/**
 *  标准输入输出流
 *  System类中的两个成员变量：
 *		    public static final InputStream in ：“标准”输入流。
 * 		    public static final PrintStream out ：“标准”输出流。
 *
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 */
public class d_01_概述及输出语句的本质 {
    public static void main(String[] args) {
        // 有这里的讲解我们就知道了，这个输出语句其本质是IO流操作，把数据输出到控制台。
        System.out.println("hello world");

        // 获取标准输出流对象
        PrintStream ps = System.out;
        ps.println("hello world");

        ps.println();
//        ps.print();//这个方法不存在

//        System.out.println();
//        System.out.print();   //不存在
    }
}
