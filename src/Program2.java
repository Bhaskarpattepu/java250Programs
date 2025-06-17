import java.util.Locale;

public class Program2 {

public static void main(String[] args)
{
    Palindromecheck palindrome = new Palindromecheck();
    String palindromestring = "Madam";
   boolean check = palindrome.palindromecheck(palindromestring.toLowerCase());
   if(check)
   {
       System.out.println(palindromestring+" is palindrome");
   }
   else
       System.out.println(palindromestring+"  is not palindrome");


}

}

class Palindromecheck
{
    boolean palindromecheck(String str)
    {
        String string =str;
        char[] characters = string.toCharArray();
        int left=0;
        int right=characters.length-1;
        while (left<right)
        {
            if(characters[left]!=characters[right])
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

