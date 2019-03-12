class A
{
    public void Car()
     {
      System.out.println("Audi car");  
     }
    
}
class B extends A
    {
        public void Bike()
        {
            System.out.println("Duke bike");
        }
    }
    class C extends B
    {
        public void Cycle()
        {
            System.out.println("HERO CYCLE");
        }
    }
    
public class Multilevelinh
{
    public static void main(String[] args) 
    {
        C ob=new C();
        ob.Car();
        ob.Bike();
        ob.Cycle();
    }
}
