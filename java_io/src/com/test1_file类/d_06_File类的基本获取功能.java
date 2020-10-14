package com.test1_file类;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *  File类的基本获取功能：
 *          public string getAbsolutePath()：获取绝对路径。
 *          public String getPath()：获取相对路径。
 *          public String getName()：获取名称。
 *          public long length()：获取长度。字节数。
 *          public long lastModified()：获取最后一次的修改时间，毫秒值。
 *
 */
public class d_06_File类的基本获取功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("d_06.txt");
        file.createNewFile();

        System.out.println("获取绝对路径：" + file.getAbsolutePath());
        System.out.println("获取相对路径：" + file.getPath());
        System.out.println("获取名称：" + file.getName());
        System.out.println("获取长度：" + file.length());
        System.out.println("获取最后一次修改时间：" + file.lastModified()); // 1602125077986

        Date d = new Date(1602125077986L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(d);
        System.out.println(s);

    }
}
