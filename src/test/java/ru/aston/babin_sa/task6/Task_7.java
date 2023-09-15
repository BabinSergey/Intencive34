package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Разделить числа в Stream на три группы по остатку от деления на 3 (0, 1, 2), посчитать сумму чисел в каждой группе.
public class Task_7 {

    @Test
    void shouldDivideIntoGroups () {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.groupingBy(e -> e % 3, Collectors.summingInt(Integer :: intValue)));

//        System.out.println("1 " + map.get(0));
//        System.out.println("2 " + map.get(1));
//        System.out.println("3 " + map.get(2));

        Map<Integer, Integer> shouldMap = new HashMap<>();
        shouldMap.put(0, 30);
        shouldMap.put(1, 35);
        shouldMap.put(2, 26);

        Assertions.assertEquals(shouldMap, map);
    }
}
