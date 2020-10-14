package day_06_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/**
 *      案例 2：
 *            HashMap集合嵌套 ArrayList集合
 *
 *      名著：
 *      book    三国演义
 *                      关羽  周瑜
 *              笑傲江湖
 *                      令狐冲   风清扬
 *              神雕侠侣
 *                      杨过  小龙女
 *
 */
public class d_04_案例2 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, ArrayList<String>> book = new HashMap<String, ArrayList<String>>();
        //创建ArrayList集合对象：sg
        ArrayList<String> sg = new ArrayList<String>();
        sg.add("关羽");
        sg.add("周瑜");
        book.put("三国演义",sg);
        //创建ArrayList集合对象：xajh
        ArrayList<String> xajh = new ArrayList<String>();
        xajh.add("令狐冲");
        xajh.add("风清扬");
        book.put("笑傲江湖",xajh);
        //创建ArrayList集合对象：sdxl
        ArrayList<String> sdxl = new ArrayList<String>();
        sdxl.add("杨过");
        sdxl.add("小龙女");
        book.put("神雕侠侣",sdxl);
        //遍历集合
        Set<String> set = book.keySet(); //获取所有键的集合
        for (String key : set){
            System.out.println(key);
            ArrayList<String> arrayList = book.get(key);
            for (String s : arrayList){
                System.out.println("\t"+s);
            }
        }
    }
}
