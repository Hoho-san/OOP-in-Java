import java.util.Random;
import java.util.Scanner;

public class TossCoin {
    public static void main(String[] args) {
        char tryloop;
        Random rand = new Random();
        do{  
            System.out.println("------Toss a Coin-----");
            int coin_toss = rand.nextInt(2);
            System.out.print("Coin Flipped: ");
            if (coin_toss == 0){
                System.out.println("---Head---");
            }else {
                System.out.println("---Tail---");
            }
            Scanner loop = new Scanner(System.in);
            System.out.print("\nToss Again? (Y/N): ");
            tryloop = loop.next().charAt(0);
            System.out.println("\n");
            
        }while (tryloop == 'Y' || tryloop == 'y');
    }
}
