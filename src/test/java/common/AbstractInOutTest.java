package common;

import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.setIn;
import static java.lang.System.setOut;

public class AbstractInOutTest {

    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        setOut(new PrintStream(outputStream));
    }

    protected void input(String input) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        setIn(inputStream);
    }

    protected String output() {
        return outputStream.toString();
    }
}
