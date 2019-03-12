public class Constructor
{
    int x;
    Constructor()
    {
    System.out.println("Constructor called");
    x=1011;
    }
    public static void main(String[] args)
    {
    Constructor ob=new Constructor();
    System.out.println(ob.x);
    }           
}