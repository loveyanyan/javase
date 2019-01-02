package 选择结构;

import java.util.Scanner;

/**
 * @author yj
 * @date: 2019/1/2
 * @time: 16:55
 * @Description:
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("输入编号");
        int number = scr.nextInt();
        switch (number) {
            case 7:
                System.out.println("今天星期一！");
                /*break;*/    //不加break     会继续执行下面的语句
            case 2:
                System.out.println("今天星期二！");
                /*break;*/
            case 3:
                System.out.println("今天星期三！");
                /*   break;*/
            case 4:
                System.out.println("今天星期四！");
                /* break;*/
            case 5:
                System.out.println("今天星期五！");
                /* break;*/
            case 6:
                System.out.println("今天星期六！");
                /*break;*/
            case 1:
                System.out.println("今天星期日！");
                /* break;*/
            default:
                int a = 1;
                System.out.println(a + 5);
                System.out.println("输入有误，重新输入！");
                /*break;*/
        }
    }
}
