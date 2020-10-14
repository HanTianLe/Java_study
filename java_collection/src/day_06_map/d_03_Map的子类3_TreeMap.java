package day_06_map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 *    TreeMap：
 *            键是红黑树结构，可以保证键的排序和唯一性。
 *
 */
public class d_03_Map的子类3_TreeMap {
    public static void main(String[] args) {
        //创建集合对象
        TreeMap<String,String> treeMap = new TreeMap<String, String>();
        treeMap.put("hello","你好");
        treeMap.put("world","世界");
        treeMap.put("java","Java");
        //遍历
        Set<String> set = treeMap.keySet();
        for (String key : set){
            String value = treeMap.get(key);
            System.out.println(key+"---"+value);
            // hello---你好
            // java---Java
            // world---世界
        }
        System.out.println("-----------------------------------");



        // TreeMap<Teacher,String> treeMap1 = new TreeMap<Teacher, String>();   //没有说明排序方式
        TreeMap<Teacher,String> treeMap1 = new TreeMap<Teacher, String>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {    //根据年龄（升序）排序
                //主要条件
                int num = t1.getAge() - t2.getAge();
                //次要条件
                int num2 = num == 0 ? t1.getName().compareTo(t2.getName()) : num;
                return num2;
            }
        });
        Teacher t1 = new Teacher("张三",21);
        Teacher t2 = new Teacher("李四",22);
        Teacher t3 = new Teacher("王五",23);
        treeMap1.put(t1,"一");
        treeMap1.put(t2,"二");
        treeMap1.put(t3,"三");
        Set<Teacher> set1 = treeMap1.keySet();
        for (Teacher teacher : set1){
            String value = treeMap1.get(teacher);
            System.out.println(teacher.getName()+"--"+teacher.getAge()+"--"+value);
            // 张三--21--一
            // 李四--22--二
            // 王五--23--三
        }
        // cannot be cast to java.lang.Comparable
        // 出现该错误是没有说明排序方式。
        // 所以上面在创建集合时要说明排序规则。
    }
}
