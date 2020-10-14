package Java基础_03.C_多态;

public class D_孔子装爹案例 {}

class 孔子爹{
    public int age = 40;

    public void teach(){
        System.out.println("将JavaSE");
    }
}


class 孔子 extends 孔子爹 {
    public int age = 20;

    public void teach(){
        System.out.println("讲论语");
    }
    public void playGame(){
        System.out.println("玩英雄联盟");
    }
}

/** 孔子装爹去讲课*/
class 测试类{
    public static void main(String[] args) {
        //向上转型
        //穿上爹的衣服，开始装爹
        孔子爹 k爹 = new 孔子();
        System.out.println(k爹.age); //40
        k爹.teach();     //讲论语
//        k爹.playGame();    //虽然孔子能玩游戏，但是他现在是装爹，而孔子爹不能玩，
                             //为了不能被发现，所以不能调用playGame方法~

        System.out.println("--------------------------------");
        //向下转型
        //脱下爹的衣服，做回自己
        孔子 k = (孔子)k爹;//之所以把 k爹 强转为孔子，因为 k爹 本身就是孔子装的。
        System.out.println(k.age); //20
        k.teach();      //讲论语
        k.playGame();   //玩英雄联盟
    }
}

