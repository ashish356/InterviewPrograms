package interviewProgramsCollection.armStrongNumber;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number to check if its arm Strong or not");
        int number=scanner.nextInt();
        int temp=number;
        int temp2;
        int sum=0;
        while(number>0) {
            temp2 = number % 10;
            sum = sum + temp2 * temp2 * temp2;
            number=number/10;

        }
        if(sum==temp)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("The number is not an armstrong number");
        }

    }

}
