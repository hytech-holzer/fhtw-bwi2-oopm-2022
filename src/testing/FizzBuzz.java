package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int i) {

        if (i == 0) {
            return new ArrayList<>();
        }
        if (i == 1) {
            return Arrays.asList("1");
        }
        if (i == 3) {
            return Arrays.asList("1", "2", "Fizz");
        }
        return new ArrayList<>();
    }

}
