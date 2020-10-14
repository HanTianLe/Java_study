package com.test10_其他案例;

import java.io.*;
/**
 * 需求：复制单极文件夹
 *
 * 数据源：备份
 * 目的地：备份2
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文本的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 */
public class d_04_复制单极文件夹 {
    public static void main(String[] args) throws IOException {
        // 封装目录
        File srcFolder = new File("备份");
        // 封装目的地
        File destFolder = new File("备份2");
        // 如果目的地文件夹不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // 获取该目录下的所有文本的File数组
        File[] fileArray = srcFolder.listFiles();

        // 遍历该File数组，得到每一个File对象
        for (File file : fileArray) {
            String name = file.getName(); // 三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.txt
            File newFile = new File(destFolder, name); // 备份2\\三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.txt
            copyFile(file, newFile);
        }
    }

    private static void copyFile(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
