//Example 1
interface P
{
    String p = "pppp";
    String methodP();
}

interface Q extends P
{
    String q = "QQQQ";
    String methodQ();
}

class R implements P, Q
{
    public String methodP()
    {
        return p+q;
    }
    public String methodQ()
    {
        return q+p;
    }
}

//Example 2
class A implements B
{
    public int methodB(int i)
    {
        return i =+ i*i;
    }
}
interface B
{
    int methodB(int i);
}

//Example 3:How do you access interface field ‘i’ in the below code?
class X
{
    interface Y
    {
        int i = 111;
    }
}
public class Main {
    public static void main(String[] args)
    {
     R r = new R();  //Example 1
        System.out.println(r.methodP());
        System.out.println(r.methodQ());

     B b = new A();  //Example 2
        System.out.println(b.methodB(2));

        System.out.println(X.Y.i);  //Example 3
    }

}