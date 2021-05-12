import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaxTest {
    FindMaximum findMax = new FindMaximum();
    @Test
    void ifNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(100,50,25));
    }

    @Test
    void ifNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(50, 100, 25));
    }

    @Test
    void ifNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(25, 50, 100));
    }
}
