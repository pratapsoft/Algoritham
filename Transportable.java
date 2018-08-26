package CH02;
/** interface for objects that can be transported. */

public interface Transportable {

    /** Weight in grams */
    public int weight();

    /** whether the object is hazardous */
    public boolean isHazardous();
}
