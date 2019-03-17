public class BinarySearchTree{
	
	private TreeNode root;

	/*Insert data into BST,calling the method insert of TreeNode class 
	Complexicity:
		Best Case: O(1), empty BST.insert root.
		Worst Case: O(n)
	*/	
	public void insert(int data){
		if(root == null){
			this.root = new TreeNode(data);
		}
		else{
			root.insert(data);
		}
	}
	/*Finding a spesific node in BST using the method find of
	TreeNode class. Starting the search from the root.
	Complexicity:
		Best Case: O(1), root
		Worst Case: O(n) 
	*/
	public TreeNode find(int data){
		if(root != null){
			return root.find(data);
		}
		return null;	
	}
	public void delete(int data){
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		if(current == null){
			System.out.println("Empty BST !");
			return;
		}
		while(current != null && current.getData() != data){
			parent = current;
			if(data < current.getData()){
				current = current.getLeftChild();
				isLeftChild = true;
			}
			else{
				current = current.getRightChild();
				isLeftChild = false;	
			}	
		}
		if(current == null){

			System.out.println("This data not found in the tree !");
			return;
		}
		//Case 1 deleting node is a leaf
		if(current.getLeftChild() == null && current.getRightChild() == null ){
			if(current == null){
				return;
			}
			else{
				if(isLeftChild){
					System.out.println("Deletion of left child, "+ parent.getLeftChild());
					parent.setLeftChild(null);
					
				}
				else{
					System.out.println("Deletion of right child, "+parent.getRightChild());
					parent.setRightChild(null);
					
				}
			}	
		}
		//case 2, the node we want to delete has only one child
		else if( current.getRightChild() == null){
			if(current == null){
				root = current.getLeftChild();
				System.out.println("The root know is the right child, "+root.getData());	
			}
			else if(isLeftChild){

				parent.setLeftChild(current.getLeftChild());
				System.out.println("The new parent is, "+parent.getData());
			}
			else{
				parent.setRightChild(current.getLeftChild());
				System.out.println("The new parent is, "+parent.getData());
			}
		}
		else if( current.getLeftChild() == null){
			if(current == null){
				
				root = current.getRightChild();
				System.out.println("The root know is the right child, "+root.getData());
			}
			else if(isLeftChild){
				parent.setLeftChild(current.getRightChild());
				System.out.println("The new parent is, "+parent.getData());
			}
			else{

				parent.setRightChild(current.getRightChild());
				System.out.println("The new parent is, "+parent.getData());
			}
		}
		//Case 3, the node we want to delete has two children
		else {
			TreeNode successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isLeftChild) {
				parent.setLeftChild(successor);
			} else {
				parent.setRightChild(successor);
			}
			successor.setLeftChild(current.getLeftChild());
		}
			
	}
	/*
	Helper method to delete a node with two children
	*/
	private TreeNode getSuccessor(TreeNode node) {
		TreeNode parentOfSuccessor = node;
		TreeNode successor = node;
		TreeNode current = node.getRightChild();
		while (current != null) {
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeftChild();
		}
		if (successor != node.getRightChild()) {
			parentOfSuccessor.setLeftChild(successor.getRightChild());
			successor.setRightChild(node.getRightChild());
		}
		return successor;
	}
	/*
	Find the minimum element with recursion
	*/
	public Integer getMin(){
		if(this.root != null){

			return this.root.findMin();
		}
		return null;
	}
	/*
	Find the maximum element with recursion
	*/
	public Integer getMax(){
		if(this.root != null){
			return this.root.findMax();
		}
		return null;
	}

}