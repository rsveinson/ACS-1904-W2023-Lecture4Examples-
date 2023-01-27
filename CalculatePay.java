/**
 * Show gross pay for different days
 * 
 */public class CalculatePay
{
    public static void main(String[] args){
        for (Day d: Day.values())
            System.out.println("$" + calcPay(10.0, 20, d) + " for " + d);
    }
    
    private static double calcPay(double rate, int hours, Day day){
        double gross;
        
        if (day == Day.SATURDAY || day == Day.SUNDAY)
            gross = 2 * rate * hours;
        else
            gross = rate * hours;
        return gross;
    }
}
