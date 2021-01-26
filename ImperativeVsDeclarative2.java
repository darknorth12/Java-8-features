// removing dupicates from list

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class ImperativeVsDeclarative2{

    public static void main(String[] args){

        List<Integer> integers = Arrays.asList(1,1,2,2,3,3,4,4,4,5,6,7,8,8,8,9);

        /*
        * Imperative Programming
        */

        List<Integer> resultedList = new ArrayList<Integer>();

        for (Integer integer : integers){
            if(!resultedList.contains(integer)) resultedList.add(integer);
        }

        System.out.println("Imperative Approach : " + resultedList);

        /*
        * Declarative Programming
        */

        List<Integer> resultedList1 = integers.stream().distinct().collect(Collectors.toList());

        System.out.println("Declarative Approach : " + resultedList1);


    }
}