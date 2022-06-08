package openu.irina.maman15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set set1 = new Set(1, 25, 3);
        Set set2 = new Set(9, 5, 25, 17);
        //Set set3 = new Set(getOdd(100, 1000));
        System.out.println(set2.toString());
        System.out.println(set2.numOfElements());
        set2.removeFromSet(17);
        System.out.println(set2.toString());
        System.out.println(set2.numOfElements());
        System.out.println(set2.isMember(25));
    }

    private static int[] getOdd(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
