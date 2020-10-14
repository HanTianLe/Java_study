package Java基础_02.pack_2数组;
import java.util.Scanner;

/**
 *      数组的操作
 *          A、遍历    length属性 (格式：数组名.length )
 *          B、获取最值
 *          C、逆序
 *          D、查找法
 *          E、基本查找
 *
 *      [常见的小问题]  ⭐⭐⭐
 *          <1> ArrayIndexOutOfBoundsException：数组索引越界异常     原因：你访问了不存在的索引       ⭐⭐⭐
 *          <2> NullPointerException：空指针异常                    原因：数组已经不在指向堆内存了   ⭐⭐⭐
 */
public class 数组的操作 {
    public static void main(String[] args){
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);  /** 出现错误：ArrayIndexOutOfBoundsException*/
//        arr = null;
//        System.out.println(arr[0]);  /** 出现错误：NullPointerException*/

    }
}

/**
 *  A、遍历    (依次输出数组中的每一个元素)
 *
 *     注意：数组提供了一个属性length，用于获取数组的长度。
 *     格式：数组名.length
 *
 */
class A遍历 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,22,33,44,55};
        /** 获取每一个元素*/
        //1、索引遍历
        System.out.println("索引遍历：");
        System.out.print(arr[0]+"\t");
        System.out.print(arr[1]+"\t");
        System.out.print(arr[2]+"\t");
        System.out.print(arr[3]+"\t");
        System.out.println(arr[4]);
        System.out.println("-------------------------");
        //2、循环遍历
        System.out.println("循环遍历：");
        for (int x = 0;x < 5;x++){
            System.out.print(arr[x]+"\t");
        }

        /** 如果数组元素很多，则需要一个属性：length专门用于获取数组的长度。
         *  格式：数组名.length 返回数组的长度。
         */
        System.out.println();
        System.out.println("---------------------------------");
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
        //获取arr1数组的长度
        System.out.println("arr1数组的长度为："+arr1.length);
        /** 利用length属性配合循环获取*/
        for (int x = 0;x < arr1.length;x++){
            System.out.print(arr1[x]+"\t");
        }

        /** 调用遍历数组方法来获取*/
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("遍历arr数组：");
        //调用printArray函数
        printArray(arr);
        System.out.println("---------------------------------------------");
        System.out.println("遍历arr1数组：");
        //调用printArray函数
        printArray(arr1);
    }


    /**
     *  定义一个 (遍历数组) 的方法  (顺便做了美化改进)
     *  两个明确：
     *       返回值参数类型：void
     *       参数列表：int[] arr
     *
     *  @param arr
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x = 0;x < arr.length;x++){
            if(x == arr.length-1){
                System.out.println(arr[x]+"]"); //这是最后一个元素
            }else {
                System.out.print(arr[x]+",");
            }
        }
    }
}


/**
 *  B、获取最值  (获取数组中的最大值最小值)
 *
 *      方法：
 *          A：定义一个数组，并对数组的元素进行静态初始化。
 *          B：从数组中任意的找一个元素能为参照物（一般取第一个），默认它就是最太值。
 *          C: 然后遍历其他元素，依次获取和参照物比较，如果大就留下，如果小，就离开。
 *          D、最后参照物保存的就是最大值。
 *
 */
class B获取最值 {
    public static void main(String[] args){
        int[] arr = {22,11,33,44,55,66};
        System.out.println("max="+getMax(arr));
        System.out.println("min="+getMin(arr));
    }

    /**
     * 定义一个 (求最大值和求最小值) 的方法
     * @param arr
     * @return
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int x = 1;x < arr.length;x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int x = 1;x < arr.length;x++){
            if (arr[x] < min){
                min = arr[x];
            }
        }
        return min;
    }
}


/**
 *  C、逆序      (把元素对调)
 *
 *      分析：
 *         A、定义一个数组，并进行静态初始化
 *         B、思路
 *               把0索引和arr.length-1的数据交换
 *               把1索引和arr.length-2的数据交换
 *               ......
 *
 */
class C逆序 {
    public static void main(String[] args) {
        int[] arr = {12,98,50,34,76};
        System.out.print("逆序前：");
        printArray(arr);
        System.out.print("逆序后：");
        reserve(arr);
        printArray(arr);
        System.out.print("还原后：");
        reserve1(arr);
        printArray(arr);
    }

    /**
     * 定义 (数组逆序) 的方法
     * 方法1
     * @param arr
     */
    public static void reserve(int[] arr){
        for (int x = 0;x<arr.length/2;x++){
            int temp = arr[x];
            arr[x] = arr[arr.length-1-x];
            arr[arr.length-1-x] = temp;
        }
    }
    /** 方法2*/
    public static void reserve1(int[] arr){
        for (int start = 0,end = arr.length-1;start <= end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /**
     *  定义一个 (遍历数组) 的方法
     *  @param arr
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x = 0;x < arr.length;x++){
            if(x == arr.length-1){
                System.out.println(arr[x]+"]"); //这是最后一个元素
            }else {
                System.out.print(arr[x]+",");
            }
        }
    }

}


/**
 *  D、查找法 (根据键盘录入索引，查找对应值)
 *
 *     意思是：String[] strArray = {"星期一","星期二","星期三",...};
 */
class D查找法 {
    public static void main(String[] args){
        //定义一个字符串数组
        String[] strArray = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        //创建键盘输入录入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个整数(0-6):");
        //int index = sc.nextInt();
        //System.out.println("你要查找的日期是："+strArray[index]);
        System.out.println("你要查找的日期是："+strArray[sc.nextInt()]);
    }
}


/**
 *  E、基本查找      (查找指定元素第一次在数组中出现的索引)
 *
 *  分析：
 *      A、定义一个数组，并静态初始化
 *      B、写一个功能实现
 *              遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较。
 *              如果相等，就返回当前的索引值。
 */
class E基本查找 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6};
        //查找2在数组中第一次出现的索引
        int index = getIndex(arr1,2);
        System.out.println("2在数组中第一次出现的索引是："+index);
        int index1 = getIndex1(arr1,2);
        System.out.println("2在数组中第一次出现的索引是："+index1);
        int index2 = getIndex1(arr1,20);
        System.out.println("20在数组中第一次出现的索引是："+index2);
    }

    /**
     * 定义一个 (查找指定数据在数组中第一次出现的索引) 的方法
     * @param arr
     * @param value
     * @return
     */
    public static int getIndex(int[] arr,int value) {
        for (int x = 0;x<arr.length;x++){
            if (arr[x] == value) {
                return x;
            }
        }
        /** 只要是判断就有可能有false，所以如果是false而没有返回值
         *  就会报错。所以一般返回一个负数即可，一般返回-1。
         */
        return -1;
    }

    public static int getIndex1(int[] arr,int value){
        //定义一个索引
        int index = 20;
        //有就修改索引index的值
        for (int x = 0;x < arr.length;x++){
            if (arr[x] == value){
                index = x;
                break;
            }
        }
        return index;
    }
}


