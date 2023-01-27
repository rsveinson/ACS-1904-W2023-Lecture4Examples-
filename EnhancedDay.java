/**
 * EnhancedDay is a day with 
 *   a field: weekend
 *   a constructor: sets value of weekend
 *   a method: isWeekend()
 */
public enum EnhancedDay
{
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);
    
    private boolean weekend;
    
    // private constructor must include an initializing parameter for all private fields
    private EnhancedDay (boolean indicator){
        weekend = indicator;
    }
    
    public boolean isWeekend(){
        return weekend;
    }
}
