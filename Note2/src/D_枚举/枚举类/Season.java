package D_枚举.枚举类;

/**
 *  枚举类
 *  如果没有显式地声明基础类型的枚举，那么意味着它所对应的基础类型是 int。
 */
public enum Season {
    SPRING("春天"), SUMMER("春天"), AUTUMN("春天"), WINTER("春天");

    private final String name;

    private Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
/*
 * 实际上在第一行写枚举类实例的时候，默认是调用了构造器的，
 * 所以此处需要传入name参数，因为没有显式申明无参构造器，只能调用有参数的构造器。
 * 构造器需定义成私有的，这样就不能在别处申明此类的对象了。
 * 枚举类通常应该设计成【不可变类】，它的Field不应该被改变，
 * 这样会更安全，而且代码更加简洁。
 * 所以我们将Field用private final修饰。
 */

