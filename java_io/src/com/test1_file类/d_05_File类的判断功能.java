package com.test1_file类;

import java.io.File;
import java.io.IOException;
/**
 *  File类的判断功能：
 *          public boolean isDirectory()：判断是否是目录
 *          public boolean isFile()：判断是否是文件
 *          public boolean exists()：判断是否存在
 *          public boolean canRead()：判断是否可读
 *          public boolean canWrite()：判断是否可写
 *          public boolean isHidden()：判断是否是隐藏
 *
 */
public class d_05_File类的判断功能 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File file = new File("d_05.txt");
        file.createNewFile();

        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());
        System.out.println("是否是隐藏：" + file.isHidden());

    }
}
