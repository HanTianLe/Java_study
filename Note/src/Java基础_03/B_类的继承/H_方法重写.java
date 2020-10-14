package Java基础_03.B_类的继承;

/**
 *      Override
 *
 *      方法重写： (又称：方法覆盖、方法复写。)子类中出现了和父类中方法声明一模一样的方法。
 * 注意区别：
 *      方法重载：（同一类中）出现的方法名一样，参数列表不同的方法。与返回值无关。
 *
 *      子类对象调用方法的时候： 先找子类本身，再找父类。
 *
 *      方法重写的应用：
 *             当子类需要父类的功能，而功能主体子类有自己特有的内容时，可以重写父类中的方法。
 *             这样，即沿袭了父类的功能，又定义了子类特有的内容。
 *
 *      子类方法如何调用父类的方法功能呢？
 *             通过 super 关键字调用。
 *
 *      方法重写的注意事项:
 *          A、父类中（私有方法）不能被重写！
 *             因为父类私有方法根本就无法被继承，所以也就谈不上被重写了。
 *             如果非要写，其实质是在子类里面的建立一个另一个相同名的方法。
 *             而且子类对象是无法调用父类私有方法的。
 *          B、子类重写父类方法时，访问权限不能更低！！
 *             最好一致。
 *          C、父类静态方法想要重写，子类也必须通过静态方法进行重写。
 *            （其实这个算不上方法重写，但是现象确实如此。）
 *
 */
public class H_方法重写 {}

class Phone{
    /** 成员方法*/
    public void call(String name){
        System.out.println("给"+name+"打电话~");
    }
    /** 私有方法*/
    private void show(){
        System.out.println("show Phone 私有方法");
    }
    /** 静态方法*/
    public static void method(){
        System.out.println("method Phone 静态方法");
    }
}

class NewPhone extends Phone {
    /** 重写父类方法*/
    public void call(String name){
        super.call(name);   //调用父类的成员方法call。
        System.out.println("骂"+name+"一下！");
        System.out.println("顺便看看天气~");
    }
    /** 父类私有方法无法重写*/
    public void show(){
        System.out.println("show NewPhone 成员方法");
    }
    /** 父类静态方法重写同样要加static。（实际算不算重写）*/
    public static void method(){
        System.out.println("method NewPhone 静态方法");
    }
}


class TestDemo{
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call("孟夫子");    //给孟夫子打电话~   骂孟夫子一下！ 顺便看看天气~
        np.show();                  //show NewPhone 成员方法
        np.method();                //method NewPhone 静态方法
    }
}



