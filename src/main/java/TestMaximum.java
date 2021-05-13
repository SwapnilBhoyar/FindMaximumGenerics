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

    public static void main(String args[]) {
        TestMaximum testMaximumObj = new TestMaximum();
        System.out.println("Max: "+testMaximumObj.testMaximumMore(1, 10, 13, 17, 25, 43, 21, 56, 60));
        System.out.println("Max: "+testMaximumObj.testMaximumMore(1.0F, 10.0F, 13.0F, 1.70F, 2.05F, 4.3F, 21.0F, 56.0F, 60.0F));
        System.out.println("Max: "+testMaximumObj.testMaximumMore("apple", "peach", "banana", "mango", "kiwi"));
    }
}
