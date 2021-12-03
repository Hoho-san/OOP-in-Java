import javax.swing.*;
import java.awt.*;
class Smiley extends JPanel{
    //Driver function
    public static void main(String args[]){
        //Create a frame
        JFrame frame = new JFrame("Thinking Emoji");
        frame.setSize(500,500);
        frame.setBackground(Color.white); 
        Smiley panel=new Smiley();
        frame.add(panel);
        //Set default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    //function to draw the shapes
    public void paint(Graphics g){
        //Change color to yellow
        g.setColor(Color.yellow);
        //Draw and fill the face
        g.drawArc(100,100,250,250,0,360);
        g.fillArc(100,100,250,250,0,360);
        //Change color to black
        g.setColor(Color.black);
        //Draw the left eye
        g.drawArc(170,185,35,35,100,360);
        g.fillArc(170,185,35,35,100,360);
        g.fillRect(170, 180, 35, 5);
        //Draw the right eye
        g.drawArc(255,185,35,35,0,360);
        g.fillArc(255,185,35,35,0,360);
        g.drawArc(245,175,55,55,0,360);
        g.fillRect(255, 160, 35, 5);
        g.drawRect(300, 200, 35, 5);
        g.fillRect(300, 200, 35, 5);
        g.fillRect(335, 200, 5, 150);
        //Draw the smile
        g.drawRect(195, 290, 65, 10);
        g.fillRect(195, 290, 65, 10);
           
    }
}