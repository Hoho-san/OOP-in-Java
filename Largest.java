import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("****Determines the Largest number****");

        int x, y;
        Scanner compare = new Scanner(System.in);
        System.out.print("Enter First number: ");
        x = compare.nextInt();
        System.out.print("Enter Second number: ");
        y = compare.nextInt();
        if ( x > y){
            System.out.println(x + " is greater than " + y);
        }
        else if( x < y){
            System.out.println(y + " is greater than " + x);
        }
        else {
            System.out.println(y + " is equal to " + x);
        }
        compare.close();
        
    }
    
}
