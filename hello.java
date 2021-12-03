import javax.swing.JOptionPane;

public class hello{
    public static void main(String[] args) {
        String name = "Jojo Javier";
        String message = String.format("%s , Log in Complete! ", name);
        JOptionPane.showMessageDialog(null, message);

    }
}