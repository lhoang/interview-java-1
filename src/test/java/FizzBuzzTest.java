import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fb;
    @BeforeEach
    void setup() {
        fb = new FizzBuzz();
    }

    @Test
    @DisplayName("It should contains the right amount of Strings")
    void countStrings() {
        long count = fb.convertSeqTo(5)
                .count();
        assertThat(count).isEqualTo(5);
    }

    @Test
    @DisplayName("It should contains the sequence from 1 to 5")
    void seqFrom1To5() {
        List<String> result = fb.convertSeqTo(5)
                .collect(toList());
        assertThat(result).containsExactly("1", "2", "Fizz", "4", "Buzz");
    }

}