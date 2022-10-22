package week02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FibonacciTest {

    @InjectMocks
    private Fibonacci fibonacci;

    @Test
    public void fibWay1Test(){
        int ex = 13;
        int basEx0 = 0;
        int basEx1 = 1;

        assertEquals(ex, fibonacci.fibWay1(7));
        assertEquals(basEx0, fibonacci.fibWay1(0));
        assertEquals(basEx1, fibonacci.fibWay1(1));

    }


    @Test
    public void fibWay2Test(){
        int ex = 13;
        int basEx0 = 0;
        int basEx1 = 1;

        assertEquals(ex, fibonacci.fibWay2(7));
        assertEquals(basEx0, fibonacci.fibWay2(0));
        assertEquals(basEx1, fibonacci.fibWay2(1));
    }


}