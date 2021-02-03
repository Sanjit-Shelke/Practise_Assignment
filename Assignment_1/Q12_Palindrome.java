import java.util.Scanner;

public class que12_Palindrome {

    public static void main(String[] args) {

        int mod, sum = 0, temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        scanner.close();

        temp = num;
        while (num > 0) {
            mod = num % 10; 
            sum = (sum * 10) + mod;
            num = num / 10;
        }
        
        if(temp == sum)    
	        System.out.println("palindrome number ");    
       else    
       		System.out.println("not palindrome");   
    }
}