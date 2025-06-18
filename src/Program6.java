import java.util.Map;

public class Program6 {

   public static void main(String[] args)
   {
       GCDOfTwonumbers gcd = new GCDOfTwonumbers();
       System.out.println(gcd.GCDoftwonumbers(9,2));
       System.out.println(gcd.GCDoftwonumbers1(9,2));
   }
}

class GCDOfTwonumbers
{
    int GCDoftwonumbers(int n,int m)
    {
        //In naive approach we have to check min of both number to until 1 so it is not a good approach
        int result = Math.min(n,m);
        while (result>0) {
            if (n % result == 0 && m % result == 0) {
                break;
            }
            result--;
        }
        return result;

    }

    int GCDoftwonumbers1(int n,int m)
    {
        if(m==0){
            return n;
        }

        return GCDoftwonumbers1(m,n%m);
    }
}
