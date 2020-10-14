package day_06_map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 *      LinkedHashMap：
 *                     是 Map接口的哈希表和链接表实现，具有可预知的迭代顺序。（HashMap子类）
 *      哈希表保证键的唯一性。
 *      链表保证键盘的有序。（存储和取出的顺序一致）
 *
 */

public class d_03_Map的子类2_LinkedHashMap {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("1","hello");
        linkedHashMap.put("2","world");
        linkedHashMap.put("3","Java");
        linkedHashMap.put("4","guys");
        //存储所有键
        Set<String> set = linkedHashMap.keySet();
        for (String key : set){
            String value = linkedHashMap.get(key);//根据键取出值
            System.out.println(key+"---"+value);
        }
        // 1---hello
        // 2---world
        // 3---Java
        // 4---guys
    }
}
