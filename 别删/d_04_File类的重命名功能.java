package com.test1_file类;

import java.io.File;
import java.io.IOException;
/**
 *  File类的删除功能：
 *          public boolean renameTo(File dest)
 *
 *  如果路径名相同，就是改名。
 *  如果路径名不同，就是改名并剪切。
 *
 *  路径以盘符开始：绝对路径
 *  路径不以盘符开始：相对路径
 *
 */
public class d_04_File类的重命名功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println("createNewFile：" + file.createNewFile());

        //修改text.txt文件为texts.txt
        File newFile = new File("tests.txt");
        System.out.println("renameTo："+file.renameTo(newFile));

        //如果路径名不同，则相当于把文件重命名再剪切到新目录
        File file1 = new File("tests.txt");
        File file2 = new File("D:\\Project\\IDEA_project\\Java_study\\java_io\\test.txt");
        System.out.println("renameTo：" + file1.renameTo(file2));

    }
}
