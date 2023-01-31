import java.util.Scanner;
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
        
        //timeOfYear = Season.AUTUMN;
        //timeOfYear = SUMMER;
        
        // use Colour
        ColourII c = null;
        ColourII red = ColourII.RED;
        ColourII green = ColourII.GREEN;

        System.out.println(red == green);

        Season s = Season.WINTER;
        s = Season.SUMMER;

        // some errors
        //c = Colour.Purple;
        //c = "Purple";
        //c = Colour.BLEU;

        // get an array of Colour values
        ColourII[] colours = ColourII.values();
        System.out.println(colours.length);
        System.out.println(colours[0].name());

        // travers the enum using .values()
        for(ColourII cl : colours)
            System.out.println(cl);

        System.out.println(c);
        c = ColourII.RED;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = ColourII.GREEN;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = ColourII.BLUE;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling()); 

        /* *** using the more complex Element enum *** */
        Element e = Element.HE;         // helium
        System.out.println(e);

        Element[] elements = Element.values();
        System.out.println(elements.length);
        System.out.println(elements[2]);

        for(Element el : Element.values())
            System.out.println(el);
            
        

        System.out.println("end of program");
    }
}
