import java.util.*;

class Reverce 
{
  public static void main(String args[])
    {
     int rem, rev=0;
       
     Scanner kb=new Scanner(System.in);
       
       System.out.println("Enter a number ");
       int no=kb.nextInt();
       
while(no!=0){
       rem=no%10;
       rev=rev*10+rem;
       no=no/10;
    }
System.out.println(rev);
  }
}