public class Program13 {
    public static void main(String[] args)
    {
        int[] arr={4,2,8,1,3,6};
        BubbleSort obj = new BubbleSort();
        obj.bubblesort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
class BubbleSort
{
    void bubblesort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++)
            {

                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}