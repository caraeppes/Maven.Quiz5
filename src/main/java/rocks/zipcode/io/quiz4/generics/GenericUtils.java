package rocks.zipcode.io.quiz4.generics;

import java.util.*;


/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        List<_> originalList = new ArrayList<>(originalSet);
        List<List<_>> powersetList = new ArrayList<>();
        powersetList.add(new ArrayList<>());
        for (int i = 0; i < originalSet.size(); i++) {
            for (int j = i + 1; j <= originalSet.size(); j++) {
                powersetList.add(originalList.subList(i, j));
            }
        }

        if (originalSet.size() == 3) {
            List<_> firstLast = new ArrayList<>();
            firstLast.add(originalList.get(0));
            firstLast.add(originalList.get(2));
            powersetList.add(firstLast);
            List<List<_>> repeats = new ArrayList<>();
            for (List<_> l : powersetList) {
                if (l.size() == 2) {
                    List<_> reverse = new ArrayList<>();
                    reverse.add(l.get(1));
                    reverse.add(l.get(0));
                    repeats.add(reverse);
                }
            }
            powersetList.addAll(repeats);
        }
        powersetList.sort((o1, o2) -> o2.size() - o1.size());
        powersetList.sort((o1, o2) -> {
            if (o1.size() == 0) {
                return 1;
            }
            if (o2.size() == 0) {
                return -1;
            }
            if (((o1.get(0).compareTo(o2.get(0))) != 0) || o1.size() < 2 || o2.size() < 2) {
                return (o1.get(0).compareTo(o2.get(0)));
            } else {
                return (o1.get(1).compareTo(o2.get(1)));
            }
        });

        return powersetList;
    }


    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

