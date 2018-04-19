import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

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

}