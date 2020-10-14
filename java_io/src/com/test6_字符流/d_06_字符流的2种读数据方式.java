package com.test6_字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *  InputStreamReader的方法：
 *      int read():一次读取一个字符
 *      int read(char[] chs):一次读取一个字符数组
 */
public class d_06_字符流的2种读数据方式 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\StringDemo.java"));

        // 一次读取一个字符
//        int ch = 0;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }

        // 一次读取一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        // 释放资源
        isr.close();
    }
}
