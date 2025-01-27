import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();

		
		myFrame.setSize(100,100);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(myPanel);
		
		
		
	}

}
