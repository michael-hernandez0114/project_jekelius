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
		Tree sixth = new Tree("Mark");
		Tree seventh = new Tree("Henry");
		Tree eighth = new Tree("Bruce");
		Tree ninth = new Tree("Dash");
		Tree tenth = new Tree("Drew");
		Tree eleventh = new Tree("Betsy");
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		fourth.left = eighth;
		fourth.right = ninth;
		
		third.left = sixth;
		third.right = seventh;
		
		sixth.left = tenth;
		sixth.right = eleventh;
			
		
	}
	
	public void initializeTree() {
		
		Tree rootNode = new Tree("root");
		
		root = rootNode;
	}
	
	
	public void addTreeNode(Tree root, String childName, String parentName) {
		
		//traverse the tree to find the parent name node
		//then add the child in the left or right node
		
		
	}
	
	public boolean findGivenName(Tree node, String name) {
		
		boolean left, right;
		
		
		if(node == null) {
			return false;
		}
		
		if(node.name.equals(name)) {
			//JOptionPane.showMessageDialog(null, "Found name");
			return true;
		}
		
		left = findGivenName(node.left, name);
		
		right = findGivenName(node.right, name);
		
//		if(findGivenName(node.right, name)) {
//			
//			//JOptionPane.showMessageDialog(null, "Oldest ancestor is: " + name);
//			
//			return true;
//		}
		return left || right;
	}
	
	public void traverseTree(Tree root) {
		if(root == null) {
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Name is: " + root.name + " ");
		traverseTree(root.left);
		traverseTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, parentName;
		
		boolean foundName;
		
		//int entries = 0;
		
		//boolean keepEnteringNodes = true;
		
//		jekelius familyTree = new jekelius();
//		
//		familyTree.initializeTree();
//			
		name = JOptionPane.showInputDialog("Please enter a name");
		//parentName = JOptionPane.showInputDialog("Please enter a parent name");
			
		JOptionPane.showMessageDialog(null, "You entered: " + name);
		jekelius tree = new jekelius();
		
		tree.makeSimpleTree();
		//tree.traverseTree(tree.root);
		foundName = tree.findGivenName(tree.root, name);
		
		//JOptionPane.showMessageDialog(null, "Found name: " + foundName);
		
		if(foundName) {
			JOptionPane.showMessageDialog(null, "Input name was found!\nAncestor is: " + tree.root.name);
		}
		else {
			JOptionPane.showMessageDialog(null, "No ancestor found for: " + name);
		}
		
		
		
		// make tree with name and parent relationships
		// take input to see if name is in the tree
		// if name is in the tree, output the root node
		// else, print a statement that name is not found

	}
	
	

}
