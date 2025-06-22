import java.util.Arrays;

public class Program18 {

    //Two strings are Anagram conditions are
    //Lengths should equal
    //Character frequency must match
    public static void main(String[] args)
    {

        String str1="listen";
        String  str2="silent";
        checkAnagram obj = new checkAnagram();
        boolean bool = obj.checkAnagram(str1,str2);
        if(bool)
            System.out.println("Two strings are anagram");
        else
            System.out.println("Two are not anagram");
    }

}

class checkAnagram
{
    boolean checkAnagram(String str1,String str2)
    {

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return (Arrays.equals(chars1,chars2));

    }
}
