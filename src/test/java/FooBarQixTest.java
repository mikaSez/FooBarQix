import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixTest {

    @Test
    public void should_write_foo_if_number_can_be_divided_by_3(){
        //ARRANGE
        String expected = "Foo";
        //ACT
        String result = FooBarQix.compute(3);
        //ASSERT
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_write_bar_if_number_can_be_divided_by_5(){
        //ARRANGE
        String expected = "Bar";
        //ACT
        String result = FooBarQix.compute(5);
        //ASSERT
        assertThat(result).isEqualTo(expected);
    }
}