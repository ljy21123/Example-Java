import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int input1 = 0;
        int input2 = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        Scanner sc = new Scanner(System.in);

        input1 = sc.nextInt();
        input2 = sc.nextInt();

        one = (input1 * (input2 % 10));
        two = (input1 * (input2 % 100));
        three = (input1 * (input2 / 100));
        four = one + two + three;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        sc.close();
    }
}
