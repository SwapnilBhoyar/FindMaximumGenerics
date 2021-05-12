import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaximumTest {
    TestMaximum testMaxObj = new TestMaximum();

    @Test
    void ifIntegerNumberOneIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(100, 50, 25);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifIntegerNumberTwoIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(50, 100, 25);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifIntegerNumberThreeIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(25, 50, 100);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(10.0F, 5.0F, 2.5F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(5.0F, 10.0F, 2.5F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(2.5F, 5.0F, 10.0F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifStringOneIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("banana", "peach", "apple");
        Assertions.assertEquals("banana", testMaximumInteger.testMaximum());
    }

    @Test
    void ifStringTwoIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("apple", "banana", "peach");
        Assertions.assertEquals("banana", testMaximumInteger.testMaximum());
    }
    @Test
    void ifStringThreeIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("peach", "apple", "banana");
        Assertions.assertEquals("banana", testMaximumInteger.testMaximum());
    }
}