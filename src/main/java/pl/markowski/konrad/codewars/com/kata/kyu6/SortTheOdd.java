package pl.markowski.konrad.codewars.com.kata.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

    private final int [] arr;

    public SortTheOdd(int[] arr) {
        this.arr = arr;
    }
    //Task
    //You will be given an array of numbers. You have to sort the odd numbers
    // in ascending order while leaving the even numbers at their original positions.
    //
    //Examples
    //[7, 1]  =>  [1, 7]
    //[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
    //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

    public int [] sortArray(int [] array){

        List<Integer> numbers = new ArrayList<>();
        for (int e :
                array) {
            if (e % 2 != 0){
                numbers.add(e);
            }
        }

        Collections.sort(numbers);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] = numbers.get(j);
                j++;
            }
        }
        return array;
    }

    // Best Practise and Clever solution:
    public static int [] sort2(int [] array){

        int [] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int i = 0, s = 0; i < array.length ; i++) {
            if(array[i] % 2 == 1){
                array[i] = sortedOdd[s++];
            }
        }
        return array;
    }

}
