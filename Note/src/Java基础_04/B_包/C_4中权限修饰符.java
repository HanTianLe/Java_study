package Java基础_04.B_包;

/**
 *      权限修饰符：
 *           --------------------------------------------------------------------------------------
 *                          本类     同一个包下（子类和无关类）   不同包下（子类）    不同包下（无关类）
 *           --------------------------------------------------------------------------------------
 *            private        Yes
 *           --------------------------------------------------------------------------------------
 *            默 认          Yes            Yes
 *           --------------------------------------------------------------------------------------
 *            protect        Yes            Yes                      Yes
 *           --------------------------------------------------------------------------------------
 *            public         Yes            Yes                      Yes                Yes
 *           --------------------------------------------------------------------------------------
 *
 *
 */
public class C_4中权限修饰符 {}

class Father{
    private void show(){
        System.out.println("show");
    }

    void show2(){
        System.out.println("show 2");
    }

    protected void show3(){
        System.out.println("show 3");
    }

    public void show4(){
        System.out.println("show 4");
    }

    public static void main(String[] args){
        /** 本类中*/
        Father f = new Father();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }
}

class Son extends Father {
    public static void main(String[] args){
        /** 同一个包下*/
        Father f = new Father();
//        f.show();
        f.show2();
        f.show3();
        f.show4();

        Son s = new Son();
//        s.show();
        s.show2();
        s.show3();
        s.show4();
    }
}
