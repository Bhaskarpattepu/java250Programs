public class Program8 {
    public static void main(String[] args)
    {
        Swapping swap = new Swapping();
        swap.swappingwithouttemp(2,4);
        swap.swappingwithtemp(2,4);

    }


}
class Swapping
{
    void swappingwithtemp(int a , int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping of a and b values are "+a+" "+b);

    }
    void swappingwithouttemp(int a ,int b)
    {

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping of a and b values are "+a+" "+b);
    }
}
