package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

// Создание Stream из массива целых чисел и вывод на экран всех простых чисел в диапазоне от 2 до 100.
public class Task_8 {

    @Test
    void shouldPrimeNumbers() {
        int[] array = IntStream.rangeClosed(2, 100).toArray();

        Arrays.stream(array)
                .filter(Task_8:: PrimeNumber)
                .forEach(System.out :: println);
    }

    public static boolean PrimeNumber (int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
