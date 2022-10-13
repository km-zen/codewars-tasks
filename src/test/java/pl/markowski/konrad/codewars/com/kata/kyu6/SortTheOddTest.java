package pl.markowski.konrad.codewars.com.kata.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    void sortArray() {
        int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int [] resultArr = {1, 8, 3, 6, 5, 4, 7, 2, 9, 0};

        Assertions.assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, SortTheOdd.sortArray(arr));
        Assertions.assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, SortTheOdd.sort2(arr));
    }
}