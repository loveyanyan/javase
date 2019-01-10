package 循环;

/**
 * @author yj
 * @date: 2019/1/7
 * @time: 16:25
 * @Description:
 */
public class LoopTest {
    public static void main(String[] args) {
        a:
        for (int i = 1; i < 10; i++) {
            System.out.println("i = " + i);
            b:
            for (int j = 1; j < 10; j++) {
                System.out.println("j = " + j);
                break ;
            }
            break ;
        }
    }
}
