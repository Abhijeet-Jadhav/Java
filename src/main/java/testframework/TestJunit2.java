package testframework;

import org.junit.Test;
import testframework.tutorialpoint.MessageUtil;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 1/29/17.
 */
public class TestJunit2 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
