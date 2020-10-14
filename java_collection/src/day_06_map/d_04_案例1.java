package day_06_map;

import java.util.HashMap;
import java.util.Set;

/**
 *  案例 1：
 *          HashMap集合嵌套 HashMap集合
 *
 *   班级：
 class_Map     学生
 *           studentMap    姓名  年龄
 *                         张三   11
 *                         李四   22
 *              老师
 *           teacherMap    姓名  年龄
 *                         王五   33
 *                         赵六   44
 *
 */
public class d_04_案例1 {
    public static void main(String[] args) {
        //创建 班级集合
        HashMap<String,HashMap<String,Integer>> class_Map = new HashMap<String, HashMap<String, Integer>>();
        //创建 学生集合对象
        HashMap<String,Integer> studentMap = new HashMap<String, Integer>();
        studentMap.put("张三",11);
        studentMap.put("李四",22);
        //把 学生集合 添加到班级集合
        class_Map.put("学生",studentMap);
        // 创建 老师集合对象
        HashMap<String,Integer> teacherMap = new HashMap<String, Integer>();
        teacherMap.put("王五",33);
        teacherMap.put("赵六",44);
        //把 老师集合 添加到班级集合
        class_Map.put("老师",teacherMap);

        //遍历集合（取出班级key集合）
        Set<String> classMap_keySet = class_Map.keySet();
        for (String bj_key : classMap_keySet){
            System.out.println(bj_key); //输出是老师还是学生。
            //根据班级key取出（班级Value）
            HashMap<String,Integer> class_Value = class_Map.get(bj_key);
            //取出（班级Value）里面的（key集合）
            Set<String> ValueSet = class_Value.keySet();
            for (String name : ValueSet){
                Integer age = class_Value.get(name);
                System.out.println("\t"+name+"---"+age);
            }
            // 学生
            //	    李四---22
            //	    张三---11
            // 老师
            //	    王五---33
            //	    赵六---44
        }
    }
}
