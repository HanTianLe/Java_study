package Java基础_04.B_包;

/**
 *      导包：
 *          格式：import 包名;
 *          这种方式是导入到类的名称
 *
 *      面试题：
 *          package、import、class的顺序关系
 *            package > import > class
 *
 *            package: 只能有一个。
 *            import:  可以有多个。
 *            class:   可以有多个，以后建议是一个。
 *
 *
 *
 */
import Java基础_04.A_形式参数和返回值的问题.包测试类;

public class B_import关键字 {
    public static void main(String[] args) {
        int a;
        包测试类 b = new 包测试类();
        a = b.sum(1,2);
        System.out.println(a);
    }
}



