import java.util.Random;

public class Dice {
    public static void main(String args[]) {
        Random rand = new Random();
        for (int i = 1; i <= 1000; i++){
            int diceroll = rand.nextInt(6) + 1;
            System.out.println("Dice Roll " + i + " : " + diceroll);
        }
    }
}

