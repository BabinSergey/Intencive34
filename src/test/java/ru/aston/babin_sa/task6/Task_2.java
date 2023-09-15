package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Отфильтруйте все элементы списка, которые меньше 0.
public class Task_2 {

    @Test
    void shouldFilterNumbers() {

        List<Integer> list = new ArrayList<>();
        list.add(-10);
        list.add(8);
        list.add(3);
        list.add(-4);
        list.add(0);

        List<Integer> list2 = list.stream().filter(e -> (e < 0)).collect(Collectors.toList());

        List<Integer> shouldList = Arrays.asList(-10, -4);

        Assertions.assertEquals(shouldList, list2);
    }
}
