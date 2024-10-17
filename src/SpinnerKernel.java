import components.map.Map;
import components.map.Map2;

public class SpinnerKernel<K, V> extends Map2<K, V> {
    //NOTES: Within the sphere of Map, is there a way
    //to hard-code the data type of the value to make sure that it
    //is an Integer? Or is there an alternative way to keep count of the
    //"size of each slice"?

    //Also, @Override makes it so the compiler picks the correct method, right?

    //build this on top of Map
    //Is this an ok way to approach building this component, or is there a
    //better way?

    //Should I just do the NoteCard component instead?

    //I think this would be similar to a linked array, where one holds the
    //values of the user and the other holds a counter of it.

    //I don't know how effecient this will be oops.

    //these should not be within kernel but in secondary I think.
    //I need to study up my chart of extends and implements.

    /*
     * Kernel methods ---------------------------------------------------------
     */

    //instance that the slice value has not been seen yet, given a value
    @Override
    public final void addSlice(K key, V value) {
        assert key != null : "Violation of: key is not null";
        assert value != null : "Violation of: value is not null";
        assert !this.hasKey(key) : "Violation of: key is not in DOMAIN(this)";

        this.Spinner.add(key, value);
    }

    //instance that the slice value has not seen, given a value
    @Override
    public final void addSlice(K key, V value) {
        assert key != null : "Violation of: key is not null";
        assert value != null : "Violation of: value is not null";
        assert !this.hasKey(key) : "Violation of: key is not in DOMAIN(this)";

        Map.Pair<K, V> increment = this.Spinner.remove(key);
        V newValue = increment.value() + value;
        this.Spinner.add(increment.key(), newValue);
    }

    //instance that key has not been seen yet, not given a value
    @Override
    public final void addSlice(K key) {
        assert key != null : "Violation of: key is not null";
        assert !this.hasKey(key) : "Violation of: key is not in DOMAIN(this)";

        this.Spinner.add(key, 1);
    }

    //instance that key has been seen, not given a value
    @Override
    public final void addSlice(K key) {
        assert key != null : "Violation of: key is not null";
        assert this.hasKey(key) : "Violation of: key is in DOMAIN(this)";

        Map.Pair<K, V> increment = this.Spinner.remove(key);
        V newValue = increment.value() + 1;
        this.Spinner(increment.key(), newValue);
    }

    //reduce slice by one
    @Override
    public final Pair<K, V> reduceSlice(K key) {
        assert key != null : "Violation of: key is not null";
        assert this.hasKey(key) : "Violation of: key is in DOMAIN(this)";

        Pair<K, V> returnPair = this.Spinner.remove(key);
        Value newValue = returnPair.value() - 1;
        if(!newValue.equals(0)) {
            //does not removes completely
            this.Spinner.add(returnPair.key(), newValue);
        }
        return (returnPair.key(), newValue);
    }

    //reduce slice by a given value
    @Override
    public final Pair<K, V> reduceSlice(K key, V value) {
        assert key != null : "Violation of: key is not null";
        assert value <= this.remove(key).value() : "Violation of: value removed is too large"
        assert this.hasKey(key) : "Violation of: key is in DOMAIN(this)";

        Pair<K, V> returnPair = this.Spinner.remove(key);
        Value newValue = returnPair.value() - value;
        if(!newValue.equals(0)) {
            //does not removes completely
            this.Spinner.add(returnPair.key(), newValue);
        }
        //returns the updated value in the spinner. if 0, it is removed completely
        return (returnPair.key(), newValue);
    }

    //remove Slice completely
    @Override
    public final Pair<K, V> removeSlice(K key) {
        assert key != null : "Violation of: key is not null";
        assert this.hasKey(key) : "Violation of: key is in DOMAIN(this)";

        return this.Spinner.remove(key);
    }

    //Spin decrements the highest slice by one, if two slices have the same
    //value, compares those with the same values and chooses the "largest"
    //key value. uses comparator.
    //THIS MUST BE WORKED ON
    //these methods are MESSED UP
    @Override
    public final Pair<K, V> spin() {
        assert this.size() > 0 : "Violation of: this /= empty_set";

        Map<K, V> hold = new Map2<K,V>;
        int size = this.Spinner.size();
        //size cannot be less than 0, or it would not exist
        V largest = -1;
        K slice = null;
        Map.Pair<K, V> returnPair = <null, null;
        for(int i = 0; i < size; i++) {
            Map.Pair<K, V> remove = this.Spinner.removeAny();
            if(remove.value() >= largest) {
                largest = remove.value();
                slice = remove.key();
                returnPair = <remove.key(), remove.value()>;

            }
            hold.add(remove);
        }
        //do NOT depend on other methods.
        hold.value.(slice).reduceSlice();

        for(int j = 0; j < size; j++) {
            this.Spinner.add(hold.removeAny())
        }
        return returnPair;
    }

    @Override
    public final V value(K key) {
        assert key != null : "Violation of: key is not null";
        assert this.hasKey(key) : "Violation of: key is in DOMAIN(this)";

        return this.Spinner.value(key);

    }

    @Override
    public final boolean hasKey(K key) {
        assert key != null : "Violation of: key is not null";

        return this.Spinner.hasKey(key);
    }

    @Override
    public final int uniqueSlices() {
        return this.Spinner.size();
    }

}
