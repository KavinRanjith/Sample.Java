//Example1 starts...
class Jeffrey
{
    String Employee = "Raja from (Exp also jef) SWT";
}

class SWT extends Jeffrey
{
    String Employee = "Mani,gokul,pavan from SWT";
//    String Employee = "Raja Also jeffry and SWT";
}
//Example 1 ends...

//Example2 starts...
class A{
    {
        System.out.println(1);
    }
}
class B extends A
{
    {
        System.out.println(2);
    }
}
class C extends B
{
    {
        System.out.println(3);
    }
}
//Exaple2 ends...

//Example 3
class X
{
    String s = "Class X";
}
class  Y extends X
{
    String s = "Class Y";
    {
        System.out.println(super.s);
    }
}
class Z extends Y
{
 String s = "Class Z";
    {
        System.out.println(super.s);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Jeffrey a = new SWT();   //Example1 starts...

        System.out.println(a.Employee);

        SWT a1 = new SWT();
        System.out.println(a1.Employee); //Example 1 ends...

        C c = new C(); //Example 2

        Z z = new Z(); //example3
        System.out.println(z.s); //without using super key in  class initialization  it getting same o/p...
    }
}