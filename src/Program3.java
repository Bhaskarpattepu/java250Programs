public class Program3 {

    public static void main(String[] args)
    {
        int n=5;
        Factorial obj = new Factorial();
        obj.factorial(n);
        System.out.println("factorial of "+n+" is "+obj.factorialRecusrive(n));
    }
}
class Factorial{

    void factorial(int n)
    {
        int fact =1;
        for(int i=1;i<=n;i++)
        {
            fact =fact*i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }

    int factorialRecusrive(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*factorialRecusrive(n-1);
    }
}
