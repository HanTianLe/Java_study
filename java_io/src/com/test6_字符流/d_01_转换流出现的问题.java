package com.test6_字符流;

import java.io.FileInputStream;
import java.io.IOException;
/*
 * 字节流读取中文可能出现的小问题：
 */
public class d_01_转换流出现的问题 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\a.txt");

        //读取数据
        //一次读取一个字节会出现中文乱码的问题
//        int by = 0;
//        while ((by = fis.read()) != -1) {
//            System.out.print((char) by);
//        }

        //一次读取一个字节数组则不会出现乱码问题
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        //释放资源
        fis.close();
    }
}
