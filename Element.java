
/**
 * Enumeration class Element - just an example using the first few elements on the periodic table
 *                              each value has the table symbol, the name of the element,
 *                              the atomic weight and the atomic number.
 *
 * @author Sveinson
 * @version 2.0
 */
enum Element{
    H("H", "Hydrogen", 1, 1.008), HE("He", "Helium", 2, 4.0026), 
    LI("Li", "Lithium", 3, 6.94), BE("Be", "Beryllium", 4, 9.0122), B("B", "Boron", 5, 10.81), 
    C("C", "Carbon", 6, 12.011);
    
    private String symbol;
    private  String friendlyName;
    private  int atomicNumber;
    private double atomicWeight;
    
    /* Contructor 
     * note the constructor is private
     */
    private Element(String s, String n, int num, double w){
        symbol = s;
        friendlyName = n;
        atomicNumber = num;
        atomicWeight = w;
    }// end constructor
    
    /* *** getters *** */
    public String getSymbol(){
        return symbol;
    }
    
    public String getName(){
        return friendlyName;
    }
    
    public int getAtomicNumber(){
        return atomicNumber;
    }
    
    public double getAtomicWeight(){
        return atomicWeight;
    }
    
    @Override
    public String toString(){
     StringBuilder st = new StringBuilder();
     
     // what's the problem with the following 2 lines of code?
     // how could we make this code better?
     
     st.append(this.name() + ", " + this.symbol + ", " + this.friendlyName + ", "); 
     st.append(this.atomicNumber + ", " + this.atomicWeight);
     
     return st.toString();
    }
    
}// end enum Element
