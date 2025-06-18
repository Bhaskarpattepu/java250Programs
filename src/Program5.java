public class Program5 {

    public static void main(String[] args)
    {
        FibonacciSeriesuptoN fibonacci = new FibonacciSeriesuptoN();
        fibonacci.fobonacciseries(5);
    }


}
class FibonacciSeriesuptoN{
    void fobonacciseries(int n)
    {
        /*
        0,1,1,2,3,5,8
         */

        int p=0;
        int q=1;
        int r;
        System.out.print(p+" "+q+" ");

        for(int i =0;i<n;i++)
        {
            r=p+q;
            System.out.print(r+" ");
            p=q;
            q=r;


        }
    }
}
