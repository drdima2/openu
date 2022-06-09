package openu.irina.maman15.impl1;

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

        System.out.println("-----------");
        Set set10 = new Set(1,1,2,3,1);
        System.out.println(set10);

        System.out.println("---------");
        Set set20 = new Set(6,2,4);
        Set set21 = new Set(2,3,8,6);
        Set union = set20.union(set21);
        System.out.println("union: "+union);
        System.out.println("set20: "+set20);
        System.out.println("set21: "+set21);



        System.out.println("!!! ---------");
        Set set30 = new Set(6,2,4);
        Set set31 = new Set(2,3,8,6);
        Set intersection = set30.intersection(set31);
        System.out.println("intersection: "+intersection);
        System.out.println("set30: "+set30);
        System.out.println("set31: "+set31);


        System.out.println("** --------- !!!");
        Set set40 = new Set(6,2,4);
        Set set41 = new Set(2,3,8,6);
        Set diff = set40.difference(set41);
        System.out.println("diff: "+diff);
        System.out.println("set40: "+set40);
        System.out.println("set41: "+set41);


        System.out.println("** --------- !!!");
        Set set50 = new Set();
        System.out.println("set50 isEmpty : "+set50.isEmpty());
        set50.addToSet(1);
        System.out.println("set50 isEmpty : "+set50.isEmpty());

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
