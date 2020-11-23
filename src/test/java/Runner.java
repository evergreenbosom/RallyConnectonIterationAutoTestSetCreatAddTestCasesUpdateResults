import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner extends TestBase {


    @Test
    @TestData(testId = "TC7", env = "Stage - ", tags = {"smoke", "authentication"})
    public void testName() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Hello";
        Assert.assertEquals(ac, ex);
    }

    @Test
    @TestData(testId = "TC7", env = "Dev - ", tags = {"smoke", "authentication"})
    public void testName1() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Helloo";
        Assert.assertEquals(ac, ex);
    }
    @Test
    @TestData(testId = "TC9", env = "Dev - ", tags = {"smoke", "authentication"})
    public void testName2() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Hello";
        Assert.assertEquals(ac, ex);
    }

}
