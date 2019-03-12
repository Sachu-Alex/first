import java.util.Scanner;
public class Addtwo{
    public static void main(String[] args) 
    {
    Scanner myinput=new Scanner(System.in);
    int a,b,c;
    System.out.println("First Number");
    a=myinput.nextInt();
    System.out.println("Second Number"); 
    b=myinput.nextInt();
    c=a+b;  
        System.out.println(c);
    }
}