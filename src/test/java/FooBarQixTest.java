import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FooBarQixTest {

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(
                new Object[]{"FooFoo", 3},
                new Object[]{"Bar", 10},
                new Object[]{"QixQix", 7},
                new Object[]{"BarBar", 5},
                new Object[]{"FooQix", 21},
                new Object[]{"FooBarBar", 15},
                new Object[]{"FooBarQixBar", 105},
                new Object[]{"Qix", 14},
                new Object[]{"Foo", 9},
                new Object[]{"FooFooFoo", 33},
                new Object[]{"BarBarBar", 55},
                new Object[]{"QixQixQix", 77}

        );
    }

    private final String expectedResult;
    private final int inputNumber;

    public FooBarQixTest(final String expectedResult, final int inputNumber) {
        this.expectedResult = expectedResult;
        this.inputNumber = inputNumber;
    }


    @Test
    public void isComputingCorrectlyTest() {
        final String result = FooBarQix.compute(inputNumber);
        assertThat(result).isEqualTo(expectedResult);
    }


}