import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) 
    {
    Scanner myinput=new Scanner(System.in);
    int num,rem,rev=0;
    System.out.println("Enter Number");
    num=myinput.nextInt();
    while(num>0)
    {
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
       
    }
    System.out.println(rev);
}
}
 