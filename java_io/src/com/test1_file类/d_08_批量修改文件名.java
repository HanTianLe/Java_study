package com.test1_file类;

import java.io.File;

/**
 * 需求：把 D:\Project\IDEA_project\Java_study\file
 * 		00?_介绍.avi
 *
 * 思路：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:拼接一个新的名称，然后重命名即可。
 */
public class d_08_批量修改文件名 {
    public static void main(String[] args) {
        //封装目录
        File file = new File("D:\\Project\\IDEA_project\\Java_study\\file");
        //获取该目录下所有的文件的File数组
        File[] fileArray = file.listFiles();

        //遍历该File数组，得到每一个File对象
        for (File file1 : fileArray){
            //System.out.println(file1.getName());
            // 原来都是这样类型：
            // D:\Project\IDEA_project\Java_study\file\三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.txt
            // 改后：
            // D:\Project\IDEA_project\Java_study\file\001_桃园三结义.txt
            String name = file1.getName();//三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.txt

            int index = name.indexOf("_");//返回指定字符在此字符串中第一次出现处的索引。
            // 从指定位置开始到指定位置结束截取字符串。 (包左不包右！)
            String numberString = name.substring(index + 1, index + 4);
            //System.out.println(numberString);

//            int startIndex = name.lastIndexOf('_');
//            int endIndex = name.lastIndexOf('.');
//            String nameString = name.substring(startIndex, endIndex);
            //System.out.println(nameString);

            int endIndex = name.lastIndexOf('_');//返回指定子字符串在此字符串中最右边出现处的索引。
            String nameString = name.substring(endIndex);//从指定位置开始截取字符串，默认到末尾。

            String newName = numberString.concat("_").concat(nameString);//将指定字符串连接到此字符串的结尾。
            //System.out.println(newName);

            File newFile = new File(file,newName);
            //System.out.println(newFile.getAbsolutePath());

            // 重命名
            file1.renameTo(newFile);

        }
    }
}
