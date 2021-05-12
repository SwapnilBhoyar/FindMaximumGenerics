import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaxTest {
    FindMaximum findMax = new FindMaximum();

    @Test
    void ifIntegerNumberOneIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMax.findMaxNumber(100, 50, 25));
    }

    @Test
    void ifIntegerNumberTwoIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMax.findMaxNumber(50, 100, 25));
    }

    @Test
    void ifIntegerNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(25, 50, 100));
    }

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(10.0F, 5.0F, 2.5F));
    }

    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findFloatMaxNumber(5.0F, 10.0F, 2.5F));
    }

    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findFloatMaxNumber(2.5F, 5.0F, 10.0F));
    }
}