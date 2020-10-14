package com.test13_打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *  1:可以操作任意类型的数据。
 * 		    print()
 * 		    println()
 *  2:启动自动刷新
 * 		    PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
 * 		    还是应该调用println()的方法才可以
 * 		    这个时候不仅仅自动刷新了，还实现了数据的换行。
 *
 * 		    println()
 *		    其实等价于于：
 *		            bw.write();
 *		            bw.newLine();
 *		            bw.flush();
 */
public class d_02_PrintWriter实现自动刷新和换行 {
    public static void main(String[] args) throws IOException {
        // 创建打印流对象
//        PrintWriter pw = new PrintWriter("打印2.txt");
//        pw.print(true);
//        pw.print(100);
//        pw.print("hello");
        // write()是搞不定的，怎么办呢?
        // 我们就应该看看它的新方法

        PrintWriter pw = new PrintWriter(new FileWriter("打印2.txt"), true);
        pw.println("hello");
        pw.println(true);
        pw.println(100);

        pw.close();
    }
}
