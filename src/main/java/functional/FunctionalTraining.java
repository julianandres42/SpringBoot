package functional;

import java.util.stream.Stream;

public class FunctionalTraining {

    public static void usingStreams(){
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
    }

}
