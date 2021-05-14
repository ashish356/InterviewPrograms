package interviewProgramsCollection.reverseString;

import javax.lang.model.element.NestingKind;
import java.util.Locale;

public class ReverseAStringWithStringInBuiltMethod {

    public static void main(String args[]) {

        String text = "Automation";

        //String is immutable. Value of text remains same even after applying some operations on it.
        String text2=text.toUpperCase();
        System.out.println("text1 is "+text);
        System.out.println("text2 is "+text2);

        //Using String Builder
        StringBuilder builderText = new StringBuilder(text);
        StringBuilder reverseText = builderText.reverse();
        System.out.println("Reverse Text is :" +reverseText);

        //Using String Buffer
        StringBuffer bufferText=new StringBuffer(text);
        StringBuffer reverseTexts=bufferText.reverse();
        System.out.println("Reverse Text is :" +reverseText);

        //String Buffer is thread safe and synchronous whereas String builder is not thread safe but it is faster.
    }
}
