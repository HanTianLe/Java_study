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
/**
 *  使用：
 *      int read(byte[] b)：一次读取一个字节数组。
 */
public class d_04_字节流复制视频案例2 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("e:\\这是视频.mp4");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("copy.mp4");

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
