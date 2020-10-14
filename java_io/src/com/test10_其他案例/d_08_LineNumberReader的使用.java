package com.test10_其他案例;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/**
 *  LineNumberReader：
 *                  跟踪行号的缓冲字符输入流。（其父类为：BufferedReader）
 *
 *  方法：
 *      String readLine()：读取文本行
 *      int getLineNumber()：获得当前行号。
 *      void setLineNumber(int lineNumber)：设置当前行号。
 *
 */
public class d_08_LineNumberReader的使用 {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("a.txt"));

        //设置行号从10开始
        lnr.setLineNumber(10);

        String line = null;
        while ((line = lnr.readLine()) != null){
            System.out.println(lnr.getLineNumber()+"："+line);
        }
        lnr.close();
    }
}
