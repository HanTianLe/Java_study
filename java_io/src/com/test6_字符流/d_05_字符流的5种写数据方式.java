package com.test6_字符流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  OutputStreamWriter的方法：
 *      public void write(int c):写一个字符。
 *      public void write(char[] cbuf):写一个字符数组。
 *      public void write(char[] cbuf,int off,int len):写一个字符数组的一部分。
 *      public void write(String str):写一个字符串。
 *      public void write(String str,int off,int len):写一个字符串的一部分。
 *
 *  面试题：close()和flush()的区别？
 *      A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 *      B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */
public class d_05_字符流的5种写数据方式 {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("D:\\Project\\IDEA_project\\Java_study\\java_io\\src\\com\\test6_字符流\\osw2.txt"));
        //写数据
        /** public void write(String str):写一个字符串。*/
        osw.write("中国");
        /** public void write(char c):写一个字符。*/
        osw.write('a');
        /** public void write(int c):写一个字符。*/
        osw.write(98);//b
        /** public void write(char[] cbuf):写一个字符数组。*/
        char[] chs = {'c','d','e','f'};
        osw.write(chs);
        /** public void write(char[] cbuf,int off,int len):写一个字符数组的一部分。*/
        char[] chars = {'f','g','h','i'};
        osw.write(chars,1,3);   //ghi   （从1开始取3个）
        /** public void write(String str,int off,int len):写一个字符串的一部分。*/
        osw.write("卧槽牛逼",2,2);//牛逼  （从1开始取2个）
        //为什么数据没有写进去呢？
        //原因是：字符 = 2 字节
        //文件中数据存储的基本单位是字节。
        /** void flush()：刷新该流的缓冲。*/
        osw.flush();
        /** void close()：释放资源；关闭此流，但要先刷新它。*/
        osw.close();
    }
}
