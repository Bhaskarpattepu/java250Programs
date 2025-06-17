public class program1 {

    public String ReverseString(String str)
    {
        String string = str;
        /*
        StringBuilder strbuilder = new StringBuilder(string);
        return new String(strbuilder.reverse());
         */

        //Two pointer
        char[] eachchar =string.toCharArray();
        int left=0;
        int right=eachchar.length-1;
        while(left<right)
        {
            char temp;
            temp =eachchar[left];
            eachchar[left]=eachchar[right];
            eachchar[right]=temp;
            left++;
            right--;
        }

        return new String(eachchar);

    }

}

class main
{
    public static void main(String[] args)
    {
        String word = "bhaskar is good boy";
        program1 prg = new program1();
        String reversedString = prg.ReverseString(word);
        System.out.println(reversedString);
    }
}
