package com.test2_递归;

import java.io.File;

/*
 * 需求：请大家把 D:\Project\IDEA_project\Java_study\备份 目录下所有的txt结尾的文件的绝对路径给输出在控制台。
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象是否是文件夹
 * 			是：回到B
 * 			否：继续判断是否以.txt结尾
 * 				是：就输出该文件的绝对路径
 * 				否：不搭理它
 */
public class d_03_递归案例 {
    public static void main(String[] args) {
        // 封装目录
        File srcFolder = new File("D:\\Project\\IDEA_project\\Java_study\\备份");
        // 递归功能实现
        getAllJavaFilePaths(srcFolder);
    }

    private static void getAllJavaFilePaths(File srcFolder) {
        // 获取该目录下所有的文件或者文件夹的File数组
        File[] fileArray = srcFolder.listFiles();
        // 遍历该File数组，得到每一个File对象
        for (File file : fileArray) {
            // 判断该File对象是否是文件夹
            if (file.isDirectory()) {
                getAllJavaFilePaths(file);
            } else {
                // 继续判断是否以.txt结尾
                if (file.getName().endsWith(".txt")) {
                    // 就输出该文件的绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
