import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class FurtherEnumExperiments{
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
        Seasons[] seasons = Seasons.values();
        
        for(int i = 0; i < seasons.length; i++){
            System.out.println(seasons[i]);
            
            // are they ordinal?
            /* the answer to this is yes and no
             * there is a method called ordinal()
             * that returns the numerical position 
             * of the each constant in the Enum definition
             */
            // if(seasons[i] < seasons[i + 1]){
                // System.out.println(seasons[i] + 
                // " comes before " + seasons[i + 1]);
            // }// end if
        }// end for loop


        System.out.println("end of program");
    }
}
