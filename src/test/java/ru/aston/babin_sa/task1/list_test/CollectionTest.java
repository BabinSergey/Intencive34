package ru.aston.babin_sa.task1.list_test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    @Test
    public void collectionTest() {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 15, 9));

        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        int index = Collections.binarySearch(list, 2);
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        Collections.fill(list, 21);
        int frequency = Collections.frequency(list, 9);
        Collections.addAll(list, 8);
    }

    @Test
    public void shouldSortList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));
        List<Integer> actual = new ArrayList<>(Arrays.asList(5, 8, 9));

        Collections.sort(list);

        Assertions.assertIterableEquals(actual, list);
    }

    @Test
    public void shouldReverseList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));
        List<Integer> actual = new ArrayList<>(Arrays.asList(8, 5, 9));

        Collections.reverse(list);

        Assertions.assertIterableEquals(actual, list);
    }

    @Test
    public void shouldShuffledList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));
        List<Integer> actual = new ArrayList<>(Arrays.asList(9, 5, 8));

        Collections.shuffle(list);

        Assertions.assertNotEquals(list, actual);
    }

    @Test
    public void shouldBinaryIndexSearch() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));

        int index = Collections.binarySearch(list, 5);

        Assertions.assertEquals(1, index);
    }

    @Test
    public void shouldMaxElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));

        Integer max = Collections.max(list);

        Assertions.assertEquals(9, max);
    }

    @Test
    public void shouldMinElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));

        Integer min = Collections.min(list);

        Assertions.assertEquals(5, min);
    }

    @Test
    public void shouldValuePadding() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        List<Integer> actual = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5));

        Collections.fill(list, 5);

        Assertions.assertIterableEquals(actual, list);
    }

    @Test
    public void shouldNumberOfSpecifiedElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8, 9, 9));

        int frequency = Collections.frequency(list, 9);

        Assertions.assertEquals(3, frequency);
    }

    @Test
    public void shouldAddElementToList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 8));

        Collections.addAll(list, 8);

        Assertions.assertEquals(4, list.size());
    }
}
