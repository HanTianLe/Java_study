package day_06_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *      案例 3：
 *            ArrayList集合嵌套 HashMap集合
 *
 *      country
 *      魏国
 *              曹操---荀彧
 *      蜀国
 *              刘备---诸葛亮
 *      吴国
 *              孙权---周瑜
 *
 */
public class d_04_案例3 {
    public static void main(String[] args) {
        //创建ArrayList集合对象：country
        ArrayList<HashMap<String,String>> country = new ArrayList<HashMap<String, String>>();
        //创建HashMap集合对象：wei
        HashMap<String,String> wei = new HashMap<String, String>();
        wei.put("曹操","荀彧");
        country.add(wei);
        //创建HashMap集合对象：shu
        HashMap<String,String> shu = new HashMap<String, String>();
        shu.put("刘备","诸葛亮");
        country.add(shu);
        //创建HashMap集合对象：wu
        HashMap<String,String> wu = new HashMap<String, String>();
        wu.put("孙权","周瑜");
        country.add(wu);
        //遍历
        for (HashMap<String,String> hm : country){
            Set<String> set = hm.keySet();
            for (String key : set){
                String value = hm.get(key);
                System.out.println(key+"---"+value);
            }
        }
        // 曹操---荀彧
        // 刘备---诸葛亮
        // 孙权---周瑜
    }
}
