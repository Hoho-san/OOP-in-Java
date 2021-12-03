import java.util.Scanner;

public class aveOftheStudents {
    public static void main(String[] args) {
        int prelimG, midtermG, semiG, finalG;
        float average;
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter Prelim Grade: ");
        prelimG = grade.nextInt();
        System.out.print("Enter Midterm Grade: ");
        midtermG = grade.nextInt();
        System.out.print("Enter Semi Final Grade: ");
        semiG = grade.nextInt();
        System.out.print("Enter Final Grade: ");    
        finalG = grade.nextInt();
        
        average = (prelimG + midtermG + semiG + finalG)/4;

        System.out.printf("Your average is : %f", average);

        if (average >= 75.0 ){
            System.out.println("\nPassed!!!");
        }
        else{
            System.out.println("\nFailed!");
        }
        grade.close();
    }
}
