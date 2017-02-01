#JUnit for test-runners 

1. It instantiates our test classes 
2. It runs test methods found from our test classes
3. It reports the test results
4. Default test runner - `BlockJUnit4ClassRunner`

##Custom test runner:
1. All test runners must extract the abstract junit.runner.Runner class
2. A test class can have only one test runner
3. Annotate the test class with `@RunWith` annotation
4. Set the type of test runner as the value of the `@RunWith` annotation 

eg. To run tests written in FoobarTest class using the CustomRunner:

```` java
@RunWith(CustomRunner.class)
class FoobarTest {
    // Tests
}
````

## JUnit
Popular unit testing framework for Java and Scala. The latest version, JUnit 4, supports rich annotation-based and parameterized tests.

## Marker interface 
It is an empty interface and is used to signal the class libraries that the objects of this class implementing this interface must be treated in a special way, like serializing, cloning, etc.
The interface is devoid of any functionality.

Annotations are better than Marker Interfaces because they let you achieve the same purpose of conveying metadata about the class to its consumers without creating a separate type for it. Annotations are more powerful, too, letting programmers pass more sophisticated information to classes that "consume" it.

## Test Suite
A set of several test cases for a component or system under test, where the post condition of one the test is used as the precondition for the next one.
Test suite is used to bundle a few unit test cases and run them together. In JUnit, both @RunWith and @Suite annotations are used to run the suite tests.


