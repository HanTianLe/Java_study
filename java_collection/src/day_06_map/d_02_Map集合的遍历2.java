package day_06_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *      Map 集合的遍历_2：
 *          1、获取所有键值对对象的集合
 *          2、遍历键值对对象的集合，得到每一个键值对对象。
 *          3、根据键值对对象获取键和值。
 *
 */
public class d_02_Map集合的遍历2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();
        map.put("姓名","蔡徐坤");
        map.put("年龄","22");
        map.put("性别","男");
        map.put("爱好","唱跳Rap");
        //遍历
        // Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合。
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String,String> entry : entrySet){
            //根据键值对对象获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--"+value);
            // 姓名--蔡徐坤
            // 爱好--唱跳Rap
            // 年龄--22
            // 性别--男
        }
    }
}
