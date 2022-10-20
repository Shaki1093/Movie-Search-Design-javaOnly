import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame {
    //IGNORE THIS
    //THIS IS ME LEARNING JAVA SWING

    Frame(){
        //This is to change the icon
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\joshu\\kenzie\\Movie-Search-Design\\src\\main\\Images\\icon.png");
        this.setIconImage(imageIcon.getImage()); // Change icon of frame

        //Border
        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);

        //JLabels = this is used to display text and images
        JLabel label = new JLabel(); // Create Label
        label.setText("Hello World"); // set text Label
        label.setIcon(imageIcon); // This will add images
        label.setHorizontalAlignment(JLabel.CENTER); //This will align the icon Left,Center,Right
        label.setVerticalAlignment(JLabel.CENTER); //This will align the icon+text Up,center,Bottom
        label.setHorizontalTextPosition(JLabel.CENTER); //Left, Center or Right of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set Text Top, Center, Bottom
        label.setForeground(Color.WHITE); // This will set font color text
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); // This will set Font of text
        label.setIconTextGap(-10); // this will set the gap of text to image
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setBorder(border);
        label.setBounds(0,0,250,250); //this will position the content on the layout of the app?

        //Now lets go with JPanel this will help to hold other components
        //lets add a new label just for this panel
        JLabel panel1 = new JLabel();
        panel1.setText("Hello World");
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(0, 250, 500, 250);
        panel.setLayout(null);


        //Second way to do it
        //JFrame
        //This is to set up the frame
        this.setTitle("Movie Searcher"); //This set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //this.setResizable(false); // prevent frame to re size
        this.setSize(750,750); //set the x-dimension and y-dimension of the frame
        this.setLayout(null); // by doing this im setting a layout for the program
        this.setVisible(true); //making this visible
        panel.add(panel1);
        this.add(label);
        this.add(panel);




        //this.getContentPane().setBackground(Color.GRAY); // a way to change background color
    }
}
