package interviewProgramsCollection.reverseString;

import sun.lwawt.macosx.CSystemTray;

public class ReverseAStringWithoutUsingAnyInBuiltMethod {

    public static void main(String args[])
    {
        String text="Automation";

        //First Approach
        char charText[]=text.toCharArray();

        for(int i=charText.length-1;i>=0;i--) //Note here only once charText.length will be calculated
        {
            System.out.print(charText[i]);

        }
        System.out.println();

        //Second Approach
        for(int j=text.length()-1;j>=0;j--)
        {
            System.out.print(text.charAt(j));
        }
    }
}
