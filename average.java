import java.util.*;

public class average {

    public static void main(String[] args) {
        System.out.println("Enter the no of Subjects");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks in subject " + (i + 1));
            int marks = s.nextInt();
            if (marks <= 100 && marks >= 0) {
                sum = sum + marks;
                                             }
            else {
                System.out.println("Marks should be in the range of 0 to 100 ");
                i--;
                 }

        }

        float avg =(float)sum/n ;

        System.out.println("Total Marks of Student is : "+sum);
        System.out.println("Average Percentage of Student is : "+avg);
        System.out.print("The student Grade is : ");

        if(avg >= 95) {
            System.out.print("O");
        }
        else if(avg >= 90 && avg<95) {
            System.out.print("A+");
        }
        else if(avg >= 80 && avg<90 ) {
            System.out.print("A");
        } else if(avg >= 70 && avg < 80) {
            System.out.print("B");
        } else if(avg >= 60 && avg < 70) {
            System.out.print("C");
        }
        else if(avg >= 36 && avg < 60) {
            System.out.print("C");
        }
        else {
            System.out.print("E");
        }


    }
}
