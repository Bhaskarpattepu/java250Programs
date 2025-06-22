public class Program17 {
    public static void main(String[] args)
    {

        String str= "Bhaskar is good boy";
        numberofVowelsandConsonants obj = new numberofVowelsandConsonants();
        obj.noofVowelsandConsonants(str);
    }
}

class numberofVowelsandConsonants
{
    void noofVowelsandConsonants(String str)
    {
        str.toLowerCase();
        int vowel=0;
        int consonant=0;
        char[] characterarray = str.toCharArray();
        for(char character : characterarray )
        {
            if(character=='a'||character=='e'||character=='i'||character=='o'|| character=='u')
            {
                vowel++;
            }
            else
                consonant++;

        }
        System.out.println("Number of vowels "+vowel);
        System.out.println("Number of consonants " + consonant);

    }
}