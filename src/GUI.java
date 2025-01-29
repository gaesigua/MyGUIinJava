import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();

		
		myFrame.setSize(400,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		myFrame.add(myPanel);
		
		
		myPanel.setLayout(null);
		
		JLabel label = new JLabel("Username");
		label.setBounds(10, 20, 80, 25);
		
		myPanel.add(label);
		
		
		
		
	}

}
