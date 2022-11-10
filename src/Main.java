//Increment and Decrement

//Increment and Decrement Operator
public class Main
{
    public static void main(String[] args)
    {
        postIncrement();
        preIncrement();
        postDecrement();
        preDecrement();
    }
    // Post Increment Operator
    public static void postIncrement(){
        int i = 0;
        System.out.println(i++);
    }

    // Pre Increment Operator
    public static void preIncrement(){
        int i = 0;
        System.out.println(++i);
    }

    //Post decrement Operator
    public static void  postDecrement(){
        int i = 0;
        System.out.println(i--);
    }

    //Pre decrement Operator
    public static void preDecrement() {
        int i = 0;
        System.out.println(--i);
    }
}