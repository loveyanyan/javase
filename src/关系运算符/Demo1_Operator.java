package 关系运算符;

/**
 * @author yj
 * @date: 2018/12/28
 * @time: 21:52
 * @Description: 异或运算符
 */
public class Demo1_Operator {
    public static void main(String[] args) {
        int a = 1;
        int b = -9;
        /*System.out.println(a^b);//两边相等输出   0*/
        System.out.println(a ^ b); //先将两边的字符或数字之类的转换为二进制，当它们的二进制一致时，就会输出0，否则会将这两个二进制相加再转换为相应的字符或数字输出
        System.out.println(7 ^ 9 ^ 9);//   0111  1001    10000
        System.out.println(7 ^ 9);
        //7     00000000 0000 0111
        //9     00000000 0000 1001
        //      00000000 0000 1110   14      按着二进制位，相同为0   不同为一

    }
}

