package Java基础_04.E_异常处理;

/**
 *-------------------------------------------------------------------------
 *      抛出异常：
 *          定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
 *          所以出现了另一种异常处理方案：抛出。
 *-------------------------------------------------------------------------
 *      格式：
 *          throws 异常类名
 *          注意：这个格式必须跟在（方法的括号）后面。
 *--------------------------------------------------------------------------------------------
 *  throw: 如果出现了异常情况，可以把异常抛出，这时抛出的应该是（异常的对象）。
 *         throw是语句抛出一个异常，一般是在代码块的内部，
 *        当程序出现某种逻辑错误时由程序员主动抛出某种特定类型的异常。
 *
 *  throws：throws是方法可能抛出异常的声明。(用在声明方法时，表示该方法可能要抛出异常)
 *         当某个方法可能会抛出某种异常时用于throws 声明可能抛出的异常，
 *         然后交给上层调用它的方法程序处理。
 *---------------------------------------------------------------------------------------------
 *  throws 和 throw 的区别：
 *          1、throws出现在方法函数头；而throw出现在函数体。
 *          2、throws表示出现异常的一种可能性，并不一定会发生这些异常；
 *             throw则是抛出了异常，执行throw则一定抛出了某种异常对象。
 *---------------------------------------------------------------------------------------------
 */
public class b_抛出异常 {
    public static void main(String[] args) {

        try {
            method();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void method() throws Exception{
        int a = 0;
        int b = 2;
        System.out.println(b/a);
    }

}


/** 人工抛出异常。*/
class Demo{
    int age;
    public void method(int age) throws Exception{
        if (age < 0 || age > 100){
            throw new Exception("年龄输入错误！");
        }else {
            this.age = age;
            System.out.println("年龄是："+age);
        }
    }
}

class Tests{
    public static void main(String[] args) {
        Demo d = new Demo();

        try {
            d.method(-20);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 *  创建用户自定义异常类
 *
 *  用户自定义异常类MyException，用于描述数据取值范围错误信息。
 *  用户自己的异常类必须继承现有的异常类。
 */

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

class Demo2{
    int age;

    public void method(int age) throws MyException {
        if (age < 0 || age > 100){
            throw new MyException("年龄输入错误！");
        }else {
            this.age = age;
            System.out.println("年龄是："+age);
        }
    }
}

class Tests2{
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        try {
            d.method(-20);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 *      显示的是：
 *      Unit_04.E_异常处理.MyException: 年龄输入错误！
 *      MyException是自己定义的异常类。
 */


