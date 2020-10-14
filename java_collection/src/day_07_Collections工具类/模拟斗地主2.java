package day_07_Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
/**
 *  模拟斗地主洗牌、发牌并对牌进行排序。
 *
 */

public class 模拟斗地主2 {
    public static void main(String[] args) {
        //创建一个HashMap集合
        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        //创建一个ArrayList集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        //创建花色数组和点数数组
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //从0开始往HashMap里面存储编号，并存储对应的牌；同时往ArrayList里面存储编号。
        int index = 0;
        for (String number : numbers){
            for (String color : colors){
                //花色拼接数组，变成一张牌。
                String poker = color.concat(number);
                hm.put(index,poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        //洗牌（洗的是编号）
        Collections.shuffle(array);

        //发牌（发的也是编号，为了保证收到的编号是（默认排序）的，就创建TreeSet集合接收）
        TreeSet<Integer> HTL = new TreeSet<Integer>();
        TreeSet<Integer> HTX = new TreeSet<Integer>();
        TreeSet<Integer> HTQ = new TreeSet<Integer>();
        TreeSet<Integer> DiPai = new TreeSet<Integer>();

        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3){
                DiPai.add(array.get(x));
            }else if (x % 3 == 0){
                HTL.add(array.get(x));
            }else if (x % 3 == 1){
                HTX.add(array.get(x));
            }else if (x % 3 == 2){
                HTQ.add(array.get(x));
            }
        }

        //看牌（遍历TreeSet集合，获取编号，就创建TreeSet集合接收）
        lookPoker("韩天乐",HTL,hm);
        lookPoker("韩天喜",HTX,hm);
        lookPoker("韩天琪",HTQ,hm);
        lookPoker("底牌",DiPai,hm);
    }

    /**
     * 看牌方法
     * @param name
     * @param ts
     * @param hm
     */
    public static void lookPoker(String name,TreeSet<Integer> ts,
                                 HashMap<Integer,String> hm){
        System.out.print(name+"的牌是：");
        for (Integer key : ts){
            String value = hm.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
