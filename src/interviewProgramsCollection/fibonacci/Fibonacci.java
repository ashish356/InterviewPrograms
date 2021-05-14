package interviewProgramsCollection.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Enter the length till you want fibonacci series");
        int number=new Scanner(System.in).nextInt();
        int i,j=0, k=1;
        System.out.println("Fibonacci series is");
        for(int l=0;l<number;l++)
        {
            i=j;
            j=k;
            k=i+j;
            System.out.println(i);
        }
    }
}
