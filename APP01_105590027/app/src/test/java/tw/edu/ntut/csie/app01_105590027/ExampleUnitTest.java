package tw.edu.ntut.csie.app01_105590027;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private   MainActivity ms;

    @Before
    public void setUp(){
        ms = new MainActivity();
    }

    @After
    public void tearDown(){
        ms = null;
    }

    @Test
    public void testLetterGrade() {
        assertEquals(ms.letterGrade(10),'F');
        assertEquals(ms.letterGrade(66),'D');
        assertEquals(ms.letterGrade(77),'C');
        assertEquals(ms.letterGrade(88),'B');
        assertEquals(ms.letterGrade(99),'A');
        assertEquals(ms.letterGrade(200),'X');

    }

}
