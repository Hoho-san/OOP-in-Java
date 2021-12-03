import java.util.Scanner;

public class Compare5nums {
    public static void main(String[] args) {
        int largest,smallest;
        int[] num = new int[5];
        Scanner determine = new Scanner(System.in);
        System.out.println("***Largest and Smallest***");
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a Number: ");
            num[i] = determine.nextInt();
        }
        largest = num[0];
        for( int i = 1; i < 5; i++) {
            if(largest < num[i]){
                largest = num[i];        
            }    
        } 
        System.out.println("The largest number is " + largest );
        smallest = num[0];
        for( int i = 1; i < 5; i++) {
            if(largest > num[i]){
                largest = num[i];        
            }    
        } 
        System.out.println("The smallest number is " + smallest );
        determine.close();
    }
}
