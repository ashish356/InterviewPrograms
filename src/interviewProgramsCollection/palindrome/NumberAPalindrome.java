package interviewProgramsCollection.palindrome;

import java.util.Scanner;

public class NumberAPalindrome {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        int temp=number;
        int temp2;
        int reverseNumber=0;

        while(number>0)
        {
            temp2=number%10;
            reverseNumber= (reverseNumber*10)+temp2;
            number=number/10;

        }

        if(reverseNumber==temp)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");
        }


    }
}
