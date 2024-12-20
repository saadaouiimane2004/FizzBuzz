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

}

