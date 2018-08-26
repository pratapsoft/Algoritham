package CH02;

/** Interface for objects that can be sold. */
public interface Sellable {

    /** description of the object */
    public String description();

    /** list price in cents */
    public int listPrice();

    /** Lowest price in cents we will accept */
    public int lowestPrice();
}
