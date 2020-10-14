package Java基础_02.pack_1方法;

/**
 *      Overload
 *
 *      方法的重载，[定义和特点]
 *
 *      需求：求数的和。
 *          在求和时，有多种求和的方法，但是他们的名字是不一样的。
 *          但，我们又要求方法命名要做到：见名知意。很明显现在没有做到。
 *
 *          针对这种情况：方法功能相同，但是方法参数列表不同，Java允许他们起一样的名字。
 *          我们引入一个概念：[ 方法重载 ]。
 *
 *      方法重载：在（同一个类）中，允许存在一个及以上的同名方法，⭐⭐
 *               只要它们的参数列表(参数个数或参数类型)不同即可。⭐⭐
 *
 *      特点：A、与返回值类型无关，只看方法名和参数列表。⭐⭐
 *           B、在调用时，虚拟机通过参数列表的不同来区分方法。
 *
 */
public class D_方法的重载 {
    public static void main(String[] args) {
        //三种求和
        System.out.println(sum(4,5));   //调用int的sum
        System.out.println(sum(7,8,9));
        System.out.println(sum(5,9,8,7));
        System.out.println(sum(10,20.5f));  //调用float的sum（自动选择参数类型大的方法，int也就转为float了。）
        /**
         * 当把下面的int sum(int a,int b)方法注释掉的时候，
         * 继续运行main方法，第一个System.out.println(sum(4,5));
         * 会寻找比int类型大的方法。如果有，就会
         * 自动调用float sum(float a,float b)方法。
         * 控制台显示：调用float	9.0
         */
    }

    /**需求1：求两个数的和 */
    public static int sum(int a,int b){
        System.out.print("调用int"+"\t");
        return a+b;
    }

    public static float sum(float a,float b){
        System.out.print("调用float"+"\t");
        return a+b;
    }

    /**需求2：求三个数的和 */
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    /**需求3：求四个数的和 */
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }


}


/**
 * 比较两个数据是否相等，参数类型分别为：两个byte类型，两个short类型，
 *      两个int类型，两个long类型。
 * 并在main方法中测试。
 */
class Demo_041{
    public static void main(String[] args) {
        //测试
        byte a1 = 3;
        byte a2 = 4;

        short b1 = 5;
        short b2 = 5;

        int c1 = 6;
        int c2 = 3;

        long d1 = 6;
        long d2 = 6;
        System.out.println("byte:"+compare(a1,a2));
        System.out.println("short:"+compare(b1,b2));
        System.out.println("int:"+compare(c1,c2));
        System.out.println("long:"+compare(d1,d2));
    }

    /** byte类型*/
    public static boolean compare(byte a,byte b){
        System.out.println("进入了byte");
        return a == b;
    }

    /** short类型*/
    public static boolean compare(short a,short b){
        System.out.println("进入了short");
        return a == b;
    }

    /** int类型*/
    public static boolean compare(int a,int b){
        System.out.println("进入了int");
        return a == b;
    }

    /** long类型*/
    public static boolean compare(long a,long b){
        System.out.println("进入了long");
        return a == b;
    }
}

