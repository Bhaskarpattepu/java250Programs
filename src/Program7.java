public class Program7 {
    public static













































































































































    void main(String[] args)
    {
        largestoftwoandThree greatest = new largestoftwoandThree();
        greatest.largestofthree(5,7,1);
        greatest.greatestoftwo(6,2);
    }

}

class largestoftwoandThree
{
    void largestofthree(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a + " is greatest of three");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greatest of three");
        }
        else
            System.out.println(c+"is greatest of three");
    }

    void greatestoftwo(int a,int b)
    {
        if(a>b)
            System.out.println(a+"is greatest of two");
        else
            System.out.println(b+"is greatest of two");
    }
}
