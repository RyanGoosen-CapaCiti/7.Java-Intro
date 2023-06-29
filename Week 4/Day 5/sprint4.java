import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sprint4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300)); // Set initial frame size

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create the checkbox
        JCheckBox checkBox = new JCheckBox("Do you receive a travel allowance");
        checkBox.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
        checkBox.setForeground(Color.WHITE);
        mainPanel.add(checkBox);

        // Create the panel to expand/shrink
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.LIGHT_GRAY);
        contentPanel.setPreferredSize(new Dimension(200, 100));
        mainPanel.add(contentPanel);

        // Create the button and radio buttons
        JButton button = new JButton("Click me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        // Group the radio buttons together
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);

        // Add the button and radio buttons to the content panel
        contentPanel.add(button);
        contentPanel.add(radioButton1);
        contentPanel.add(radioButton2);

        // Set the initial visibility of the components
        button.setVisible(false);
        radioButton1.setVisible(false);
        radioButton2.setVisible(false);

        // Add an action listener to the checkbox
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    // Checkbox is checked, enlarge the frame and show the components
                    frame.setSize(new Dimension(500, 400));
                    button.setVisible(true);
                    radioButton1.setVisible(true);
                    radioButton2.setVisible(true);
                } else {
                    // Checkbox is unchecked, restore the frame's original size and hide the components
                    frame.setSize(new Dimension(400, 300));
                    button.setVisible(false);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                }
            }
        });

        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
