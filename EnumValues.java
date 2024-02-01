/**
 * Use values() to get the enum values
 */
public class EnumValues
{
    public static void main(String[] args){
        Colour c = Colour.RED;
        System.out.println(c);
        //Season s = Season.FALL;
        Day[] daysOfWeek = Day.values();
        
        System.out.println("Days of the week:");
        
        for (Day d: daysOfWeek)
            System.out.println(d);
            
        // for(Day d: Day.values())
            // System.out.println("other " + d);
    }
}
