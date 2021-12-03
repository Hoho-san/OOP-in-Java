import javax.swing.JOptionPane;

public class Greetme{
    public static void main(String[] args) {
        String name = "Jojo Javier";
        String message = String.format("%s , Log in Complete! ", name);
        JOptionPane.showMessageDialog(null, message);

    }
}
