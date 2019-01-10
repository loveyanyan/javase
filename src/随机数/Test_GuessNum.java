package 随机数;

import java.util.Scanner;

/**
 * @author yj
 * @date: 2019/1/10
 * @time: 16:09
 * @Description: 猜数字游戏
 */
public class Test_GuessNum {
    public static void main(String[] args) {
        /*1、先生成一个随机数*/
        int num1 = (int) (Math.random() * 100 + 1);
        System.out.println(num1);
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.println("输入你的数字：");
            int num2 = sca.nextInt();
            /*3、比较两个数值大小，并提示*/
            if (num1 > num2) {
                System.out.println("你所输入的数值偏小，请继续输入！");
            }
            if (num1 < num2) {
                System.out.println("你所输入的数值偏大，请继续输入！");
            }
            if (num1 == num2) {
                System.out.println("恭喜，你输入的数字正确！");
                break;
            }
        }

    }
}
