package JC_2.WorksWithNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        for (int numbers : intList) {
            if (numbers > 0 && numbers % 2 == 0) {
                System.out.println(numbers);
            }
        }
    }
}
