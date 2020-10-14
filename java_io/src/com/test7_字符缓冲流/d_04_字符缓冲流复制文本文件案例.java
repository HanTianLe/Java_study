package com.test7_字符缓冲流;

import java.io.*;
/**
 *  需求：把当前项目目录下的 a.txt内容复制到当前项目目录下的 b.txt中
 *
 *  数据源：
 * 		 a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader -- BufferedReader
 *  目的地：
 * 		 b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class d_04_字符缓冲流复制文本文件案例 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // 封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        // 两种方式其中的一种：一次读写一个字符数组
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
            bw.flush();
        }

        // 释放资源
        bw.close();
        br.close();

    }
}
