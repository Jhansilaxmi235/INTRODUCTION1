package javaclasses;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(5/0);
        }catch(ArithmeticException ae)
        {
            //System.out.println(5/1);
            try {
                System.out.println(5/0);
            }
            catch (Exception e)
            {
                try {
                    System.out.println(5 / 0);
                }catch(Exception pe){
                    System.out.println("Handled");
                }

            }
        }catch(NullPointerException a)
        {
            System.out.println("sd");
        }
        System.out.println("jhansi");
    }
}
