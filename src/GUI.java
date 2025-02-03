import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		panel.setLayout(null);
		
		JLabel userNameLabel = new JLabel("Username");
		userNameLabel.setBounds(10, 20, 80, 25);
		panel.add(userNameLabel);
		
		
		JTextField usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 165, 25);
		panel.add(usernameText);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		JPasswordField passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		
		JButton loginButton = new JButton();
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		frame.setVisible(true);
		
		
		
		
		
		
	}

}
