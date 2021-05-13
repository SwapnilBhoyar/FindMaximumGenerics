import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMaximum<E extends Comparable<E>> {
    E firstValue, secondValue, thirdValue;

    TestMaximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public TestMaximum() {
    }

    public E testMaximum() {
        return testMaximum(firstValue, secondValue, thirdValue);
    }
    public static <E extends Comparable<E>> E testMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
    public static <E extends Comparable<E>> E testMaximumMore(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
