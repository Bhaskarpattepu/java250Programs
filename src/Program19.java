import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program19 {

public static void main(String[] args)
{
    String str="bhaskar is a good boy";
    duplicatecharctersinstring obj = new duplicatecharctersinstring();
    obj.printduplicates(str);
}


}
class duplicatecharctersinstring
{
    void printduplicates(String str1)
    {
        String str = str1.replaceAll("\\s","");
        char[] chars = str.toCharArray();
        Set<Character> checkset = new LinkedHashSet<>();
        Set<Character> duplicates=new HashSet<>();

        for(char character:chars)
        {
            if(!checkset.add(character))  //checking that if char is adding into set it is unique
            {
                duplicates.add(character);
            }
        }
        for(char c : duplicates)
        {
            System.out.print(c +" ");
        }
    }
}
