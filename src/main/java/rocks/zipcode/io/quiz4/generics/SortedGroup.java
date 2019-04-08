package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {

    public SortedGroup(){
        super();
    }

    @Override
    public void insert(_ value) {
        super.insert(value);
        Collections.sort(list);
    }

    @Override
    public void delete(_ value) {
        super.delete(value);
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
