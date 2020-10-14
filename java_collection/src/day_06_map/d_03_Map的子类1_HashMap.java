package day_06_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *      Map 的子类_1：HashMap     是基于哈希表的Map接口实现
 *                              哈希表的作用是保证键的唯一性。
 *      HashMap<String,String>
 *      键：String
 *      值：String
 */

public class d_03_Map的子类1_HashMap {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> hashMap = new HashMap<String, String>();
        //添加元素
        hashMap.put("it001","马云");
        hashMap.put("it002","马化腾");
        hashMap.put("it003","乔布斯");
        hashMap.put("it004","比尔盖茨");
        hashMap.put("it005","雷军");
        hashMap.put("it006","王健林");
        hashMap.put("it005","葛军");  //如果键不是第一次存储，就用现在的值把以前的值【替换】掉。
        //遍历
        Set<String> set = hashMap.keySet(); //获取所有键。
        for (String key : set){     //遍历键集合，获取所有键。
            String value = hashMap.get(key);    //根据键去找值。
            System.out.println(key+"--"+value);
            // it004----比尔盖茨
            // it003----乔布斯
            // it006----王健林
            // it005----葛军
            // it002----马化腾
            // it001----马云
        }
        System.out.println("------------------------------");
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            //根据键值对对象获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"----"+value);
            // it004----比尔盖茨
            // it003----乔布斯
            // it006----王健林
            // it005----葛军
            // it002----马化腾
            // it001----马云
        }
        System.out.println("------------------------------");
        /**
         *      HashMap<Integer,String>
         *      键：Integer
         *      值：String
         */
        HashMap<Integer,String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1,"张三");
        hashMap1.put(2,"李四");
        hashMap1.put(3,"王五");
        hashMap1.put(4,"赵六");
        //遍历
        Set<Integer> set1 = hashMap1.keySet();
        for (Integer key : set1){
            String value = hashMap1.get(key);
            System.out.println(key+"---"+value);
            // 1---张三
            // 2---李四
            // 3---王五
            // 4---赵六
        }
        System.out.println("------------------------------");
        /**
         *      HashMap<Integer,Teacher>
         *      键：Integer
         *      值：Teacher
         */
        HashMap<Integer,Teacher> hashMap2 = new HashMap<Integer, Teacher>();
        Teacher t1 = new Teacher("张三",11);
        Teacher t2 = new Teacher("李四",22);
        Teacher t3 = new Teacher("王五",33);
        Teacher t4 = new Teacher("赵六",44);
        hashMap2.put(1,t1);
        hashMap2.put(2,t2);
        hashMap2.put(3,t3);
        hashMap2.put(4,t4);
        //遍历
        Set<Integer> set2 = hashMap2.keySet();
        for (Integer key : set2){
            Teacher value = hashMap2.get(key);
            System.out.println(value.getName()+"---"+value.getAge());
            // 张三---11
            // 李四---22
            // 王五---33
            // 赵六---44
        }
        System.out.println("------------------------------");
        Set<Map.Entry<Integer,Teacher>> entrySet1 = hashMap2.entrySet();
        for (Map.Entry<Integer,Teacher> entry : entrySet1){
            Teacher teacher = entry.getValue();
            System.out.println(teacher.getName()+"---"+teacher.getAge());
            // 张三---11
            // 李四---22
            // 王五---33
            // 赵六---44
        }
        System.out.println("------------------------------");
        /**
         *      HashMap<Teacher,String>
         *      键：Teacher
         *      值：String
         */
        HashMap<Teacher,String> hashMap3 = new HashMap<Teacher, String>();
        hashMap3.put(t1,"一一一");
        hashMap3.put(t2,"二二二");
        hashMap3.put(t3,"三三三");
        hashMap3.put(t4,"四四四");
        //遍历
        Set<Teacher> set3 = hashMap3.keySet();
        for (Teacher teacher : set3){
            String value = hashMap3.get(teacher);
            System.out.println(teacher.getName()+"--"+teacher.getAge()+"--"+value);
            // 王五--33--三三三
            // 李四--22--二二二
            // 张三--11--一一一
            // 赵六--44--四四四
        }
        System.out.println("------------------------------");
        Set<Map.Entry<Teacher,String>> entrySet2 = hashMap3.entrySet();
        for (Map.Entry<Teacher,String> entry : entrySet2){
            Teacher teacher = entry.getKey();
            String value = entry.getValue();
            System.out.println(teacher.getName()+"--"+teacher.getAge()+"--"+value);
            // 王五--33--三三三
            // 李四--22--二二二
            // 张三--11--一一一
            // 赵六--44--四四四
        }
    }
}

class Teacher{
    String name;
    int age;

    public Teacher() {}
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

