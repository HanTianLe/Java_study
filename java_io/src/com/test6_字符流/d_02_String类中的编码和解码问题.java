package com.test6_字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *  String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 *  byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 *
 *  编码:把看得懂的变成看不懂的
 *      String -- byte[]
 *
 *  解码:把看不懂的变成看得懂的
 *      byte[] -- String
 *
 *  举例：谍战片(发电报，接电报)
 *
 *  码表：小本子
 * 		 字符	数值
 *
 *  要发送一段文字：
 * 		 今天晚上在老地方见
 *
 * 		 发送端：今 -- 数值 -- 二进制 -- 发出去
 * 		 接收端：接收 -- 二进制 -- 十进制 -- 数值 -- 字符 -- 今
 *
 * 		 今天晚上在老地方见
 *
 *  编码问题简单，只要编码解码的格式是一致的。
 */
public class d_02_String类中的编码和解码问题 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        // String -- byte[]
        byte[] bys = s.getBytes(); //[-28, -67, -96, -27, -91, -67]（默认UTF-8，由编译器设置决定）
//        byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
//        byte[] bys = s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]（默认UTF-8，由编译器设置决定）
        System.out.println(Arrays.toString(bys));

        // byte[] -- String
        String ss = new String(bys); // 你好
//        String ss = new String(bys, "GBK"); // 浣犲ソ （乱码）
//        String ss = new String(bys, "UTF-8"); // 你好 （默认UTF-8，由编译器设置决定）
        System.out.println(ss);
    }
}
