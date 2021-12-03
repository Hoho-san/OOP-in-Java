import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        
        char tryloop;
        do{
            int prelimG, midtermG, semiG, finalG;
            float average;
            String name;
            Scanner student_name = new Scanner(System.in);
            System.out.print("Enter name of the Student: ");
            name = student_name.next();
            Scanner grade = new Scanner(System.in);
            System.out.print("Enter the Prelim Grade: ");
            prelimG = grade.nextInt();
            System.out.print("Enter the Midterm Grade: ");
            midtermG = grade.nextInt();
            System.out.print("Enter the Semi Final Grade: ");
            semiG = grade.nextInt();
            System.out.print("Enter the Final Grade: ");    
            finalG = grade.nextInt();
            
            average = (prelimG + midtermG + semiG + finalG)/4;

            System.out.printf("The Average of " + name + " is: %.2f", average, "\n");
            System.out.print("\nThe Remarks is: ");
            if (average > 75.0 ){
                System.out.println("Passed");
            }
            else if(average == 75){
                System.out.println("Fair");
            }
            else{
                System.out.println("Failed");
            }
            Scanner loop = new Scanner(System.in);
            System.out.print("Would you like to try again? (Y/N): ");
            tryloop = loop.next().charAt(0);
        }
        while (tryloop == 'Y' || tryloop == 'y');
    }
}