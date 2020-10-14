package day_04_泛型;
/**
 * 泛型接口：
 *      把泛型定义在接口上。
 *
 * 格式：
 *      public interface 接口名<泛型类型1...>
 *
 *
 *  实现类在实现接口的时候：（2种情况）
 *              1、已经知道该接口是什么类型的了。
 *              2、还不知道是什么类型。  (常见)
 *
 */
public interface d_05_泛型接口的概述和使用<T> {
    public abstract void show(T t);
}

