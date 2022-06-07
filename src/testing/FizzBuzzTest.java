package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {


    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals(
                fizzBuzz.fizzBuzz(0),
                Arrays.asList());

        Assert.assertEquals(
                fizzBuzz.fizzBuzz(1),
                Arrays.asList("1"));

        Assert.assertEquals(
                fizzBuzz.fizzBuzz(3),
                Arrays.asList("1","2","Fizz"));
    }

}
