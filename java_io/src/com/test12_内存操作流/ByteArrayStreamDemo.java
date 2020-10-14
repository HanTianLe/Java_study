package com.test12_内存操作流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/**
 *  内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 *
 *  字节数组：
 * 		  ByteArrayInputStream      --->读
 * 		  ByteArrayOutputStream     --->写
 *
 *  字符数组：
 * 		  CharArrayReader   --->读
 * 		  CharArrayWriter   --->写
 *
 *  字符串：
 * 		  StringReader      --->读
 * 		  StringWriter      --->写
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        // 写数据
        // ByteArrayOutputStream()
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // 写数据
        for (int x = 0; x < 10; x++) {
            baos.write(("hello" + x).getBytes());
        }

        // 释放资源
        // 通过查看源码我们知道这里什么都没做，所以根本不需要close()
//        baos.close();

        // public byte[] toByteArray()：创建一个新分配的 byte 数组。
        byte[] bys = baos.toByteArray();//转为字节数组

        // 读数据
        // ByteArrayInputStream(byte[] buf)
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);

        int by = 0;
        while ((by = bais.read()) != -1) {
            System.out.print((char) by);
        }

        bais.close();//通过查看源码我们知道这里什么都没做，所以根本不需要close()
    }
}
