import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public Stream<String> convertSeqTo(int end) {
        return IntStream.range(1, end)
                .mapToObj(String::valueOf);
    }

}
