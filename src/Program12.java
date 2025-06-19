import java.util.*;

public class Program12 {
    public static void main(String[] args)
    {

        int[] arr={1,2,3,4,1,2,3,4,4,4};
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.RemoveDuplicate1(arr);
        obj.RemoveDuplicate2(arr);
        obj.RemoveDuplicatesBruteforce(arr);
        printDuplicates obj1 = new printDuplicates();
        obj1.printduplicatesbruteforce(arr);
        obj1.PrintDuplicateOptimized(arr);
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

    void RemoveDuplicate2(int[] arr1)
    {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        Arrays.sort(arr);
        int n = arr.length;
        int j=0;
        arr[j++]=arr[0];
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

    void RemoveDuplicatesBruteforce(int[] arr1)
    {
        int[] arr = Arrays.copyOf(arr1, arr1.length);

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

class printDuplicates
{
    void printduplicatesbruteforce(int[] arr)
    {
     int n = arr.length;
     Set<Integer> dupe = new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                 dupe.add(arr[i]);
                 break;
                }

            }

        }
        for(int k : dupe)
        {
            System.out.print(k+" ");
        }
       System.out.println();
    }


    void PrintDuplicateOptimized(int[] arr)
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupe = new LinkedHashSet<>();
        for(int n:arr)
        {
            if(!seen.add(n)) //Here n element is adding to seen set then it is unique but we need duplicate so not
            {
                dupe.add(n);
            }
        }
        for(int n:dupe)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }

}

