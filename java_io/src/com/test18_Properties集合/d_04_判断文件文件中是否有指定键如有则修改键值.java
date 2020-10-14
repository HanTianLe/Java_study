package com.test18_Properties集合;

import java.io.*;
import java.util.Properties;
import java.util.Set;
/**
 * 我有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”
 *
 * 分析：
 * 		A:把文件中的数据加载到集合中
 * 		B:遍历集合，获取得到每一个键
 * 		C:判断键是否有为"lisi"的，如果有就修改其值为"100"
 * 		D:把集合中的数据重新存储到文件中
 */
public class d_04_判断文件文件中是否有指定键如有则修改键值 {
    public static void main(String[] args) throws IOException {
        // 把文件中的数据加载到集合中
        Properties prop = new Properties();
        Reader r = new FileReader("user.txt");
        prop.load(r);
        r.close();

        // 遍历集合，获取得到每一个键
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            // 判断键是否有为"lisi"的，如果有就修改其值为"100"
            if ("lisi".equals(key)) {
                prop.setProperty(key, "100");
                break;
            }
        }

        // 把集合中的数据重新存储到文件中
        Writer w = new FileWriter("user.txt");
        prop.store(w, null);
        w.close();
    }

}
