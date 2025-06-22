import java.util.Arrays;

public class Program15 {

    public static void main(String[] args)
    {

        int[] arr={1,2,3,4,5};
        ArrayRotation obj = new ArrayRotation();
        obj.ArrayRotationbyKpositions(arr,3);

    }
}
class ArrayRotation
{
    void ArrayRotationbyKpositions(int[] arr,int k)
    {

        int n=arr.length;
        k = k % n;    // Important to handle k > n

        // Step 1 Reverse the whole array
        reverse(arr,0,n-1);

        //Step 2 Reverse the first k positions
        reverse(arr,0,k-1);

        //Step 3 Reverse the remaining elements
        reverse(arr,k,n-1);

        for(int num:arr)
        {
            System.out.print(num+" ");
        }


    }
    void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
