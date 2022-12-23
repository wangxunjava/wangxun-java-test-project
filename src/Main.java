import java.util.concurrent.TimeUnit;

public class Main {
    static int times = 3;
    static String s1 = "你好";
    public static void main(String[] args) throws InterruptedException {
        String s2 = "Java";
        System.out.println(s1);
        System.out.println(s2);

        byte mybyte = 124;
        short myshort = 32564;
        int myint = 45784612;
        long mylong = 46789451;
        long result = mybyte + myshort + myint + mylong;
        System.out.println("结果为：" + result);

        char word = 'd', word2 = '@';
        int p = 23045, p2 = 45213;
        System.out.println("d在 unicode 表中的顺序位置是：" + (int) word);
        System.out.println("@在 unicode 表中的顺序位置是：" + (int) word2);
        System.out.println("unicode 表中的第 23045 位是：" + (char) p);
        System.out.println("unicode 表中的第 45213 位是：" + (char) p2);

        int times = 4;
        System.out.println("times 的值为：" + times);

        int a, b, c;
        a = 15;
        c = b = a + 4;
        System.out.println("c 值为：" + c);
        System.out.println("b 值为：" + b);

        float number1 = 45.56f;
        int number2 = 152;
        System.out.println("和为：" +( number1 + number2));
        System.out.println("差为：" + ( number2-number1));
        System.out.println("积为：" + number1 * number2);
        System.out.println("商为：" + number1 / number2);

        int number3 = 4;
        int number4 = 5;
        System.out.println("number3>number4 的返回值为：" + (number3 > number4));
        System.out.println("number3< number4 的返回值为：" + (number3 < number4));
        System.out.println("number3==number4 的返回值为：" + (number3== number4));
        System.out.println("number3!=number4 的返回值为：" + (number3 != number4));
        System.out.println("number3>= number4 的返回值为：" + (number3 >= number4));
        System.out.println("number3<=number4 的返回值为：" + (number3 <= number4));
        
        System.out.println("本程序将在1分后终止运行");
        TimeUnit.MINUTES.sleep(1);//分
    }
}