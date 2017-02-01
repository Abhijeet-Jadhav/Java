package testframework.tutorialpoint;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by root on 1/29/17.
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("failure "+failure.toString());
        }

        System.out.println("success "+result.wasSuccessful());
    }
}
