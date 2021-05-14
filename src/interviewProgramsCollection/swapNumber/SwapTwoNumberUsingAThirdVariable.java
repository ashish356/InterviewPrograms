package interviewProgramsCollection.swapNumber;

import java.sql.SQLOutput;

public class SwapTwoNumberUsingAThirdVariable {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int temp;

        System.out.println("Value of a and b before swap are :" +a+" "+b);

        temp=b;
        b=a;
        a=temp;
        System.out.println("Value of a and b after swap are :" +a +" " +b);
    }
}
