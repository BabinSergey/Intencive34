package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2
public class Task_1 {

    @Test
    void shouldMultiplyNumber() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = Arrays.stream(arr).map(e -> (e * 2)).toArray();

        int[] shouldArr = {2, 4, 6, 8, 10};

        Assertions.assertArrayEquals(shouldArr, arr2);
    }
}
