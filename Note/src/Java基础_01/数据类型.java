package Java基础_01;

/**
 *          【数据类型】
 */
public class 数据类型 {

    public static void main (String[] args){
        System.out.println(100);   //十进制
        System.out.println(0b100); //二进制
        System.out.println(0100);  //八进制
        System.out.println(0x100); //十六进制

        /**
         *  定义变量的格式：数据类型 数据名 = 初始化值;
         */
        //例：定义一个字节变量
        byte b = 10;
        System.out.println(10);
        System.out.println(b);
    }
}

/**
 *         数据类型 强转
 *
 *         格式：
 *              (强转类型)被强转的数
 *         如：
 *         float x = 1.6f;
 *         System.out.println((int)x);
 *
 */
class 数据类型_强转{
    public static void main(String[] args) {
        int x = 10;
        float y = 1.6f;         //单精度赋值后面要加f
        double z = 12.92;       //双精度
        char t = 'A';           //字符型赋值，两边加单引号 ''
        String p = "Assassin";  //字符串赋值，两边加双引号 ""
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        System.out.println(p);
        /** 强转为 int 类型*/
        System.out.println((int)y); //1
        System.out.println((int)z); //12
        System.out.println((int)t); //65  A对应的ASCII码
    }
}




/**
 数据类型：A、基本数据类型
 B、引用数据类型 （类、接口、数值）

 基本数据类型：（4类8种）
 A、整数型             占用字节数
 byte                  1
 short                 2
 int                   4
 long                  8
 B、浮点型
 float                 4
 double                8
 C、字符型
 char                  8
 D、布尔型
 boolean                1
 注意：整数默认是：int类型
 浮点数默认是：double类型

 引用数据类型：
 */


/*
你聪明有人会说你心机重，
你靠的是努力有人会说你运气好，
你说自己天生乐观有人会说你虚假，
有时候，你明明就是一杯白水，却被人硬生生逼成了满肚子憋屈的碳酸饮料。
人一生要遇见太多人，即使有些话字字诛心，也没必要活在他们的眼神里，
只要内心澄明，就永远不用讨好一个不懂你的人。
爱生活，爱Java。
*/
