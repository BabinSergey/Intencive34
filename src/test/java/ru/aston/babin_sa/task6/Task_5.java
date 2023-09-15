package ru.aston.babin_sa.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

// Собрать элементы Stream в карту, где ключом будет первая буква каждого слова, а значением — само слово.
// Отсортировать ключи в алфавитном порядке.
public class Task_5 {

    @Test
    void shouldCollectIntoCardSort() {

        List<String> list = new ArrayList<>();
        list.add("Январь");
        list.add("Февраль");
        list.add("Март");
        list.add("Апрель");
        list.add("Май");

        Map<String, String> map = list.stream().collect(Collectors.toMap(
                key -> String.valueOf(key.charAt(0)),
                value -> value,
                (oldValue, newValue) -> oldValue,
                TreeMap :: new
        ));

        TreeMap<String, String> shouldMap = new TreeMap<>();
        shouldMap.put("А", "Апрель");
        shouldMap.put("М", "Март");
        shouldMap.put("Ф", "Февраль");
        shouldMap.put("Я", "Январь");

        Assertions.assertEquals(shouldMap, map);
    }
}
