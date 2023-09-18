package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

// Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.
public class Task_10 {

    @Test
    void shouldSortedStrings() {
        String[] array = {
                "First pilot",
                "Second cosmonaut",
                "I don't know the third one",
                "Apples are still good"
        };

        Stream<String> stream = Arrays.stream(array).sorted();

        stream.forEach(System.out :: println);
    }
}
