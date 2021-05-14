package interviewProgramsCollection.primeNumber;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        int number=new Scanner(System.in).nextInt();
        boolean isPrime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
              isPrime=false;
              break;
            }
        }
        if(isPrime)
        {
            System.out.println(number + "  is prime number");
        }
        else
        {
            System.out.println(number + " is not prime number");
        }
    }
}
