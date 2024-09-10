class Test3 {

public static  void main(String args[])
{
    String s1=new String("Bhopal");
    String s2=new String("Bhopal");

    System.out.println(s1);
    System.out.println(s2);
    boolean ans;
    
    ans=s1.equalsIgnoreCase(s2);
    System.out.println(ans);
       }
}