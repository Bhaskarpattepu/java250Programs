public class Program14 {

    //14. Write a program to find the missing number in an array of 1 to N.

    public static void main(String[] args)
    {
        int[] arr={1,2,3,5,6};
        findmissinginarray obj = new findmissinginarray();
        obj.findingmissinginarrayin1toN(arr);
    }
}
class findmissinginarray
{
    void findingmissinginarrayin1toN(int[] arr)
    {
        int n = arr.length+1;
        int totalSum=n*(n+1)/2;
        int arraysum=0;
        for(int num:arr)
        {
            arraysum+=num;
        }
        int missingnum=totalSum-arraysum;
        System.out.println(missingnum);
    }
}

