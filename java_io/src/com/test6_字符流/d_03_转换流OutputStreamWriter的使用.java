package com.test6_字符流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 *  OutputStreamWriter(OutputStream out)：根据默认编码把字节流的数据转换为字符流。
 *  OutputStreamWriter(OutputStream out,String charsetName)：根据指定编码把字节流数据转换为字符流。
 *  把 字节流 转换为 字符流。
 *  字符流 = 字节流 +编码表。
 */
public class d_03_转换流OutputStreamWriter的使用 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt")); // 默认UTF-8，由编译器设置决定

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
//        "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt"),
//                "GBK"); // 指定GBK

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
//                "D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw.txt"),
//                "UTF-8"); // 指定UTF-8

        // 写数据
        osw.write("中国");

        // 释放资源
        osw.close();
    }
}
