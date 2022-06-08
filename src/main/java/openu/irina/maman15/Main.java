package openu.irina.maman15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set set1 = new Set(1, 25, 3);
        Set set2 = new Set(9, 5, 25, 17);
        Set set3 = new Set(getOdd(100, 1000));
        Set set4 = new Set(17, 25, 5, 9);
        System.out.println(set2.toString());
        System.out.println(set2.numOfElements());
        set2.removeFromSet(17);
        System.out.println(set2.toString());
        System.out.println(set2.numOfElements());
        System.out.println(set2.isMember(25));


        Set set5 = new Set(1, 2, 3, 4);
        Set set6 = new Set(4, 3, 2, 1);
        System.out.println(set5.equals(set6));

        System.out.println("------------");
        Set set7 = new Set(1, 2, 3);
        Set set8 = new Set(4, 3, 2, 1);
        System.out.println(set8.subSet(set7));
        System.out.println(set8.equals(set7));
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
