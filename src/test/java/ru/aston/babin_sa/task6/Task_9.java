package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Сгруппировать элементы Stream по их чётности, посчитать размер каждой группы и вывести результаты.
public class Task_9 {

    @Test
    void shouldParityGroup() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Map<Boolean, Long> map = stream.collect(Collectors.groupingBy(e -> e % 2 == 0, Collectors.counting()));

        System.out.println("Четные " + map.get(true));
        System.out.println("Нечетные " + map.get(false));
    }
}
