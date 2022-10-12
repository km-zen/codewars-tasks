package pl.markowski.konrad.codewars.com.kata.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {
    /*
    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

     */

    static String selectHighestAndLowestInt(String numbers) {
        List<String> listNumbers = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        List<Integer> newListNumbers = new ArrayList<>();
        int min, max;
        for (String num: listNumbers
             ) {
            newListNumbers.add(Integer.parseInt(num));
        }
        min = Collections.min(newListNumbers);
        max = Collections.max(newListNumbers);

        return max + " " + min;
    }
}
