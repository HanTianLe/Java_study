package com.test4_FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *  需求：把e:\\这是视频.mp4复制到当前项目目录下的copy.mp4中
 *
 *  数据源：
 * 		 e:\\这是视频.mp4--读取数据--FileInputStream
 *  目的地：
 * 		 copy.mp4--写出数据--FileOutputStream
 */
public class d_04_字节流复制视频案例 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("e:\\这是视频.mp4");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("copy.mp4");

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
