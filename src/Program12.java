import java.util.*;

public class Program12 {
    public static void main(String[] args)
    {

        int[] arr={1,2,3,4,1,2,3,4};
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.RemoveDuplicate1(arr);
        obj.RemoveDuplicate2(arr);
        obj.RemoveDuplicatesBruteforce(arr);
    }
}
class RemoveDuplicates
{
    void RemoveDuplicate1(int[] arr)
    {

        Set<Integer> set = new LinkedHashSet<>();

        for(int num:arr)
        {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i=0;
        for(int num:set)
        {
            int j =i++;
            result[j]=num;
            System.out.print(" "+result[j]);
        }

        System.out.println();

    }

    //If Order is not mandatory and user can sort and compare and remove duplicates

    void RemoveDuplicate2(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j++]=arr[i];
            }
        }
       int[] result = Arrays.copyOf(arr,j);
        System.out.println(Arrays.toString(result));

    }

    //BruteForce

    void RemoveDuplicatesBruteforce(int[] arr)
    {
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   flag=false;
                   break;
                }
            }
            if(flag)
            {
               arr[k++]=arr[i];
            }
        }
        int[] result =Arrays.copyOf(arr,k);
        System.out.println(Arrays.toString(result));
    }


}