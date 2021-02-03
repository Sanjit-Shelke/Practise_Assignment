import java.util.Scanner;

public class Que11_ReverseNumber {
    public static void main(String[] args) {

        int num, mod;
        int rev = 0;

        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        scanner.close();

        while (num > 0) {

            mod = num % 10;
            num = num/10;
            rev = (rev * 10) + mod;

        }
        System.out.println("Reverse Number = "+ rev);
    }
}