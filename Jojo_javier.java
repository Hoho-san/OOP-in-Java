import java.util.Scanner;

public class Jojo_javier {
    String acc_name;        // Create a class attribute
    int acc_num;
    Jojo_javier(int number, String name){  // class constructor for the Jojo_javier class
        acc_name = name;        // Set the initial value for the class attribute
        acc_num = number;
    }
    public static void main(String[] args) {
        char tryloop;
        String acc_name01;
        int acc_num01;
        int transaction, deposit, withdraw;
        float balance = 0;
        float y = balance, x = 0;
        do{     // start of the loop
            System.out.println("********* AUTOMATED TELLER MACHINE ************");
            Scanner name = new Scanner(System.in);
            System.out.print("Enter Account Name: ");
            acc_name01 = name.next();
            System.out.print("Enter Account Number: ");
            Scanner num = new Scanner(System.in);
            acc_num01 = num.nextInt();
            System.out.println("Choose Transaction: \t[1] Deposit\n \t\t\t[2] Withdrawal");
            transaction = num.nextInt();

            Jojo_javier user = new Jojo_javier(acc_num01, acc_name01);  // Create an object of class Jojo_javier (This will call the constructor)

                if (transaction == 1){
                    System.out.print("Amount to Deposit: ");
                    deposit = num.nextInt();
                    System.out.println(user.acc_name + ", " + user.acc_num);    // to get the class attribute from the constructor
                    x = balance;
                    balance = x + deposit;
                     System.out.printf("Balance is: %.2f", balance, "\n");  // to have a two decimal point value

                }else if (transaction == 2){
                    System.out.print("Amount to Withdraw: ");
                    withdraw = num.nextInt();
                    System.out.println(user.acc_name + ", " + user.acc_num);    // to get the class attribute from the constructor
                    y = balance;
		            balance = y - withdraw;
                    if(balance < 0){        // nested if
                        System.out.println("Invalid Transaction!!!\nRetry the Process!\n");
                        break;
                    }
                    System.out.printf("Balance is: %.2f", balance, "\n");   // to have a two decimal point value
                }

            Scanner loop = new Scanner(System.in);
            System.out.print("\nDo you want to enter new transaction? (Y/N): ");
            tryloop = loop.next().charAt(0);
            System.out.println("\n\n\n");
            
        }while (tryloop == 'Y' || tryloop == 'y'); // this will  do the loop
    }
}
