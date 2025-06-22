import java.util.LinkedHashMap;
import java.util.Map;

public class Program20 {
    //20. Write a Java program to count the frequency of characters in a string.
    public static void main(String[] args)
    {
        String str ="bhaskar is good boy";
        FrequencyOfCharacterInString obj = new FrequencyOfCharacterInString();
        obj.frequencyofchar(str);
    }
}
class FrequencyOfCharacterInString
{
    void frequencyofchar(String str1)
    {
        String str = str1.replaceAll("\\s","");//Replacing Spaces with empty string
        char[] chars=str.toCharArray();
        Map<Character,Integer> hashmap = new LinkedHashMap<>();
        for(char character:chars)
        {
            hashmap.put(character,hashmap.getOrDefault(character,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : hashmap.entrySet())
        {
            System.out.println(entry.getKey()+"==>"+entry.getValue());

        }



    }
}
