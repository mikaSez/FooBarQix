import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

import java.util.Arrays

import org.assertj.core.api.Assertions.assertThat

@RunWith(Parameterized::class)
class FooBarQixTest(private val expectedResult: String, private val inputNumber: Int) {


    @Test
    fun isComputingCorrectlyTest() {
        val result = FooBarQix.compute(inputNumber)
        assertThat(result).isEqualTo(expectedResult)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun params(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf("FooFoo", 3),
                    arrayOf("Bar", 10),
                    arrayOf("QixQix", 7),
                    arrayOf("BarBar", 5),
                    arrayOf("FooQix", 21),
                    arrayOf("FooBarBar", 15),
                    arrayOf("FooBarQixBar", 105),
                    arrayOf("Qix", 14),
                    arrayOf("Foo", 9),
                    arrayOf("FooFooFoo", 33),
                    arrayOf("BarBarBar", 55),
                    arrayOf("QixQixQix", 77)

            )
        }
    }


}