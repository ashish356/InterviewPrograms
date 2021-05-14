package interviewProgramsCollection.swapNumber;

public class SwapTwoNumberWithoutUsingAThirdVariable {

    public static void main(String[] args) {
         int a=10;
         int b=15;

        System.out.println("Value of a and b before swap are :" +a+" "+b);

        b=a+b;
        a=b-a;
        b=b-a;

        System.out.println("Value of a and b after swap are :" +a +" " +b);

    }
}
