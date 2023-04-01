package javaclasses;

public class ConstructorsDemo
{
    public ConstructorsDemo()
    {
        System.out.println("Default constructor");
    }

    public ConstructorsDemo(String name)
    {
        this();
        System.out.println("Arg Constructor");
    }
    public static void main(String[] args)
    {
        ConstructorsDemo constructorsDemo = new ConstructorsDemo("Java");
        ConstructorsDemo constructorsDemo1 = new ConstructorsDemo();
    }
}
