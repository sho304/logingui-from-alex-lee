import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class javaGui implements ActionListener{
  private static JLabel success;
  private static JLabel userLabel;
  private static JLabel passwordLabel;
  private static JButton button;
  private static JTextField usertext;
  private static JPasswordField passwordField;
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    frame.setSize(320, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(panel);
    
    panel.setLayout(null);


    //user
    userLabel = new JLabel("User");
    userLabel.setBounds(10, 20, 80, 25);
    panel.add(userLabel);

    
    usertext = new JTextField(20);
    usertext.setBounds(100, 20, 165, 25);
    panel.add(usertext);
    
    //password
    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);

    passwordField = new JPasswordField();
    passwordField.setBounds(100, 50, 165, 25);
    panel.add(passwordField);

    //button
    button = new JButton("Login");
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new javaGui());
    panel.add(button);

    //success login
    success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);


    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String user = usertext.getText();
    String password = passwordField.getText();

    if(user.equals("Sho") && password.equals("12345")) {
      success.setText("Login successful!");
    }else {
      success.setText("Uncorrect username and password!");
    }
  }
}