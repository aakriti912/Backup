class Exc1
{
  public static void main(String args[])
  {
    try{
    int a=0;
    int b=10/a;
    System.out.println(b);
    System.out.println("Inside try");
    }
    catch(ArithmeticException e){
      System.out.println("Divide by zero");
    }
    System.out.println("With exception handling");
  }
}