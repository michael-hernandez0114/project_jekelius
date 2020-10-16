package project_jekelius;
import javax.swing.JOptionPane;


public class jekelius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, parentName;
		
		int test = 5;
		
		name = JOptionPane.showInputDialog("Please enter a name");
		
		parentName = JOptionPane.showInputDialog("Please enter a parent name");
		
		Tree testing = new Tree(test, null, null);

	}
	
	

}
