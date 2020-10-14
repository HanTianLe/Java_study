package Java基础_02.pack_2数组;

/**
 *      [数组] 的概述和定义
 *
 *      定义：存储同一种数据类型的多个元素的容器。
 *
 *      定义格式：
 *          A、数据类型[] 数组名;
 *          B、数据类型 数组名[];
 *
 *      举例：
 *          A、int[] a;      定义了一个int类型的数组a变量 (最好用这个)
 *          B、int a[];      定义了一个int类型的a数组变量
 *
 *      注意：
 *          效果是一样的，都是定义一个int类型的数组；
 *          但是念法有点小区别。推荐用第一种！！
 *
 *      如何对数组进行初始化？（为数组开辟内层空间，并为每个数组元素赋予值。）
 *          A、动态初始化（只给出长度，由系统给出初始值。 ）
 *          B、静态初始化（只给出初始化值，由系统决定长度。）
 *
 *
 */
/**
 *      A、动态初始化
 *          格式：
 *                           数据类型[] 数组名 = new 数据类型[数组长度];    ⭐
 *          获取数组中的元素：
 *                           数组名[索引];                                ⭐
 *              (索引就是每个元素的编号，从 0 开始，最大的索引是数组的长度-1。)
 *
 */
public class 数组的定义 {
    public static void main(String[] args) {
        /** 举例*/
        int[] arr = new int[3];    //初始化一般默认值是 0
        /**
         * 左边：
         *      int：说明数组中的元素数据类型是int类型
         *      []：说明这是一个数组
         *      arr：数组名
         *
         * 右边：
         *      new：为数组分配内存空间
         *      int：说明数组中的元素数据类型是int类型
         *      []：说明这是一个数组
         *      3：数组的长度其实也是数组中元素的个数
         */
        System.out.println(arr);    //[I@1b6d3586       (内存地址值)
        /** 通过数组名访问数据*/
        System.out.print(arr[0]+"\t");  //0
        System.out.print(arr[1]+"\t");  //0
        System.out.println(arr[2]+"\t");//0
        System.out.println("----------------------");
        /** 给数组元素赋值*/
        arr[1] = 100;
        arr[2] = 200;
        System.out.print(arr[0]+"\t");  //0
        System.out.print(arr[1]+"\t");  //100
        System.out.println(arr[2]+"\t");//200
        System.out.println("----------------------");

        int[] arr1 = new int[3];
        arr1[0] = 22;
        arr1[1] = 44;
        arr1[2] = 55;
        System.out.println(arr1);
        System.out.print(arr1[0]+"\t");  //22
        System.out.print(arr1[1]+"\t");  //44
        System.out.println(arr1[2]+"\t");//55
        System.out.println("----------------------");

        int[] arr2 = arr1;
        arr2[0] = 100;
        arr2[1] = 200;
        System.out.print(arr2[0]+"\t"); //100
        System.out.print(arr2[1]+"\t"); //200
        System.out.print(arr2[2]+"\t"); //55
    }
}

/**
 *      B、静态初始化：
 *              格    式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,....};
 *
 *              简化格式：数据类型[] 数组名 = {元素1,元素2,....};
 *
 *      注意事项：
 *          不能同时动态和静态
 *              如：int[] arr = new int[3]{1,2,3};    //错误
 *
 */
class Demo_051{
    public static void main(String[] args) {
        /** 静态初始化*/
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = {1,2,3,4};
        System.out.println(arr1);           //[I@1b6d3586
        System.out.print(arr1[0]+"\t");     //1
        System.out.print(arr1[1]+"\t");     //2
        System.out.println(arr1[3]+"\t");   //4
        System.out.println("------------------------------------");
        System.out.println(arr2);       //[I@4554617c
        System.out.print(arr2[0]+"\t"); //1
        System.out.print(arr2[1]+"\t"); //2
        System.out.print(arr2[2]+"\t"); //3
        System.out.print(arr2[3]+"\t"); //4
    }
}

