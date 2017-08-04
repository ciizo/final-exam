package exam1;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exam01Test {

    Exam01 exam01 = new Exam01();

    @Test
    public void inputIs8() {
        long actualResult = exam01.findNumber(8L);
        assertEquals(8, actualResult);
    }

    @Test
    public void inputIs10() {
        long actualResult = exam01.findNumber(10L);
        assertEquals(9, actualResult);
    }

    @Test
    public void inputIs20() {
        long actualResult = exam01.findNumber(20L);
        assertEquals(19, actualResult);
    }

    @Test
    public void inputIs132() {
        long actualResult = exam01.findNumber(132L);
        assertEquals(129, actualResult);
    }

    @Test
    public void inputIsTooManyx() {
        long actualResult = exam01.findNumber(1110L);
        assertEquals(999L, actualResult);
    }

    @Test
    public void inputIsTooMany1() {
        long actualResult = exam01.findNumber(111111111111111110L);
        assertEquals(99999999999999999L, actualResult);
   }

    @Test
    public void inputIsTooMany2() {
        long actualResult = exam01.findNumber(989999999999999999L);
        assertEquals(899999999999999999L, actualResult);
    }

}
