package com.test6_字符流;

import java.io.*;

/**
 *  需求：把当前项目目录下的 a.txt 内容复制到当前项目目录下的 b.txt中
 *
 *  数据源：
 * 		  a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
 *  目的地：
 * 		  b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
 */
public class d_07_字符流复制文本文件案例1 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "a.txt"));
        // 封装目的地
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "b.txt"));

        // 读写数据
        // 方式1
//        int ch = 0;
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }

        // 方式2
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
            // osw.flush(); //因为有关闭，所以可以不写。
        }

        // 释放资源
        osw.close();
        isr.close();
    }
}
