package com.test4_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
/*
 *  一次读取一个字节数组：
 *              int read(byte[] b)
 *
 *  返回值其实是实际读取的字节个数。
 *
 */
public class d_01_FileInputStream读取数据2 {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("fis2.txt");

        // 读取数据
        // 最终版代码
        // 数组的长度一般是1024或者1024的整数倍
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // 释放资源
        fis.close();

    }
}
