package ru.aston.babin_sa.task1.list_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TreeSetTest {

    @Test
    public void treeSet() {

        TreeSet<String> set1 = new TreeSet<>();

        List<Double> numbers = Arrays.asList(3.1, 2.2, 1.4);
        TreeSet<Double> set2 = new TreeSet<>(numbers);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(5);
        sortedSet.add(2);
        TreeSet<Integer> set3 = new TreeSet<>(sortedSet);

        TreeSet<String> dopSet = new TreeSet<>();
        dopSet.add("Ivan");
        dopSet.add("Sergey");
        dopSet.add("Katy");
        TreeSet<String> set4 = new TreeSet<>(dopSet);


        // методы

        set1.add("Petr");          // добавление
        set1.add("Mark");
        set1.add("Tom");
        set1.remove("Petr");    // удаление
        set1.contains("Mark");    // проверяет на наличие
        set1.size();              // возвращает кол-во элементов
        set1.isEmpty();           // является ли пустой
        set1.clear();             // удаляет все элементы

        set1.add("Tom");
        set1.add("Mark");

        set1.first();             // возвращает 1 элемент
        set1.last();              // возвращает последний элемент
    }

    @Test
    public void shouldAddElement() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Tom");
        set1.add("Mark");

        Assertions.assertEquals(2, set1.size());
    }

    @Test
    public void shouldRemoveElement() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Tom");
        set1.add("Mark");

        set1.remove("Tom");

        Assertions.assertEquals(1, set1.size());
    }

    @Test
    public void shouldTrueBeElement() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Tom");
        set1.add("Mark");

        Assertions.assertTrue(set1.contains("Tom"));
    }

    @Test
    public void shouldAmountOfElements() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Tom");
        set1.add("Mark");

        Assertions.assertEquals(2, set1.size());
    }

    @Test
    public void shouldTrueEmptySet() {
        TreeSet<String> set1 = new TreeSet<>();

        Assertions.assertTrue(set1.isEmpty());
    }

    @Test
    public void shouldEmptySet() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Tom");
        set1.add("Mark");

        set1.clear();

        Assertions.assertEquals(0, set1.size());
    }

    @Test
    public void shouldFirstElement() {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(5);

        Assertions.assertEquals(2, set1.first());
    }

    @Test
    public void shouldLastElement() {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(5);

        Assertions.assertEquals(5, set1.last());
    }
}
