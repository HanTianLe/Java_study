package Java基础_01.运算符;

/**
 【逻辑运算符】：
 &  与    (有 false 则 false)
 |  或    (有 true 则 true)
 ^  异或  (相同为 false ,不同为 true)
 ！ 非    (取反)
 && 双与   [1]其运算方式与 & (单&)一样。
 [2*]但 && 有一个短路的作用。
 所以只要 && 左边是 false，则不管右边是 false 还是 true，
 其结果都是 false。 而且右边的式子都不执行！！
 而当左边是true时，则右边需要执行！！

 || 双或   [1]其运算方式与 | (单|)一样。
 [2*]但 || 有一个短路的作用。
 所以只要 || 左边是 true，则不管右边是 false 还是 true，
 其结果都是 true。 而且右边的式子都不执行！！
 而当左边是false时，则右边需要执行！！

 [特点]：
 一般用于连接boolean类型的表达式或值。
 表达式：就是用运算符把常量或者变量连接起来的符合Java语法的式子。
 如：算数表达式：a +b
 比较表达式：a == b
 [结论]：
 & 逻辑与：有 false 则 false
 | 逻辑或：有 true 则 true
 ^ 逻辑异或：相同为 false 不同为 true
 ! 逻辑非：非 false 则 true，非 true 则 false  （取反的意思）
 （偶数个 ! 则不改变本身）
 （奇数个 ! 则跟有一个效果一样:取反）
 */
public class 逻辑运算符 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        //逻辑与
        System.out.println("1、逻辑与:");
        System.out.println((a > b) & (a > c));   //false & false   逻辑与的结果为：false
        System.out.println((a > b) & (a < c));   //false & true   逻辑与的结果为：false
        System.out.println((a < b) & (a > c));   //true & false   逻辑与的结果为：false
        System.out.println((a < b) & (a < c));   //true & true   逻辑与的结果为：true
        System.out.println("-------------------------------");
        //逻辑或
        System.out.println("2、逻辑或:");
        System.out.println((a > b) | (a > c));   //false | false   逻辑或的结果为：false
        System.out.println((a > b) | (a < c));   //false | true   逻辑或的结果为：true
        System.out.println((a < b) | (a > c));   //true | false   逻辑或的结果为：true
        System.out.println((a < b) | (a < c));   //true | true   逻辑或的结果为：true
        System.out.println("--------------------------------------------------");
        //逻辑异或
        System.out.println("3、逻辑异或:");
        System.out.println((a > b) ^ (a > c));   //false ^ false   逻辑异或的结果为：false
        System.out.println((a > b) ^ (a < c));   //false ^ true   逻辑异或的结果为：true
        System.out.println((a < b) ^ (a > c));   //true ^ false   逻辑异或的结果为：true
        System.out.println((a < b) ^ (a < c));   //true ^ true   逻辑异或的结果为：false
        System.out.println("------------------------------------------------------------");
        //逻辑非
        System.out.println("4、逻辑非:");
        System.out.println( ! (a > b));   //!false = true
        System.out.println( ! (a < b));   //!true = false
        System.out.println( !! (a > b));   //!!false = false
        System.out.println( !!! (a > b));   //!!!false = true
    }
}

/*
        && 与 & 的区别。同理 || 与 | 的区别
*/

class shuangyu{
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        //双与
        System.out.println("1、双与:");
        System.out.println((a > b) && (a > c));   //false && false = false
        System.out.println((a > b) && (a < c));   //false && true = false
        System.out.println((a < b) && (a > c));   //true && false = false
        System.out.println((a < b) && (a < c));   //true && true = true
        System.out.println("-------------------------------");

        //双或
        System.out.println("2、双与:");
        System.out.println((a > b) || (a > c));   //false || false = false
        System.out.println((a > b) || (a < c));   //false || true = true
        System.out.println((a < b) || (a > c));   //true || false = true
        System.out.println((a < b) || (a < c));   //true || true = true
        System.out.println("-------------------------------");

        int x = 3;
        int y = 4;
        boolean b0 = (x++ == 3 & y++ ==4);  // x与y都是先分别与3、4相比，
        // 然后再分别+1变成4、5
        // true & true = true
        System.out.println("x:"+x);     // x:4
        System.out.println("y:"+y);     // y:5
        System.out.println(b0);         // true
        System.out.println("-------------------------------");

        int x1 = 3;
        int y1 = 4;
        boolean b1 = (++x1 == 3 && y1++ ==4); // x1是先+1再与4相比得 false，
        // 因为 && 具有短路的作用;
        // 所以后面的 y1++ ==4 直接跳过不执行，y1 值还是4
        System.out.println("x1:"+x1);    // x1:4
        System.out.println("y1:"+y1);    // y1:4
        System.out.println(b1);          // false
    }
}

