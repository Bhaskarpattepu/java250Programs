import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program16 {

    //16. Write a program to find the first non-repeated character in a string.

    public static void main(String[] args)
    {

        String string ="bhaskar is a good boy";
        firstNonrepeatedCharacterinString obj = new firstNonrepeatedCharacterinString();
        char uniquechar = obj.firstuniquechar(string);
        System.out.println(uniquechar);

    }

}

class firstNonrepeatedCharacterinString
{

    char firstuniquechar(String str)
    {
     char[] chars =  str.toCharArray();
        Map<Character , Integer> map = new LinkedHashMap<>();
        for(char character:chars) {
            //count frequency of each character
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
            //Find the first character with frequency 1
            for(Map.Entry<Character,Integer> entry: map.entrySet())
            {

                if(entry.getValue()==1)
                {
                    return entry.getKey();

                }

            }
            return '\0';
        }


    }

