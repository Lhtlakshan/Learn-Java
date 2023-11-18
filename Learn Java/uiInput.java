import javax.swing.JOptionPane;

public class uiInput {
	
	public static void main(String args[]){
		
		String name = JOptionPane.showInputDialog("Hi,What is your name ? ");
	
	    JOptionPane.showMessageDialog(null , "I love you " + name);
		
	}
}
