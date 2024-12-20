package FizzBuzz;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class fizzbuzzTest {


    @Test
    public void fizzBuzz_de_1_devrait_retourner_1() {
        assertThat(fizzbuzz.de(1)).isEqualTo("1");
    }

    @Test
    void fizzBuzz_de_3_devrait_retourner_Fizz() {
        assertThat(fizzbuzz.de(3)).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz_de_5_devrait_retourner_Buzz() {
        assertThat(fizzbuzz.de(5)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz_de_15_devrait_retourner_FizzBuzz() {
        assertThat(fizzbuzz.de(15)).isEqualTo("FizzBuzz");
    }


}

