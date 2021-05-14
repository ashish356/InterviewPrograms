package interviewProgramsCollection.palindrome;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberOrStringAPalindrome {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String value = scanner.nextLine();
        String reverse="";
        for(int i=value.length()-1;i>=0;i--)
        {
            reverse+=value.charAt(i);
        }
        if(value.equals(reverse))
        {
            System.out.println("Number or String is palindrome");
        }
        else
        {
            System.out.println("Number or String is not palindrome");
        }


    }
}
