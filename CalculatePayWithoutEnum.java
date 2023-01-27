/**
 * calculate gross pay 
 *   calcPay uses ints for days 
 * 
 */public class CalculatePayWithoutEnum
{
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;  
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
    
    public static void main(String[] args){
        // bad call to calcPay
        // day is out of range
        System.out.println(calcPay(10.0, 20, 99));
    }
    
    private static double calcPay(double rate, int hours, int day){
        double gross;
        
        if (day == SATURDAY || day == SUNDAY)
            gross = 2 * rate * hours;
        else
            gross = rate * hours;
        return gross;
    }
}
