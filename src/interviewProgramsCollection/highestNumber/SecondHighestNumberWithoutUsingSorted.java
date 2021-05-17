package interviewProgramsCollection.highestNumber;

public class SecondHighestNumberWithoutUsingSorted {

    public static void main(String[] args) {

        int array[]={12,16,8,7,90,100,120,80,10,110};
        int highestNumber=0;
        int secondHighestNumber=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>highestNumber)
            {
                secondHighestNumber=highestNumber;
                highestNumber=array[i];
            }
            else if(array[i]>secondHighestNumber)
            {
                secondHighestNumber=array[i];
            }

        }
        System.out.println("Highest Number is : " +highestNumber);
        System.out.println("Second Highest Number is " +secondHighestNumber);
    }
}
