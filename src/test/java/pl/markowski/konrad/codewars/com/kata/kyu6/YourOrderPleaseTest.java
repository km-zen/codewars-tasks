package pl.markowski.konrad.codewars.com.kata.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YourOrderPleaseTest {

    @Test
    void order() {
        String words = "4of Fo1r pe6ople g3ood th5e the2";
        String words2 ="";
        Assertions.assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", YourOrderPlease.order(words));
        Assertions.assertEquals("", YourOrderPlease.order(words2));
    }
}