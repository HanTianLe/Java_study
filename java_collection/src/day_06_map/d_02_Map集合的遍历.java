package day_06_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *    Map 集合的遍历_1：根据键去找值
 *          1、获取所有的键。
 *          2、遍历键的集合，获取得到每一个键。
 *          3、根据键去找值。
 *
 */
public class d_02_Map集合的遍历 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();
        map.put("姓名","蔡徐坤");
        map.put("年龄","22");
        map.put("性别","男");
        map.put("爱好","唱跳Rap");
        //遍历
        //获取所有键
        Set<String> set = map.keySet();
        for (String key : set){
            //根据键去找值
            String value = map.get(key);
            System.out.println(key+"--"+value);
            // 姓名--蔡徐坤
            // 爱好--唱跳Rap
            // 年龄--22
            // 性别--男
        }
    }
}
