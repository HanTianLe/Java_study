package Java基础_04.C_内部类;

/**
 *      注意：
 *          1、内部类和外部类没有继承关系！
 *          2、通过外部类名限定this对象。
 *                  Outer.this
 *
 */
public class d_成员内部类_测试 {}

/** 外部类*/
class Outer3{
     public int a = 10;
     /** 内部类*/
     class Inner{
         public int a = 20;
         public void show(){
             int a = 30;
             System.out.println(a);             //30
             System.out.println(this.a);        //20
             // 错误！
//             System.out.println(super.a);
             //匿名对象 调用外类成员。
             System.out.println(new Outer3().a);//10
             //最终版   (通过外部类名限定this对象。)
             System.out.println(Outer3.this.a); //10
         }
     }
}


class InnerClassTest{
    public static void main(String[] args) {
        Outer3.Inner oi = new Outer3().new Inner();
        oi.show();
    }
}


