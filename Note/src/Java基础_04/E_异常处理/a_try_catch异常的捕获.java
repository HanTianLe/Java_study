package Java基础_04.E_异常处理;

/**
 * ------------------------------------------
 *      如何处理异常？
 *      A、 try...catch...finally    捕获
 *      B、 throws                   抛出
 *
 *------------------------------------------
 *      try...catch...finally的处理格式：
 *------------------------------------------
 *          try{
 *              //可能出现异常的语句;
 *          }catch(异常类名 参数名){
 *              //异常处理语句;
 *          }finally{
 *              //释放资源;
 *          }
 *------------------------------------------
 *      变形格式：(finally可以省略)
 *------------------------------------------
 *          try{
 *              //可能出现异常的语句;
 *          }catch(异常类名 参数名){
 *              //异常处理语句;
 *          }
 *
 * 好处：前面出问题了，没关系。后面还能继续运行。
 *------------------------------------------------
 * 注意：try()里面不是一定放有问题的代码，也可以放正确的代码。
 *      因为try...catch只是为了防止程序可能出现异常。
 *      所以一旦try里面出现问题，就会在这里把问题抛出去，
 *      然后和catch里面的问题进行匹配，一旦有匹配的，
 *      就执行catch里面的处理，
 *      然后就结束了try...catch...
 *      继续执行后面的语句。
 *
 */
public class a_try_catch异常的捕获 {}

class ExceptionDemo{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        /**
         *----------------------------------------------------
         *      两种异常捕获处理：
         *----------------------------------------------------
         *          A、每一个写一个try...catch
         *----------------------------------------------------
         *          B、写一个try，多个catch
         *              try{
         *                ...
         *              }catch(异常类名1 参数名1){
         *                ...
         *              }catch(异常类名2 参数名2){
         *                ...
         *              }
         *-----------------------------------------------------------
         *          JDK7 后出现了新的处理方案：
         *-----------------------------------------------------------
         *          try{
         *          }catch(异常名1 | 异常名2 | 异常名3 |...  参数名){
         *              ...
         *          }
         *------------------------------------------------------------------------------------
         *  当不知道是捕获的是什么类型异常时，就用所有异常的父类：Exception。
         *------------------------------------------------------------------------------------
         *  Exception类中的方法：
         *      A、printStackTrace()方法：打印出（异常的类型、异常的详细消息、异常的位置）。
         *      B、getMessage()方法：获取（异常的详细消息）。
         *      C、toString()方法：获取（异常的类型）和（异常的详细消息）。
         *------------------------------------------------------------------------------------
         *
         */
        try {
            System.out.println(a/b);
        }catch (ArithmeticException ae){
            ae.printStackTrace();   // java.lang.ArithmeticException: / by zero
                                    // at Unit_04.E_异常处理.ExceptionDemo.main(a_try_catch异常的捕获.java:78)
            System.out.println(ae.getMessage());    // / by zero
            System.out.println(ae.toString());      // java.lang.ArithmeticException: / by zero
            System.out.println("除数不能为0！");     // 除数不能为0！
        }
        //还能继续运行。
        System.out.println("Come on~");

        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("数组索引越界了！");
        }
        //还能继续运行。
        System.out.println("Over~");

    }
}

class Test{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {1,2,3};

        try {
//            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("除数不能为0！");
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
            System.out.println("数组索引越界了！");
        }catch (Exception e){   //当不知道是捕获的是什么类型异常时，就用所有异常的父类：Exception。
            e.printStackTrace();
            System.out.println("出问题了！！！");
        }


        /** 改进*/
//        try{
//            System.out.println(a/b);
//            //System.out.println(arr[3]);
//        }catch (ArithmeticException | ArrayIndexOutOfBoundsException aa){
//            e.printStackTrace();
//            System.out.println("出问题了！！！");
//        }

        System.out.println("Over~");
    }

}

/**
 *      finally{}  可选项。在所有其他过程发生之后无条件执行的语句。
 *
 */
class Test2{
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try {
            System.out.println(1);
            System.out.println(a/b);//当执行到这边的时候，出现异常直接跳到catch模块了。
            System.out.println(2);
        }catch (Exception e){
            System.out.println(3);
        }finally {
            System.out.println(4);  //不管前面如何，finally模块最终都会执行！
        }
        System.out.println("结束~");
    }
}
