import javax.swing.*;
import java.awt.*;

public class SearchBoxFrame extends JFrame {

    SearchBoxFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Search");

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));

        button.addActionListener(e -> {
            System.out.println(textField.getText());
        });

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}
