class Swap
{
    public static void main(String args[])
    {

      int a=1;
      int b=7;

      System.out.println("Before swapping");
      System.out.println(a);
      System.out.println(b);

      a=a+b;
      b=a-b;
      a=a-b;

      System.out.println("After swapping");
      System.out.println(a);
      System.out.println(b);
     }
}