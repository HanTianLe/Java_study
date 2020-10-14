package Java基础_01.运算符;
/**
 【位运算符】：
 <<      左移        (空位补0，被移除的高位丢弃。)
 >>      右移       （被移位的二进制最高位是 0，右移后，空缺位补0 ; 最高位是1，最高位补1。）
 >>>     无符号右移 （被移位二进制最高位无论是 0 或者是 1，空缺位都用 0 补！！！）
 &       与运算     (同时也是逻辑运算符)
 |       或运算     (同时也是逻辑运算符)
 ^       异或运算   (同时也是逻辑运算符)
 ~       反码

 [注意]：要做位运算，首先要把数据转换为二进制。

 ^ 的特点：一个数据对另一个数据位异或2次，该数据本书身不变。*****
 */
public class 位运算符 {
    public static void main(String[] args) {
        int a= 3;
        int b = 4;

        System.out.println(3 & 4);  //0
        System.out.println(3 | 4);  //7
        System.out.println(3 ^ 4);  //7
        System.out.println(~3);     //-4

/**      分析：因为是位运算，所以我们必须把数据转化为二进制。
 （因为3、4是int类型，所以二进制为32位）
 3的二进制：11
 00000000 00000000 00000000 00000011
 4的二进制：100
 00000000 00000000 00000000 00000100

 【 & 位与运算：有 0 则 0 】
 00000000 00000000 00000000 00000011
 &  00000000 00000000 00000000 00000100
 ---------------------------------------
 00000000 00000000 00000000 00000000
 结果：0

 【 | 位或运算：有 1 则 1 】
 00000000 00000000 00000000 00000011
 |  00000000 00000000 00000000 00000100
 ---------------------------------------
 00000000 00000000 00000000 00000111
 结果：7

 【 ^ 位异或运算： 相同则 0 ，不同则 1  】
 00000000 00000000 00000000 00000011
 ^  00000000 00000000 00000000 00000100
 ---------------------------------------
 00000000 00000000 00000000 00000111
 结果：7

 【 ~ 按位取反运算符：0 变 1 ，1 变 0 】
 ~ 00000000 00000000 00000000 00000011
 ---------------------------------------
 11111111 11111111 11111111 11111100 (补码)
 11111111 11111111 11111111 11111011 (反码)
 10000000 00000000 00000000 00000100 (原码)
 结果：-4
 */
    }
}

class Demo_081{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a ^ b ^ b);  //10
        System.out.println(a ^ b ^ a);  //20
    }
}
/*
        练习：
            实现两个整数变量的交换
 */
class Demo_082 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);

        //方式1：使用第三方变量
/**     int c = a;
 a = b;
 b = c;
 System.out.println("a:"+a+",b:"+b);
 */

        //方式2：用位异或实现
        //左边：a,b,c
        //右边：a ^ b
        a = a ^ b;  //a = a ^ b
        b = a ^ b;  //b = a = a ^ b ^ b
        a = a ^ b;  //a = b = a ^ b ^ a
        System.out.println("a:" + a +",b:" + b);

        //方式3：
//        b = (a+b) - (a = b); //b=30-20;a=20
//        System.out.println("a:" + a +",b:" + b);
    }
}


/*
        <<: 左移----左边最高位丢弃，右边补齐0
        >>: 右移----最高位是0，左边补齐0；最高位是1，左边补齐1
        >>>:无符号右移----无论最高位是0还是1，左边补齐0
 */
class Demo_083{
    public static void main(String[] args) {
        //<< 把<<左边的数据乘以2的移动次幂。
        //3的二进制：11 (因为是位运算，所以我们必须把数据转化为二进制。)
        //    00000000 00000000 00000000 00000011
        //(00)000000 00000000 00000000 0000001100   (左移2位，值变为12)
        System.out.println("3左移2位为："+(3 << 2));   //3*(2^2)=12

        //>> 把>>左边的数据除以2的移动次幂。
        //24的二进制：11000
        //  00000000 00000000 00000000 00011000
        //  0000000000 00000000 00000000 000110(00)   (右移2位，值变为6)
        System.out.println("24右移2位为："+(24 >> 2));  //24/(2^2)=6

        //-24的二进制：10000000 00000000 00000000 00011000   （原码）
        //       反码：11111111 11111111 11111111 11100111
        //       补码：11111111 11111111 11111111 11101000  (负数的移位是移补码！！)
        //  11111111 11111111 11111111 11101000         （右移）
        //  1111111111 11111111 11111111 111010(00)     (移位后的补码)
        //【补码还原成原码！】
        //补码：1111111111 11111111 11111111 111010
        //反码：1111111111 11111111 11111111 111001
        //原码：1000000000 00000000 00000000 000110    (结果为-6)
        System.out.println("-24右移2位为："+(-24 >> 2));  //-24/(2^2)=-6

        //-24的二进制：10000000 00000000 00000000 00011000   （原码）
        //       反码：11111111 11111111 11111111 11100111
        //       补码：11111111 11111111 11111111 11101000  (负数的移位是移补码！！)
        //      因为是无符号右移，所以无论最高位是0或者是1，空缺位都用0补
        // 11111111 11111111 11111111 11101000  （右移）
        // 0011111111 11111111 11111111 111010(00)
        //【补码还原成原码！】
        //补码：0011111111 11111111 11111111 111010    (是个正数，所以原反补码都相同！！)
        //反码：0011111111 11111111 11111111 111010
        //原码：0011111111 11111111 11111111 111010    (转位十进制为：1073741818)
        System.out.println("-24无符号右移2位为："+(-24 >>> 2));  //1073741818
    }
}

/**
 面试题：
 请用最有效率的方式，计算2乘以8的结果。
 2 * 8 =     //不行

 2 << 3      //可以 2*(2^3)
 */
