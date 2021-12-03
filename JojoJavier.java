import java.util.Scanner;

public class JojoJavier {
    String employeeName;        // Create a class attribute
    JojoJavier(String name){  // class constructor for the Jojo_javier class
        employeeName = name;        // Set the initial value for the class attribute
    }
    public static void main(String[] args) {
        String name;
        int statcode;
        double basicPay, tax, totalTax, netIncome;
        char tryloop;

        do{
            System.out.println("************** EMPLOYEE PAYROLL ****************");
            Scanner employee = new Scanner(System.in);
            System.out.print("Enter Employee Name: ");
            name = employee.next();
            System.out.print("Enter Employee Status Code: ");
            statcode = employee.nextInt();
            System.out.println("(Choose 1 if Casual, 2 if Regular, and 3 if Manager)");

            JojoJavier user = new JojoJavier(name);  // Create an object of class Jojo_javier (This will call the constructor)

            if (statcode == 1){
                basicPay = 10000.00;
                tax = 0.05;
                totalTax = basicPay*tax;
                netIncome = basicPay - totalTax;
                System.out.printf("The Basic Pay is: %.2f" , basicPay , "\n");
                System.out.printf("\nThe Tax is: %.2f", totalTax);
                System.out.printf("\nThe net Income of " + user.employeeName + " is: %.2f", netIncome , "\n");

            }else if(statcode == 2){
                basicPay = 15000.00;
                tax = 0.10;
                totalTax = basicPay*tax;
                netIncome = basicPay - totalTax;
                System.out.printf("The Basic Pay is: %.2f" , basicPay , "\n");
                System.out.printf("\nThe Tax is: %.2f", totalTax );
                System.out.printf("\nThe net Income of " + user.employeeName + " is: %.2f", netIncome , "\n");

            }else if(statcode == 3){
                basicPay = 25000.00;
                tax = 0.15;
                totalTax = basicPay*tax;
                netIncome = basicPay - totalTax;
                System.out.printf("The Basic Pay is: %.2f" , basicPay , "\n");
                System.out.printf("\nThe Tax is: ", totalTax);
                System.out.printf("\nThe net Income of " + user.employeeName + " is: %.2f", netIncome , "\n");

            }else {
                System.out.println("Undefined status code!");
            }
            System.out.println("\n\n************************************************************");

            Scanner loop = new Scanner(System.in);
            System.out.print("\nDo you want to Enter new code? (Y/N): ");
            tryloop = loop.next().charAt(0);
            System.out.println("\n\n");
        }while (tryloop == 'Y' || tryloop == 'y'); // this will  do the loop

    }
}
