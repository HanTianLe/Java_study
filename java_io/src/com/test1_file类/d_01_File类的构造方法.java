package com.test1_file类;

import java.io.File;
/**
 * File：文件和目录（文件夹）路径名的抽象表示形式
 *
 * File类的构造方法：
 *      File(String pathname)：根据一个路径得到 File对象。
 *      File(String parent, String child)：根据一个目录和一个子文件 / 目录得到File对象。
 *      File(File parent, String child)：根据一个父 File对象和一个子文件 / 目录得到 File对象。
 *      File(URL uri)：通过将给定的file:URI转换为抽象路径名来创建新的File实例。
 *
 */
public class d_01_File类的构造方法 {
    public static void main(String[] args) {
        String path = "D:/Project/IDEA_project/Java_study/java_io/io.jpg";

        //构建File对象_1
        File file = new File(path);
        // File file2 = new File("D:/Project/IDEA_project/Java_study/java_io/io.jpg"); //（同样原理 ）
        System.out.println(file.length());  //150857

        //构建FIle对象_2
        File file1 = new File("D:/Project/IDEA_project/Java_study/java_io","io.jpg");
        System.out.println(file1.length()); //150857

        //构建FIle对象_3
        File file2 = new File(
                new File("D:/Project/IDEA_project/Java_study/java_io"),"io.jpg");
        System.out.println(file2.length()); //150857

    }
}
