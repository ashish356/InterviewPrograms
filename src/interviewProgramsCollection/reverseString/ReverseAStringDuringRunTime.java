package interviewProgramsCollection.reverseString;

import java.util.Scanner;

public class ReverseAStringDuringRunTime {

    public static void main(String args[])

    {
        String reverseString="";
        System.out.println("Enter the String to be reversed");
        Scanner scanner=new Scanner(System.in);
        String enterInput=scanner.nextLine();
        for(int i=enterInput.length()-1;i>=0;i--)
        {
            reverseString+=enterInput.charAt(i);
        }
        System.out.println("Reverse String is :" +reverseString);

    }
}
