package exam1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exam01Test {

    Exam01 exam01 = new Exam01();

    @Test
    public void start_game_should_love_all() {
        long actualResult = exam01.findInteger(8);
        assertEquals(8, actualResult);
    }
}
