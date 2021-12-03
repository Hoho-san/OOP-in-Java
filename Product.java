import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int firstNum, secondNum, thirdNum, product; 

        System.out.println("*****Product of three Intergers*****");
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNum = inputNumber.nextInt();
        System.out.print("Enter second number: ");
        secondNum = inputNumber.nextInt();
        System.out.print("Enter third number: ");
        thirdNum = inputNumber.nextInt();

        product = firstNum * secondNum * thirdNum;

        System.out.println("Product is: " + product);
        inputNumber.close();    // to remove memory leak
    }
}
