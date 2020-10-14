package day_04_泛型;

import java.util.ArrayList;
import java.util.Collection;

/**
 *      泛型通配符<?>
 *          任意类型，如果没有明确，那么就是Object以及任意的Java类了。
 *
 *      ? extends E
 *          向下限定，E及其子类
 *
 *      ? super E
 *          向上限定，E及其父类
 */
public class d_06_泛型高级_通配符 {
    public static void main(String[] args) {
        //泛型明确写的时候，前后必须一致
        Collection<Object> c = new ArrayList<Object>();
        // Collection<Object> c2 = new ArrayList<Animal>(); //报错
        // Collection<Object> c3 = new ArrayList<Dog>();    //报错
        /** ?表示任意类型都是可以的。 */
        Collection<?> c1 = new ArrayList<Object>();
        Collection<?> c2 = new ArrayList<Animal>();
        Collection<?> c3 = new ArrayList<Cat>();

        /** ? extends E :向下限定，后面只能是Animal类或者其子类Cat和Dog类。 */
        // Collection<? extends Animal> c4 = new ArrayList<Object>();   //报错
        Collection<? extends Animal> c5 = new ArrayList<Animal>();
        Collection<? extends Animal> c6 = new ArrayList<Cat>();
        Collection<? extends Animal> c7 = new ArrayList<Dog>();

        /** ? super E :向上限定，后面只能是Animal类或者其父类Object类。 */
        Collection<? super Animal> c8 = new ArrayList<Object>();
        Collection<? super Animal> c9 = new ArrayList<Animal>();
        // Collection<? super Animal> c10 = new ArrayList<Cat>();   //报错
        // Collection<? super Animal> c11 = new ArrayList<Dog>();   //报错

    }
}


class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}
