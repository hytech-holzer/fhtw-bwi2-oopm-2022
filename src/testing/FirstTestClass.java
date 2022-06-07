package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestClass {

    @Test
    public void testMyBusinessMethod() {
        FirstService firstService = new FirstService();
        int ret = firstService.myBusinessMethod();
        System.out.println(ret);
        Assert.assertEquals(ret, 2);
    }

}
