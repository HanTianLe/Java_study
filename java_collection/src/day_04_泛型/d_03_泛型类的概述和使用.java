package day_04_泛型;
/**
 *      泛型类：
 *          格式：public class 类名<泛型类型,....>   （泛型类型可以有多个）
 *          注意：泛型类型必须是引用类型。
 *
 */
public class d_03_泛型类的概述和使用<T> {
    private T obj;

    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }


    public static void main(String[] args) {
        /** 不标准使用方法 */
//        d_03_泛型类的概述及使用 c = new d_03_泛型类的概述及使用();
//
//        c.setObj(new String("张三"));
//        String s = (String) c.getObj();
//        System.out.println(s);
//
//        c.setObj(new Integer(21));
//        Integer i = (Integer) c.getObj();
//        System.out.println(i);
//
//        c.setObj(new String("李四"));
//        // 报错：ClassCastException
//        Integer ii = (Integer) c.getObj();
//        System.out.println(ii);

        /** 标准使用方法 */
        d_03_泛型类的概述和使用<String> c = new d_03_泛型类的概述和使用<String>();
        //c.setObj(new Integer(22)); //这时候编译期间就能看到错误。
        c.setObj(new String("眉间尺"));
        String s = c.getObj();
        System.out.println(s);

        d_03_泛型类的概述和使用<Integer> cc = new d_03_泛型类的概述和使用<Integer>();
        cc.setObj(20);
        Integer i = cc.getObj();
        System.out.println(i);
    }
}
