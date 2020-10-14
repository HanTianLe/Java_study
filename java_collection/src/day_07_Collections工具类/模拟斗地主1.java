package day_07_Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
/**
 *  模拟斗地主洗牌、发牌
 */

public class 模拟斗地主1 {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<String>();
        //定义一个花色数组
        String[] colors = {"♠","♥","♣","♦"};
        //定义一个点数数组
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //装牌
        for (String color :colors){
            for (String number : numbers){
                array.add(color.concat(number)); //concat()：字符串的拼接
            }
        }
        array.add("大王");
        array.add("小王");
        //洗牌
        Collections.shuffle(array);

        //System.out.println("array："+array);

        //发牌
        ArrayList<String> person1 = new ArrayList<String>();
        ArrayList<String> person2 = new ArrayList<String>();
        ArrayList<String> person3 = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();

        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3){
                diPai.add(array.get(x));
            }else if (x % 3 == 0){
                person1.add(array.get(x));
            }else if (x % 3 == 1){
                person2.add(array.get(x));
            }else if (x % 3 == 2){
                person3.add(array.get(x));
            }
        }
        //看牌
        lookPoker("玩家1",person1);
        lookPoker("玩家2",person2);
        lookPoker("玩家3",person3);
        lookPoker("底牌",diPai);
    }

    /**
     * 看牌方法
     * @param name
     * @param array
     */
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for (String s : array){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
