public class Program10 {
    //10. Write a Java program to print the ASCII value of a character.
    public static void main(String[] args)
    {
        PrintingAsciivalueofCharacter asci = new PrintingAsciivalueofCharacter();
        System.out.println(asci.Ascivalueofchar('b'));
    }


}
class PrintingAsciivalueofCharacter
{

    int Ascivalueofchar(char ch)
    {
        return (int)ch;
    }
}
