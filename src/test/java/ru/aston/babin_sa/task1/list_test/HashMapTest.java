package ru.aston.babin_sa.task1.list_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {

    @Test
    public void hashMapTest() {

        HashMap<String, Integer> map1 = new HashMap<>();

        HashMap<String, Integer> map2 = new HashMap<>(15);

        HashMap<String, Integer> map3 = new HashMap<>(15, 0.75f);

        HashMap<String, Integer> dopMap = new HashMap<>();
        HashMap<String, Integer> map4 = new HashMap<>(dopMap);

        List<String> keys = Arrays.asList("key1", "key2", "key3");
        List<Integer> values = Arrays.asList(1, 2, 3);
        HashMap<String, Integer> map5 = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map5.put(keys.get(i), values.get(i));
        }

        // методы

        // добавление
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        map1.get("Ivan");             // Возвращает значение по ключу
        map1.remove("Sergey");    // Удаляет по ключу
        map1.containsKey("Ivan");     // Содержит ли данный ключ
        map1.containsValue(18);       // Содержит ли данное значение
        map1.size();                  // Возвращает кол-во пар
        map1.isEmpty();               // Является ли пустым

    }

    @Test
    public void shouldAddElement() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);

        Assertions.assertEquals(1, map1.size());
    }

    @Test
    public void shouldReturnValue() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        Assertions.assertEquals(18, map1.get("Ivan"));
    }

    @Test
    public void shouldRemoveElement() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        map1.remove("Sergey");

        Assertions.assertEquals(2, map1.size());
    }

    @Test
    public void shouldTrueForKey() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        Assertions.assertTrue(map1.containsKey("Ivan"));
    }

    @Test
    public void shouldTrueForValue() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        Assertions.assertTrue(map1.containsValue(18));
    }

    @Test
    public void shouldAmountOfElements() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ivan", 18);
        map1.put("Sergey", 28);
        map1.put("Katy", 38);

        Assertions.assertEquals(3, map1.size());
    }

    @Test
    public void shouldTrueEmptyMap() {
        HashMap<String, Integer> map1 = new HashMap<>();

        Assertions.assertTrue(map1.isEmpty());
    }

}
