package interviewProgramsCollection.highestNumber;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestNumberUsingCollectionSort {


    public static void main(String[] args) {

        List<Integer> arrayList=new ArrayList();
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(90);
        arrayList.add(90);
        arrayList.add(60);
        arrayList.add(65);
        arrayList.add(70);


        List<Integer> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List is " +sortedList);
        int lengthOfList=sortedList.size();
        System.out.println("Second Highest Number in the List is "+sortedList.get(lengthOfList-2));


    }
}
