import java.util.Arrays;

public class Program11 {
    public static void main(String[] args)
    {

        int[] arr={1,4,5,2,3,9,7};
        SecondlargestinArray secondlargests = new SecondlargestinArray();
        int secondlargest1 =secondlargests.secondlargestUsingbuiltin(arr);
        System.out.println(secondlargest1);
        int secondlargest2 = secondlargests.secondlargestusingoptimized(arr);
        System.out.println(secondlargest2);

    }
}

class SecondlargestinArray{


    int secondlargestUsingbuiltin(int arr[])
    {
        Arrays.sort(arr);
        int secondlargest=arr[arr.length-2];
        return secondlargest;
    }

    int secondlargestusingoptimized(int[] arr)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num>first)
            {
                second=first;
                first=num;
            }
            else if(num>second && num!=first)
            {
                second=num;
            }
        }
        return second;
    }

}
