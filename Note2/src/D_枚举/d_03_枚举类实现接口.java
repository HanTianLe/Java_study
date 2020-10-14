package D_枚举;
/*
 * 枚举类可以实现一个或多个接口。
 *
 * 与普通类一样，实现接口的时候需要实现接口中定义的所有方法，
 * 若没有完全实现，那这个枚举类就是抽象的，
 * 只是不需显式加上 abstract 修饰，系统化会默认加上。
 *
 */
public enum d_03_枚举类实现接口 {
    ADDITION{
        public double eval(double x, double y){ return x + y; }
    },

    SUBTRACTION{
        public double eval(double x, double y){ return x - y; }
    },

    MULTIPLICATION{
        public double eval(double x, double y){ return x * y; }
    },

    DIVISION{
        public double eval(double x, double y){ return x / y; }
    };

    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(d_03_枚举类实现接口.ADDITION.eval(2,2));
        System.out.println(d_03_枚举类实现接口.SUBTRACTION.eval(2,2));
        System.out.println(d_03_枚举类实现接口.MULTIPLICATION.eval(2,2));
        System.out.println(d_03_枚举类实现接口.DIVISION.eval(2,2));
    }

}
/*
 * d_03_枚举类实现接口 类 实际上是抽象的，不可以创建枚举值，
 * 所以此处在申明枚举值的时候，都实现了抽象方法，这其实是匿名内部类的实现，花括号部分是一个类体。
 * 我们可以看下编译以后的文件。
 */
