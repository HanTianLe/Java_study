package com.test6_字符流;

import java.io.*;

/**
 *  InputStreamReader(InputStream is):用默认的编码读取数据
 *  InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 */
public class d_04_转换流InputStreamReader的使用 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt")); // 默认UTF-8，由编译器设置决定

//        InputStreamReader isr = new InputStreamReader(new FileInputStream(
//                "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt"),
//                "GBK"); // 指定GBK    //涓浗（乱码）

//        InputStreamReader isr = new InputStreamReader(new FileInputStream(
//                "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt"),
//                "UTF-8"); // 指定UTF-8

        // 读取数据
        // 一次读取一个字符
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 释放资源
        isr.close();
    }
}
