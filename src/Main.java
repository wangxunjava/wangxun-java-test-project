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

        int a2 = 2;
        int b2 = 5;
        boolean result2 = ((a > b) && (a != b));
        boolean result3 = ((a > b) || (a != b));
        System.out.println(result2);
        System.out.println(result3);

        byte mybyte2 = 127;
        int myint2 = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println("byte 型与 float 型数据进行运算结果为："
         + (mybyte2 + myfloat));
        System.out.println("byte 型与 int 型数据进行运算结果为："
         + (mybyte2 * myint2));
        System.out.println("byte 型与 char 型数据进行运算结果为："
         + (mybyte2 / mychar));
        System.out.println("double 型与 char 型数据进行运算结果为："
         + (mydouble + mychar));

        //注释内容
        /*
        注释内容 1
        注释内容 2
        ···
         */

        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b3;
            {
                b3 = y > z;
                System.out.println(b3);
            }
        }
        String word3 = "hello java";
        System.out.println(word3);

        int x2 = 45;
        int y2 = 12;
        if (x2 > y2) {
            System.out.println("变量 x 大于变量 y");
        }
        if (x2 < y2) {
            System.out.println("变量 x 小于变量 y");
        }

        int math = 95;
        int english = 56;
        if (math > 60) {
            System.out.println("数学及格了");
        } else {
            System.out.println("数学没有及格");
        }
        if (english > 60) {
            System.out.println("英语及格了");
        } else {
            System.out.println("英语没有及格");
        }

        int x3 = 20;
        if (x3 > 30) {
            System.out.println("x3 的值大于 30");
        } else if (x3 > 10) {
            System.out.println("x3 的值大于 10，但小于 30");
        } else if (x3 > 0) {
            System.out.println("x3 的值大于 0，但小于 10");
        } else {
            System.out.println("x3 的值小于 0");
        }

        String str="明日科技";
        switch (str){
            case "明日":
                System.out.println("明日图书网 www.mingribook.com");
                break;
            case "明日科技":
                System.out.println("吉林省明日科技有限公司");
                break;
            default:
                System.out.println("以上条件都不是。");
        }

        int week = 2;
        switch(week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Sorry,I don't Know");
                break;
        }

        int x4 = 1;
        int sum = 0;
        while (x4 <= 10) {
            sum = sum + x4;
            x4++;
        }
        System.out.println("sum = " + sum);

        System.out.println("本程序将在1分后终止运行");
        TimeUnit.MINUTES.sleep(1);//分
    }
}