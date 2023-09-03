package ru.aston.babin_sa.task1.list_test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    @Test
    public void arrayListTest() {

        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Integer> numbers2 = new ArrayList<>(15);

        ArrayList<Integer> numbers3 = new ArrayList<>(numbers);

        // методы

        // добавление в коллекцию
        numbers.add(101);
        numbers.add(102);
        numbers.add(103);

        numbers2.add(201);
        numbers2.add(202);
        numbers2.add(203);

        numbers.addAll(numbers2);   // добавление в коллекцию другую коллекцию
        numbers.remove(2);    // удаление из коллекции по индексу
        numbers2.clear();          // удаление всех элементов из коллекции
        numbers.contains(101);     // возвращает true если есть данный элемент
        numbers2.isEmpty();        // возвращает true если коллекция пуста
        numbers.size();            // возвращает кол-во элементов в коллекции
    }

    @Test
    public void shouldAddElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(104);

        Assertions.assertEquals(1, numbers.size());
    }

    @Test
    public void shouldAddCollection() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        numbers.addAll(numbers2);

        Assertions.assertEquals(6, numbers.size());
    }

    @Test
    public void shouldRemoveElement() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        numbers.remove(2);

        Assertions.assertEquals(2, numbers.size());
    }

    @Test
    public void shouldEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        numbers.clear();

        Assertions.assertEquals(0, numbers.size());
    }

    @Test
    public void shouldTrueBeElement() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        Assertions.assertTrue(numbers.contains(1));
    }

    @Test
    public void shouldTrueEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Assertions.assertTrue(numbers.isEmpty());
    }

    @Test
    public void shouldAmountOfElements() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        Assertions.assertEquals(3, numbers.size());
    }

}
