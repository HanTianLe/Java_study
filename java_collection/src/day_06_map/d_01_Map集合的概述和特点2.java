package day_06_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *      4、获取功能
 *           Set<Map.Entry<K,V>> entrySet()：返回的是【键值对对象】的集合。
 *           V get(Object key)：根据键获取值。
 *           Set<K> keySet()：获取集合中所有键的集合。
 *           Collection<V> values()：获取集合中所有值的集合。
 *
 */
public class d_01_Map集合的概述和特点2 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<String, String>();
        map.put("姓名","张三");
        map.put("性别","男");
        map.put("年龄","21");
        // V get(Object key)：根据键获取值。
        System.out.println(map.get("姓名"));  //张三
        System.out.println(map.get("年龄"));  //21
        System.out.println(map.get("爱好"));  //null
        System.out.println("---------------------");
        // Set<K> keySet()：获取集合中所有键的集合。
        Set<String> set = map.keySet();
        for (String key : set){
            System.out.println(key);    //姓名 年龄 性别
        }
        System.out.println("---------------------");
        // Collection<V> values()：获取集合中所有值的集合。
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println(value);  //张三 21 男
        }

    }
}
