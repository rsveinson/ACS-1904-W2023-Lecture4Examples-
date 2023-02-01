import java.util.Scanner;
/**
 * Calculate gross for a specific rate, hours, day
 * 
 */public class CalculatePayForOneDay
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter rate and hours and day:");
        double rate = kb.nextDouble();
        int hours = kb.nextInt();
        
        // the day as a string
        String dayStr = kb.next();
        //String dayStr = kb.next().toUpperCase();
        
        // the day as an enum constant
        Day day = Day.valueOf(dayStr);      // remember that the variable day can
                                            // only take on the values allowed by
                                            // the enum definition
        System.out.println("gross is $" + calcPay(rate, hours, day));
    }
    private static double calcPay(double rate, int hours, Day day){
        double gross;
        
        if (day==Day.SATURDAY || day==Day.SUNDAY)
            gross = 2 * rate * hours;
        else
            gross = rate * hours;
        return gross;
    }
}
