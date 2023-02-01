import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1904 Enum supplementary example
 * Sveinson 
 */
enum ColourII{
    RED("warm"){
        @Override
        public String toString(){
            return "Red";
        }
    },
    GREEN("envious"){
        @Override
        public String toString(){
            return "Green";
        }
    }, 
    BLUE("sad"){    
        @Override
        public String toString(){
            return "Blue";
        }
    };

    private String feeling;

    private ColourII(String f){
        feeling = f;
    }// end constructor

    public String getFeeling(){
        return feeling;
    }

}// end enum Colour

public class Chapter4ExtraCodeMarkII{
    
    public enum Season{WINTER, SPRING, SUMMER, FALL};
    
    
    public static void main(String[] args) {              
        Scanner scanner = new Scanner(System.in);

        // some simple code for pp slides

        Season timeOfYear = null;
        timeOfYear = Season.FALL;
        Season s = Season.WINTER;
        s = Season.SUMMER;
        //timeOfYear = Season.AUTUMN;
        //timeOfYear = SUMMER;
        
        // use Colour
        ColourII c = null;
        ColourII red = ColourII.RED;
        ColourII green = ColourII.GREEN;

        System.out.println(red == green);

        // some errors
        //c = Colour.Purple;
        //c = "Purple";
        //c = Colour.BLEU;

        // get an array of Colour values
        ColourII[] colours = ColourII.values();
        System.out.println(colours.length);
        
        // the difference between .name() and toString();
        System.out.println("Name: " + colours[0].name());
        System.out.println("toString(): " + colours[0]);

        // travers the enum using .values()
        System.out.println();
        System.out.println("The whole list:");
        for(ColourII cl : colours)
            System.out.println(cl);

        System.out.println();
        System.out.println("the variable c why is it null?");
        System.out.println(c);
        
        System.out.println();
        System.out.println("use c by assigning a value");
        c = ColourII.RED;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = ColourII.GREEN;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = ColourII.BLUE;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling()); 

        /* *** using the more complex Element enum *** */
        System.out.println();
        System.out.println("now let's look at the Element Enum");
        Element e = Element.HE;         // helium
        System.out.println(e);

        Element[] elements = Element.values();
        System.out.println(elements.length);
        System.out.println(elements[2]);

        for(Element el : Element.values())
            System.out.println(el);
            
        // array list of enum objects?
        ArrayList<Element> list = new ArrayList<>();
        
        Element carbon = Element.C;
        list.add(carbon);
        System.out.println(list);
        

        System.out.println("end of program");
    }
}
