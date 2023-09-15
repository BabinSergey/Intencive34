package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

// Проверить, все ли числа в массиве [0, 1, …, 19] являются четными,
public class Task_3 {

    @Test
    void shouldEvenNumbers() {
        boolean evenNumbers = IntStream.rangeClosed(0, 19)
                .allMatch(e -> e % 2 == 0);

        Assertions.assertFalse(evenNumbers);
    }
}
