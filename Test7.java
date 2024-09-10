import java.util.Scanner;

class Test7{
 
        public static void main(String [] args)
       {
         Scanner kb=new Scanner(System.in);
         String str;
   
        System.out.println("Enter a character");
        str=kb.nextLine();
        char ch;
        ch=str.charAt(0);

        System.out.println("you entered: "+ch);
        System.out.println("Its Unicode is: "+(int) ch);
       }
}