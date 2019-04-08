package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class   ComparableTreeSet<_ extends Comparable> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>>{

    _[] arr;

    public ComparableTreeSet(_... arr) {
        this.arr = arr;
        Arrays.sort(this.arr);
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return this.arr[0].compareTo(o.arr[0]);
    }


    public String toString(){
        return Arrays.toString(arr);
    }
}
