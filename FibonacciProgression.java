package CH02;

/**
 * Fibonacci progression
 */

public class FibonacciProgression extends Progression{

    /** Previous value */
    long prev;
    // inherit variable first and cur.

    /** Default constructor setting 0 and 1 as the first two values. */

    FibonacciProgression(){
        this(0, 1);
    }

    /** Parametic constructor providing the first and second values.
     *
     * @param value1 first value.
     * @param value2 second value.
     */
    FibonacciProgression(long value1, long value2){
        first = value1;
        prev = value2 - value1; // fictitions value preceding the first
    }
    /**Advances the progression by adding the previous value to the current value.
     *
     * @return next value of the progression
     */

    protected long nextValue(){
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}
