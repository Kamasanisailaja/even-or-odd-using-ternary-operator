import java.util.*;
class Evenodd
{
    public static void main(String args[])
    {
        int a,c;
        String b;
        System.out.println("Enter the value of a");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       b= a%2==0? "even":"odd";
       System.out.println("The given number is  "+b);
    }
}