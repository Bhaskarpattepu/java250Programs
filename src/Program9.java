public class Program9 {
    public static void main(String[] args) {

        /*
        A leap year exists to correct the fact that Earth takes about 365.2425 days to orbit the Sun,
        not exactly 365. To realign our calendar with the seasons, we add an extra day (Feb 29) every 4 years.
        However, this overcompensates slightly, so we skip leap years every 100 years (e.g., 1900, 2100).
        But to balance that, years divisible by 400 (like 1600 and 2000) are leap years. The rule: a year is a
        leap year if it is divisible by 4, not by 100 unless also divisible by 400.
         */
        CheckLeapyear leapyear = new CheckLeapyear();
        leapyear.checkleapyear(2000);
        leapyear.checkleapyear(1900);

    }

}
    class CheckLeapyear
    {
        void checkleapyear(int leapyear)
        {

            if((leapyear%4==0 && leapyear%100!=0) || leapyear%400==0)
            {
                System.out.println(leapyear+" is leapyear");
            }
            else
                System.out.println(leapyear+" is not leapyear");


        }
    }



