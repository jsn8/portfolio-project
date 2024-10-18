import components.standard.Standard;

//I don't know why my Standard isn't being imported :(
public interface SpinnerKernel1<Slice>
        extends Standard<Spinner<Slice>>, Iterable<Slice> {

    //Kernel methods for data struct: add stuff, remove stuff, how many stuff
    // (stuff exists?)
    //based on Set kernel methods.

    //With add, I want to make it so addSlice can be called to either
    //create a completely new slice, or increment a pre-existing slice
    //will figure out how to write as method header and then override this
    //method properly
    /**
     * Adds {@code x} to this.
     *
     * @param x
     *            the Slice value to be added
     * @aliases reference {@code x}
     * @updates this
     * @ensures this = #this union {x}
     */
    void addSlice(String x);

    //Removed the entire slice. Enhanced interface can use kernel methods to
    //decrement a slice individually
    /**
     * Removes {@code x} from this, and returns it.
     *
     * @param x
     *            the element to be removed
     * @return the element removed
     * @updates this
     * @requires x is in this
     * @ensures <pre>
     * this = #this \ {x}  and
     * remove = x
     * </pre>
     */
    String removeSlice(String x);

    //number of unique sliced in the spinner, size
    /**
     * Reports size (cardinality) of {@code this}.
     *
     * @return the number of elements in {@code this}
     * @ensures size = |this|
     */
    int uniqueSlices();
}
