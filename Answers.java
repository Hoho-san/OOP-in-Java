import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        int firstNum, secondNum, sum, difference, product, quotient;

        System.out.println("****Answer to All Operation****");
        Scanner operation = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        firstNum = operation.nextInt();
        System.out.print("Enter second Number: ");
        secondNum = operation.nextInt();

        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        product = firstNum * secondNum;
        quotient = firstNum / secondNum;

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        operation.close();
    } 
}
