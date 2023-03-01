import java.util.Scanner;

public class A1103348_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度：");
        double c = scanner.nextDouble();

        double f = c * 9 / 5 + 32;
        System.out.println(c + " 度攝氏溫度相當於 " + f + " 度華氏溫度。");
    }
}