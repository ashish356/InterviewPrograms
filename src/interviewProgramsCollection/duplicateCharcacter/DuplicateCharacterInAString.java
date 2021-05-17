package interviewProgramsCollection.duplicateCharcacter;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharacterInAString {

    public static void main(String[] args) {

        String word="Ashishsh";
        int lengthOfWord=word.length();
        char[] charArray=word.toCharArray();
        List<Character> listOfCharacter=new ArrayList<>();

        for(int i=0;i<lengthOfWord;i++)
        {
            for(int j=i+1;j<lengthOfWord;j++)
            {
                if(charArray[i]==charArray[j] && !listOfCharacter.contains(charArray[i]))
                {
                    listOfCharacter.add(charArray[i]);
                    System.out.println(charArray[i]);
                    break;
                }
            }
        }
    }
}
