package D_枚举;

import D_枚举.枚举类.Color;
/*
 *  【枚举】是一个被命名的整型常数的集合，用于声明一组带标识符的常数。
 *  枚举在日常生活中很常见，例如一个人的性别只能是 “男” 或者 “女”，一周的星期只能是 7 天中的一个等。
 *  类似这种当一个变量有几种固定可能的取值时，就可以将它定义为枚举类型。
 *
 *  在 JDK 1.5 之前没有枚举类型，那时候一般用接口常量来替代。
 *  而使用 Java 枚举类型 enum 可以更贴近地表示这种常量。
 *
 *
 *  声明枚举：
 *      声明枚举时必须使用 enum 关键字，
 *      然后定义枚举的名称、可访问性、基础类型和成员等。枚举声明的语法如下：
 *
 *      enum-modifiers enum enumname:enum-base{
 *          enum-body,
 *      }
 *      其中，
 *      enum-modifiers 表示枚举的修饰符主要包括 public、private 和 internal。
 *      enumname 表示声明的枚举名称。
 *      enum-base 表示基础类型。
 *      enum-body 表示枚举的成员，它是枚举类型的命名常数。
 *
 *      注意：
 *      任意两个枚举成员不能具有相同的名称，
 *      且它的常数值必须在该枚举的【基础类型】的范围之内，
 *      多个枚举成员之间使用逗号分隔。
 *      如果没有显式地声明【基础类型】的枚举，那么意味着它所对应的基础类型是 int。
 *
 * 枚举类：
 * enum和class、interface的地位一样
 * 使用enum定义的枚举类默认继承了java.lang.Enum，而不是继承Object类。枚举类可以实现一个或多个接口。
 * 枚举类的所有实例都必须放在第一行展示，不需使用new 关键字，不需显式调用构造器。自动添加public static final修饰。
 * 使用enum定义、非抽象的枚举类默认使用final修饰，不可以被继承。
 * 枚举类的构造器只能是私有的。
 *
 */
public class d_01_枚举的概述 {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        switch (color){
            case RED:
                System.out.println("是红色");
                break;
            case BLUE:
                System.out.println("是蓝色");
                break;
            case BLACK:
                System.out.println("是黑色");
                break;
            case GREEN:
                System.out.println("是绿色");
                break;
        }
    }

}
