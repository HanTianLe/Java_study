package D_枚举;

import D_枚举.枚举类.Color;
import D_枚举.枚举类.Season;
import D_枚举.枚举类.Weekday;

/*
 *  Java 中的每一个枚举都继承自 java.lang.Enum 类。
 *  当定义一个枚举类型时，每一个枚举类型成员都可以看作是 Enum 类的实例，
 *  这些枚举成员默认都被 final、public, static 修饰，当使用枚举类型成员时，直接使用枚举名称调用成员即可。
 *  所有枚举实例都可以调用 Enum 类的方法。
 *
 * 枚举类：
 *  1、enum和class、interface的地位一样
 *  2、使用enum定义的枚举类默认继承了java.lang.Enum，而不是继承Object类。枚举类可以实现一个或多个接口。
 *  3、枚举类的所有实例都必须放在第一行展示，不需使用 new 关键字，不需显式调用构造器。自动添加public static final修饰。
 *  4、使用enum定义、非抽象的枚举类默认使用final修饰，不可以被继承。
 *  5、枚举类的构造器只能是私有的。
 *
 *  枚举类内也可以定义属性和方法，可以是静态的和非静态的。
 *
 *  Enum类的常用方法：
 *      values()：   以[数组形式]返回枚举类型的所有成员
 *      valueOf()：  将普通字符串转换为[枚举实例]
 *
 * 枚举变量的方法：
 *      toString()： 该方法直接返回枚举定义枚举变量的字符串，比如MON就返回【”MON”】。
 *      ordinal()：  默认情况下，枚举类会给所有的枚举变量一个默认的次序，该次序从0开始，类似于数组的下标。
 *                   而ordinal()方法就是获取这个次序（或者说下标）
 *      compareTo()：该方法用来比较两个枚举变量的”大小”，实际上比较的是两个枚举变量的次序，
 *                   返回两个次序相减后的结果，如果为负数，就证明变量1”小于”变量2。
 *                   变量1.compareTo(变量2) ---> 返回【变量1.ordinal() - 变量2.ordinal()】
 *
 */
public class d_02_枚举类的常用方法 {
    public static void main(String[] args) {

        for (int i = 0; i < Color.values().length; i++){
            System.out.println("枚举成员："+Color.values()[i]);
        }

        System.out.println(Weekday.valueOf("FRI")); //FRI

        System.out.println(Weekday.MON.toString()); //MON
        System.out.println(Weekday.SUN.ordinal());  //6
        System.out.println(Weekday.TUS.compareTo(Weekday.MON)); //1
        System.out.println(Weekday.TUS.ordinal()-Weekday.MON.ordinal()); //1

        System.out.println(Season.WINTER.getName());
        System.out.println("==================================================");
        System.out.println(Weekday.MON.getValue()+"--"+Weekday.MON.getLabel());
        System.out.println(Weekday.TUS.getValue()+"--"+Weekday.TUS.getLabel());
        System.out.println(Weekday.WED.getValue()+"--"+Weekday.WED.getLabel());
        System.out.println(Weekday.THU.getValue()+"--"+Weekday.THU.getLabel());
        System.out.println(Weekday.FRI.getValue()+"--"+Weekday.FRI.getLabel());
        System.out.println(Weekday.SAT.getValue()+"--"+Weekday.SAT.getLabel());
        System.out.println(Weekday.SUN.getValue()+"--"+Weekday.SUN.getLabel());
    }
}
