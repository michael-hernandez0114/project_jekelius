package project_jekelius;
import javax.swing.JOptionPane;


public class jekelius {
	
	private Tree root;
	
	public void makeSimpleTree() {
		
		Tree first = new Tree("Mario");
		Tree second = new Tree("Luigi");
		Tree third = new Tree("Prince");
		Tree fourth = new Tree("Karl");
		Tree fifth = new Tree("Leah");
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		
	}
	
	public void traverseTree(Tree root) {
		if(root ==null) {
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Name is: " + root.name + " ");
		traverseTree(root.left);
		traverseTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, parentName;
		
		int test = 5;
		
		name = JOptionPane.showInputDialog("Please enter a name");
		
		parentName = JOptionPane.showInputDialog("Please enter a parent name");
		
		jekelius testing = new jekelius();
		
		testing.makeSimpleTree();
		testing.traverseTree(testing.root);
		
		
		
		// make tree with name and parent relationships
		// take input to see if name is in the tree
		// if name is in the tree, output the root node
		// else, print a statement that name is not found

	}
	
	

}
