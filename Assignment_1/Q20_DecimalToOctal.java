import java.util.Scanner;

public class que20_DecimalToOctal {
    public static void main(String args[])
  {
    Scanner scanner = new Scanner( System.in );
    System.out.print("Enter a decimal number : ");
    int num =scanner.nextInt();
     scanner.close();
    
    int rem;
 
   
    String str=""; 
 
    char dig[]={'0','1','2','3','4','5','6','7'};
 
    while(num>0)
    {
       rem=num%8; 
       str=dig[rem]+str; 
       num=num/8;
    }
    System.out.println("Decimal to octal: "+str);
  }
}