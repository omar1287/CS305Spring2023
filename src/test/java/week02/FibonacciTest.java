package week02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FibonacciTest {

    @InjectMocks
    private Fibonacci fibonacci;

    @Test
    public void fibWay1Test() {
        int ex = 13; // for 7
        int basEx0 = 0; // for 0
        int basEx1 = 1; // for 1

        Assertions.assertEquals(ex, fibonacci.fibWay1(7));
        Assertions.assertEquals(basEx0, fibonacci.fibWay1(0));
        Assertions.assertEquals(basEx1, fibonacci.fibWay1(1));

    }


    @Test
    public void fibWay2Test() {
        int ex = 13; // for 7
        int basEx0 = 0; // for 0
        int basEx1 = 1; // for 1

        Assertions.assertEquals(ex, fibonacci.fibWay2(7));
        Assertions.assertEquals(basEx0, fibonacci.fibWay2(0));
        Assertions.assertEquals(basEx1, fibonacci.fibWay2(2));
    }
}
