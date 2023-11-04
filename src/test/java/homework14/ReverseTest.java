package homework14;

import homework9.Reverse;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseTest extends Template {

    @Test(groups = "Reverse")
    public void checkReverse1() {
        String str = "Java, World!";
        assertEquals(Reverse.reverseString(str), "!dlroW ,avaJ");
    }

    @Test(groups = "Reverse")
    public void checkReverse2() {
        String str = "";
        assertEquals(Reverse.reverseString(str), "");
    }
}
