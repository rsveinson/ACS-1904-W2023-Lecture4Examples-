import java.util.Scanner;
/**
 * Calculate gross for a specific rate, hours, day
 * 
 */public class CalculatePayForEnhancedDay
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter rate hours day:");
        double rate = kb.nextDouble();
        int hours   = kb.nextInt();
        
        EnhancedDay day = EnhancedDay.valueOf(kb.next().toUpperCase());
        
        System.out.println("gross is $" + calcPay(rate, hours, day));
    }
    private static double calcPay(double rate, int hours, EnhancedDay day){
        double gross;
        
        //Double time on weekend
        if (day.isWeekend()) 
            gross = 2 * rate*hours;
        else
            gross = rate * hours;
        return gross;
    }
}
