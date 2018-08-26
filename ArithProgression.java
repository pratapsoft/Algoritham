package CH02;

/**
 * class for arithmatic progressions, which inherit from the general progresson
 */

/**
 * Arithmetic progression
 */
public class ArithProgression extends Progression{

    /** Increment. */
    protected long inc;

    // Inherits variables first and cur.

    /** Default constructor setting a unit increment. */
    ArithProgression(){
        this(1);
    }

    /** Parametric constructor providing the inc. */
    ArithProgression( long increment){
        inc = increment;

    }

    /**
     * Advances the progression by adding the increment to the current value.
     * @return next value of the progrssion
     *
     */
    protected long nextValue(){
        cur += inc;
        return cur;
    }

    // inherit method firstValur() and printProgression(int).
}
