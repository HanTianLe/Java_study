package Java基础_03;
//华氏度转摄氏度
import java.util.Scanner;

public class 温度转换 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("请输入华氏度:");
       int F = sc.nextInt();
       int C;
       C = (F - 32)*5/9;
       System.out.println("所对应的摄氏度为:"+C);
   }
}

//计算不同段位的电费
class 计算不同段位的电费 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入度数:");
        int x = sc.nextInt();
        float y;
        if (x <= 100)
            y = (float) (x * 0.3);
        else if (x <= 200)
            y = (float) (x * 0.4);
        else if (x <= 300)
            y = (float) (x * 0.5);
        else
            y = (float) (x * 0.8);
        System.out.println("电费为"+y);
    }
}

