package testframework.JUnit4TestRunners.tutorialpoint;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testframework.JUnit4TestRunners.TestJunit2;

/**
 * Created by root on 1/29/17.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})

public class JunitTestSuite {
}
