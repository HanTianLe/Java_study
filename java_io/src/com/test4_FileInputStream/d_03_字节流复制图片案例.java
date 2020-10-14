package com.test4_FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  需求：把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 *
 *  数据源：
 * 		 e:\\林青霞.jpg	--读取数据--FileInputStream
 *  目的地：
 * 		 mn.jpg--写出数据--FileOutputStream
 */
/**
 *  使用：
 *      int read(byte[] b)：一次读取一个字节数组。
 *  也可以。
 */
public class d_03_字节流复制图片案例 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("D:\\Project\\IDEA_project\\Java_study\\java_io\\io.jpg");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("mn.jpg");

        // 复制数据
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        // 释放资源
        fos.close();
        fis.close();
    }
}
