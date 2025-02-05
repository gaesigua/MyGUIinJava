import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	
	static JFrame frame;
	static JLabel userNameLabel;
	static JTextField usernameText;
	static JLabel passwordLabel;
	static JPasswordField passwordText;
	static JButton loginButton;
	static JLabel successLogin;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		JPanel panel = new JPanel();

		
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		panel.setLayout(null);
		
		userNameLabel = new JLabel("Username");
		userNameLabel.setBounds(10, 20, 80, 25);
		panel.add(userNameLabel);
		
		
		usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 165, 25);
		panel.add(usernameText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		
		loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		loginButton.addActionListener(new GUI());
		
		successLogin = new JLabel("");
		successLogin.setBounds(10, 110, 300, 25);
		panel.add(successLogin);
		
		
		frame.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = usernameText.getText();
		String password = passwordText.getText();
//		System.out.println(user + ", " + password);
		
		if(user.equals("gaesigua") && (password.equals("abc123"))) {
			
			successLogin.setText("Login Successful!!!!!!!");
			
		}else {
			System.out.println("Wrong Username or Password");
		}
		
		
	}

}