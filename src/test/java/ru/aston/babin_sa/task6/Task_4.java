package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// Создать два стрима: один из чисел от 0 до 10, другой из чисел от 10 до 20.
// Объединить их в один стрим и вывести на экран числа больше 10.
public class Task_4 {

    @Test
    void shouldMoreTen () {

        IntStream stream1 = IntStream.range(0, 10);
        IntStream stream2 = IntStream.range(10, 20);

        IntStream.concat(stream1, stream2)
                .filter(e -> e > 10)
                .forEach(System.out :: println);
    }
}
