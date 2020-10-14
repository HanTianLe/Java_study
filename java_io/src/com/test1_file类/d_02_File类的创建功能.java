package com.test1_file类;

import java.io.File;
import java.io.IOException;
/**
 *  File类的创建功能：
 *          public boolean createNewFile()：创建文件。 如果存在，就不创建了，并返回 false。
 *                                             如果父文件夹不存在，则创建失败，返回 false。
 *          public boolean mkdir()：创建文件夹。 如果存在，就不创建了，并返回 false。
 *                                            如果父文件夹不存在，则创建失败，返回 false。
 *          public boolean mkdirs():创建文件夹。如果父文件夹不存在，会帮你创建出来。
 *                                           如果存在，就不创建了，并返回 false。
 */
public class d_02_File类的创建功能 {
    public static void main(String[] args) throws IOException {
        //在目录D:\Project\IDEA_project\Java_study\java_io下创建demo文件夹
        File file = new File("D:\\Project\\IDEA_project\\Java_study\\java_io\\demo");
        System.out.println("mkdir："+file.mkdir());//如果目录已存在则创建失败，返回false。


        //在目录D:\Project\IDEA_project\Java_study\java_io下创建a.txt文件
        File file1 = new File("D:\\Project\\IDEA_project\\Java_study\\java_io\\a.txt");
        System.out.println("createNewFile："+file1.createNewFile());


        //在目录D:\Project\IDEA_project\Java_study\java_io\test下创建b.txt文件
//        File file2 = new File("D:\\Project\\IDEA_project\\Java_study\\java_io\\test\\b.txt");
//        System.out.println("createNewFile："+file2.createNewFile());
        //报异常：Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
        //要想在某个目录下创建内容，该目录首先必须存在


        //在目录D:\Project\IDEA_project\Java_study\java_io\demo2\test下创建test文件
        File file3 = new File("D:\\Project\\IDEA_project\\Java_study\\java_io\\demo2\\test");
        System.out.println("mkdirs："+file3.mkdirs());


        File file4 = new File("aa.txt");//如果直接写文件名，则是在项目路径下创建aa.txt文件
        System.out.println("createNewFile："+file4.createNewFile());

        File file5 = new File("aaa\\bbb\\ccc");//如果直接写文件夹名，则是在项目路径下创建文件夹
        System.out.println("mkdirs："+file5.mkdirs());

    }
}

