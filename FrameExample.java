import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;


public class FrameExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("MyFrame");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label1 = new JLabel("My name is sandesh");
        JLabel label2 = new JLabel("Hello, World!");
        JLabel label3 = new JLabel("The End");

        label1.setBounds(10,0,200,100);
        label2.setBounds(10,20,200,100);
        label3.setBounds(50,10,200,100);

        panel1.setBackground(Color.RED);
        panel1.setBounds(100,0,200,100);
        panel1.setLayout(null);

        panel2.setBackground(Color.YELLOW);
        panel2.setBounds(100,120,200,100);
        panel2.setLayout(null);

        panel1.add(label1);
        panel1.add(label2);
        panel2.add(label3);
        
        
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.add(panel2);
        
        

    

    }
    
}
