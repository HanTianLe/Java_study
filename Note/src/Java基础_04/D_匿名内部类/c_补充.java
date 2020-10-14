package Java基础_04.D_匿名内部类;

public class c_补充 {}


interface Person{
    public abstract void study();
}

class PersonDemo{
    /**
     * 接口名作为形式参数
     * 其实这里需要的不是接口，而是该接口的（实现类的对象）！！！
     * @param pp
     */
    public void method(Person pp){
        pp.study();
    }

}


/** 接口的实现类*/
class Student implements Person {
    @Override
    public void study() {
        System.out.println("好好学习，天天向上！！");
    }
}


class InnerClassTest{
    public static void main(String[] args) {
        // 方法一
        // 利用多态
        PersonDemo pd = new PersonDemo();
        Person p = new Student();   //多态
        pd.method(p);
        System.out.println("-----------------------");
        // 方法二
        // 利用匿名内部类
        pd.method(new Person() {
            @Override
            public void study() {
                System.out.println("好好学习，天天向下~~");
            }
        }
        );
        //两个方法的原理是一样的，只不过是方式不一样~
    }
}


