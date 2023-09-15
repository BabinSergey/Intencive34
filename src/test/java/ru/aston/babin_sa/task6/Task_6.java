package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Создайте три Stream-а из массивов чисел 1…10, 5…20 и 10…30 соответственно.
// Объедините их в один Stream и выведите числа, которые кратны 3 или 5.
public class Task_6 {

    @Test
    void shouldCombineStream() {

        int[] a = IntStream.rangeClosed(1, 10).toArray();
        int[] b = IntStream.rangeClosed(5, 20).toArray();
        int[] c = IntStream.rangeClosed(10, 30).toArray();

        Stream<Integer> stream1 = Arrays.stream(a).boxed();
        Stream<Integer> stream2 = Arrays.stream(b).boxed();
        Stream<Integer> stream3 = Arrays.stream(c).boxed();

        Stream<Integer> generalStream = Stream.concat(Stream.concat(stream1, stream2), stream3);

        generalStream.filter(e -> e % 3 == 0 || e % 5 == 0).sorted().forEach(System.out::println);

    }
}
