//Thrown 'Hierarchy of the type Spinner is inconsistent' uhhhhhh
public interface Spinner<Slice>
        extends Comparable<Spinner<Slice>>, SpinnerKernel1<Slice> {

    //representation could be a Sequence of my custom
    //Slice objects (literally just what Jeremy told me lol but that makes sense)

    //All makes very much sense to me conceptually, but I def need to figure
    //out how to implement my big kicker of spin properly.
    //The way I am thinking in my head is a "weighted removeAny" type of thing
    //This will be random, not arbitrary though, so I gotta
    //a. figure out if random is allowed in something like this
    //b. figure out how I would implement
    //(if build on sequence, can access different indexes and randInt to pick)
    //having a fun time though this project is really fun and cool!

    interface Slice<key, value> {
        /*
         * Private members
         * --------------------------------------------------------
         */
        //both these methods are referenced from/based on Map.Pair<K,V>
        /**
         * Returns this {@code Slice}'s key.
         *
         * @return the key
         * @aliases reference returned by {@code key}
         */
        String key();

        /**
         * Returns this {@code Slice}'s value.
         *
         * @return the value
         * @aliases reference returned by {@code value}
         */
        Integer value();
    }

    /**
     * Removes random? (try to make it a sort of weighted wheel dependent on
     * Slice values) element from {@code this}, and returns it. Is random
     * allowed?
     *
     * @return the element removed
     * @updates this
     * @requires |this| > 0
     * @ensures <pre>
     * this = #this \ {x}  and
     * remove = x
     * #this.value = this.value - 1
     * </pre>
     */
    String spin();

    //Reduces the given slice value by an int i
    /**
     * Removes {@code x} from this, and returns it.
     *
     * @param x
     *            the element to be removed
     * @return the element removed
     * @updates this
     * @requires x is in this this.value >= i;
     * @ensures <pre>
     * this = #this \ {x}  and
     * remove = x
     * #this.value = this.value - i
     * </pre>
     */
    String reduceSlice(String x, int i);

    /**
     * Increments {@code x} by a value pf {@code i}.
     *
     * @param x
     *            the Slice value to be added
     * @requires x is in this
     * @updates this.value
     * @ensures this = #this this.value = #this.value + i
     */
    void increaseSlice(String x, int i);

    /**
     * Reports the chances to land of {@code x}
     *
     * @param x
     *            the Slice value to found the odds for
     * @requires x is in this
     * @ensures this = #this
     */
    double odds(String x);

}
