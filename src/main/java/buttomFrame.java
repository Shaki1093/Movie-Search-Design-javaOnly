import javax.swing.*;
import java.awt.*;


public class buttomFrame extends JFrame{
    //implements ActionListener
    //
    //IGNORE THIS
    //THIS IS ME LEARNING HOW TO DO JAVA SWING

    JButton button;
    JLabel label;
    JTextField textField;
    JPanel panel;

    buttomFrame(){
        ImageIcon icon = new ImageIcon("C:\\Users\\joshu\\kenzie\\Movie-Search-Design\\src\\main\\Images\\icon.png");


        label = new JLabel();
        label.setIcon(icon);
        //label.setBounds(100, 250,250,250);
        label.setVisible(false);

        button = new JButton();
        //button.setBounds(175, 100,250,100);
        button.setSize(100,50);
        //button.setLocation(JLabel.CENTER, JLabel.CENTER);
        button.addActionListener(e -> {
            System.out.println("Clicked!");
            label.setVisible(true);
        });
        button.setText("Click here");
        button.setFocusable(false);
        button.setEnabled(true);
        button.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.GRAY));


        panel = new JPanel();panel.setLayout(null);
        //panel.setBounds(0, 0, 500, 250);
        panel.setBackground(Color.CYAN);
        panel.setVisible(true);
        panel.add(button);
        button.setLocation(100,100);


        //Frame
        this.setTitle("Movie Searcher"); //This set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);// exit out of application
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(panel);
        this.add(label);

    }
}
