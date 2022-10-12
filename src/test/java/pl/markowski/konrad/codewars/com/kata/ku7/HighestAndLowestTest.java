package pl.markowski.konrad.codewars.com.kata.ku7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.markowski.konrad.codewars.com.kata.ku7.HighestAndLowest;

class HighestAndLowestTest {

    @Test
    void selectHighestAndLowestInt() {

        Assertions.assertEquals("5 1", HighestAndLowest.selectHighestAndLowestInt("1 2 3 4 5"));
        Assertions.assertEquals("5 -3", HighestAndLowest.selectHighestAndLowestInt("1 2 -3 4 5"));
    }
}