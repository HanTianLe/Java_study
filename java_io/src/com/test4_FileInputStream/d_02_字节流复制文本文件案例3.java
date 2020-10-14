package com.test4_FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *  需求：把D:\Project\IDEA_project\Java_study\a.txt
 *       内容复制到 D:\Project\IDEA_project\Java_study\b.txt 中
 *
 *  数据源：
 * 		 绝对路径：a.txt	--	读取数据	--	FileInputStream
 *  目的地：
 * 		 绝对路径：b.txt	--	写出数据	--	FileOutputStream
 */
/**
 *  使用：
 *      int read(byte[] b)：一次读取一个字节数组。
 */
public class d_02_字节流复制文本文件案例3 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");

        // 复制数据
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        // 释放资源
        fos.close();
        fis.close();
    }
}
