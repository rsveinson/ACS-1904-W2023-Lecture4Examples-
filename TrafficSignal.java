
/**
 * Enumeration class TrafficSignal - type for each of the states of a traffic light
 *
 * @author SVeinson
 * @version 1.0
 */
public enum TrafficSignal
{
    RED("Stop", 240), YELLOW("Slow Down", 4), GREEN("Go", 10);
    
    private String action;
    private int duration;
    
    private TrafficSignal(String a, int d){
        action = a;
        duration = d;
    }// end constructor
}
