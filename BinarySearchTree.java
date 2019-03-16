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
			
	}
}