package exam1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exam01Test {

    Exam01 exam01 = new Exam01();

    @Test
    public void inputIs8() {
        long actualResult = exam01.findInteger(8);
        assertEquals(8, actualResult);
    }

    @Test
    public void inputIs10() {
        long actualResult = exam01.findInteger(10);
        assertEquals(9, actualResult);
    }

    @Test
    public void inputIs20() {
        long actualResult = exam01.findInteger(20);
        assertEquals(19, actualResult);
    }

    @Test
    public void inputIs132() {
        long actualResult = exam01.findInteger(132);
        assertEquals(129, actualResult);
    }
}
