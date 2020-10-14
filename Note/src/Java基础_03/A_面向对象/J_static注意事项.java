package Java基础_03.A_面向对象;

/**
 *      static 注意事项
 *               A、在静态方法中是没有 this 关键字的。 ⭐⭐
 *               B、静态方法只能访问（静态成员变量）和（静态成员方法）。 ⭐⭐
 *                      静态方法：
 *                          访问成员变量时，只能访问（静态变量）。
 *                          访问成员方法时，只能访问（静态成员方法）。
 *                      非静态方法：
 *                          访问成员变量时，可以访问（静态变量），也可以是（非静态变量）。
 *                          访问成员方法时，可以访问（静态成员方法），也可以是（非静态成员方法）。
 *      注意：
 *          静态方法 ：可以（重载）
 *                    但是不可以（重写）！！
 *
 */
class Student4{
    //非静态
    public int num = 10;
    //静态
    public static int num1 = 20;

    /** 非静态方法*/
    public void show(){
        System.out.println(num);        //10    隐含的说明，访问的是成员变量(非静态)。
        System.out.println(this.num);   //10    明确的说明，访问的是成员变量(非静态)。
        System.out.println(num1);       //20    访问的是(静态)成员变量。
        function(); //（非静态方法）可以访问（非静态）方法。
        function1();//（非静态方法）也可以访问（静态）方法。
    }

    /** 静态方法*/
    public static void method(){
        //调用静态变量num1
        System.out.println(num1);   //20
        /**
         * System.out.println(num);       静态方法不能调用非静态变量
         * System.out.println(this.num1); 静态方法里面不能有 this （不管是调用静态还是非静态）
         * System.out.println(this.num);  静态方法里面不能有 this （不管是调用静态还是非静态）
         */
//        function(); //（静态方法）不能访问（非静态）方法。
        function1();//（静态方法）可以访问（静态）方法。
    }

    /** 非静态方法*/
    public void function(){
    }
    /** 静态方法*/
    public static void function1(){
    }

}

public class J_static注意事项 {
    public static void main(String[] args) {
        Student4 s = new Student4();
        s.show();   //10    10  20
        System.out.println("----------------------");
        s.method();     //20
    }
}


