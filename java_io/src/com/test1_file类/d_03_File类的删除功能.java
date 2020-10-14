package com.test1_file类;

import java.io.File;
import java.io.IOException;
/**
 *  File类的删除功能：
 *          public boolean delete()
 *
 *  注意：
 *      A、如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 *      B、Java中的删除不走回收站。
 *      C、要删除一个文件夹，请注意该文件夹内不能包含文件或文件夹。
 *
 */
public class d_03_File类的删除功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("b.txt"); //如果直接写文件名，则是在项目路径下创建文件
        System.out.println("createNewFile："+file.createNewFile());

        File file1 = new File("aaa/bbb/ccc"); //如果直接写文件交名，则是在项目路径下创建文件夹
        System.out.println("mkdirs："+file1.mkdirs());


        //删除b.txt这个文件
        File file2 = new File("b.txt"); //如果直接写文件名，则是在项目路径下创建文件
        System.out.println("delete："+file2.delete());

        //删除ccc文件夹
        File file3 = new File("aaa\\bbb\\ccc");
        System.out.println("delete："+file3.delete());//这边是删除ccc文件夹

        //删除bbb文件夹
        File file4 = new File("aaa\\bbb");
        System.out.println("delete："+file4.delete());//这边是删除bbb文件夹

        //删除aaa文件夹
        File file5 = new File("aaa");
        System.out.println("delete："+file5.delete());//这边是删除aaa文件夹

    }
}
