package interviewProgramsCollection.reverseString;

import java.util.Scanner;

public class ReverseAStringDuringRunTimeDifferentApproach {

    public static void main(String[] args) {

        String reverseString="";
        System.out.println("Enter the text to be reversed");
        String originalText=new Scanner(System.in).nextLine();
        String[] token=originalText.split("");
        for(int i=token.length-1;i>=0;i--)
        {
         reverseString+=token[i];
        }
        System.out.println("Reverse String is : " +reverseString);

    }
}
