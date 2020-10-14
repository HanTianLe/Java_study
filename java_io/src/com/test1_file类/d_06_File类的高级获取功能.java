package com.test1_file类;

import java.io.File;

/**
 *  File类的高级获取功能：
 *          public String[] list()：获取指定目录下的所有文件或者文件夹的【名称数组】
 *          public File[] listFiles()：获取指定目录下的所有文件或者文件夹的 【File数组】
 *
 */
public class d_06_File类的高级获取功能 {
    public static void main(String[] args) {
        //指定一个目录
        File file = new File("D:\\Project\\IDEA_project\\Java_study\\java_io");

        // public String[] list()：获取指定目录下的所有文件或者文件夹的名称数组
        String[] list = file.list();
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("=======================================");

        // public File[] listFiles()：获取指定目录下的所有文件或者文件夹的 File 数组
        File[] fileArray = file.listFiles();
        for (File f : fileArray){
            System.out.println(f.getName());
        }

    }
}
