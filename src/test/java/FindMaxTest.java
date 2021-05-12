import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaxTest {
    FindMaximum findMaxObj = new FindMaximum();

    @Test
    void ifIntegerNumberOneIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMaxObj.findMax(100, 50, 25));
    }

    @Test
    void ifIntegerNumberTwoIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMaxObj.findMax(50, 100, 25));
    }

    @Test
    void ifIntegerNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMaxObj.findMax(25, 50, 100));
    }

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(10.0F, 5.0F, 2.5F));
    }

    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(5.0F, 10.0F, 2.5F));
    }

    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(2.5F, 5.0F, 10.0F));
    }

    @Test
    void ifStringOneIsMaxReturnTrue() {
        Assertions.assertEquals("banana", findMaxObj.findMax("banana", "apple", "peach"));
    }

    @Test
    void ifStringTwoIsMaxReturnTrue() {
        Assertions.assertEquals("banana", findMaxObj.findMax("apple", "banana", "peach"));
    }

    @Test
    void ifStringThreeIsMaxReturnTrue() {
        Assertions.assertEquals("banana", findMaxObj.findMax("peach", "apple", "banana"));
    }
}