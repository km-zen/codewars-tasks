package pl.markowski.konrad.codewars.com.kata.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    void sortArray() {
        // Given
        int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        // When
        SortTheOdd sortTheOdd = new SortTheOdd(arr);
        // Then
        Assertions.assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, sortTheOdd.sortArray(arr));


        // second solution (Best Practise and clever
        Assertions.assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, SortTheOdd.sort2(arr));
    }
}