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

			
	}
}