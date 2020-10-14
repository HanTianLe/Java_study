package com.test4_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 *      A:创建字节输入流对象
 *      B:调用read()方法读取数据，并把数据显示在控制台
 *      C:释放资源
 *
 * 读取数据的方式：
 *      A:int read()：一次读取一个字节。  返回下一个数据字节，如果已到达文件末尾，则返回-1。
 *      B:int read(byte[] b)：一次读取一个字节数组。
 *
 */
public class d_01_FileInputStream读取数据 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");

        //调用read()方法读取数据，并把数据显示在控制台
        //第一次读取
        int by = fis.read();
        System.out.println(by);
        System.out.println((char) by);
        //第二次读取
        by = fis.read();
        System.out.println(by);
        System.out.println((char) by);
        //第三次读取
        by = fis.read();
        System.out.println(by);
        System.out.println((char) by);

        //我们发现代码的重复度很高，所以我们要用循环改进。而用循环，最麻烦的事情是如何控制循环判断条件呢？
        //第四次读取
        by = fis.read();
        System.out.println(by);
        //第五次读取
        by = fis.read();
        System.out.println(by);

        System.out.println("===================================");
        //通过测试，我们知道如果你读取的数据是-1，就说明已经读取到文件的末尾了

        //释放资源
        fis.close();


        //用循环改进
        FileInputStream fis1 = new FileInputStream("fis.txt");
        int by1 = fis1.read();
        while (by1 != -1) {
            System.out.print((char) by1);
            by1 = fis1.read();
        }
        //释放资源
        fis1.close();
        System.out.println();
        System.out.println("===================================");


        // 最终版代码
        FileInputStream fis2 = new FileInputStream("fis.txt");
        int by2 = 0;
        // 读取，赋值，判断
        while ((by2 = fis2.read()) != -1) {
            System.out.print((char) by2);
        }
        // 释放资源
        fis2.close();

    }
}
