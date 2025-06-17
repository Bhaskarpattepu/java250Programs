public class Program4 {

public static void main(String[] args )
{
    int n =11;
    primecheckandnthprime obj = new primecheckandnthprime();
    boolean isprime = obj.primecheck(n);
    if (isprime)
        System.out.println(n + " is prime");
    else
        System.out.println(n+" is not prime");
    int j = obj.nthPrime(8);
    System.out.println(j);
}

}

class primecheckandnthprime
{
    boolean primecheck(int n)
    {
        boolean flag=true;
        for(int i=2;i<= Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
               return false;
            }
        }
        return true;
         }


    int nthPrime(int m)
    {
        int count=0;
        int i=2;
        int nthprime;
        while (count<m)
        {

            if(primecheck(i))
            {
                count++;

            }
            i++;
        }
      return i-1;
    }
}
