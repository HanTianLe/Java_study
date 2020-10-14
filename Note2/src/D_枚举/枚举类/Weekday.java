package D_枚举.枚举类;
/*
 *  在每个枚举变量的后面加上了一个括号，里面是我们希望它代表的数字。
 *  然后，我们定义了一个int变量，然后通过构造函数初始化这个变量。
 *  你应该也清楚了，括号里的数字，其实就是我们定义的那个int变量。这句叫做自定义变量。
 *
 *  注意：
 *      1、一定要把枚举变量的定义放在第一行，并且以分号结尾。
 *      2、构造函数必须私有化。事实上，private是多余的，
 *         你完全没有必要写，因为它默认并强制是 private，
 *         如果你要写，也只能写 private，写 public 是不能通过编译的。
 *      3、自定义变量与默认的 ordinal 属性并不冲突，ordinal 还是按照它的规则给每个枚举变量按顺序赋值。
 *
 *  PS：既然能自定义一个变量，能不能自定义两个呢？ -->当然能 ！！你可以定义任何你想要的变量。
 *
 */
public enum Weekday {
    MON(1,"mon"),
    TUS(2,"tus"),
    WED(3,"wed"),
    THU(4,"thu"),
    FRI(5,"fri"),
    SAT(6,"sat"),
    SUN(0,"sun");

    private int value;
    private String label;

    // private可以不用写
//    private Weekday(int value, String label) {
//        this.value = value;
//        this.label = label;
//    }
    Weekday(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }
    public String getLabel() {
        return label;
    }

}
