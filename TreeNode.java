public class TreeNode{
	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	/*
	Constructor of TreeNode class
	*/
	public TreeNode(int data){

		this.data = data;
	}
	public TreeNode find(int data) {
		if(this.data == data){
			return this;
		}
		else if(data < this.data  && leftChild != null ){
			return leftChild.find(data);
		}
		else if(rightChild != null){
			return rightChild.find(data);
		}
		return null;
	}
	/*
	Inserting 
	*/
	public void insert(int data){

		if(data >= this.data){
			if(this.rightChild == null){
				this.rightChild = new TreeNode(data);
			}
			else{
				this.rightChild.insert(data);
			}
		}
		else{
			if(this.leftChild == null){
				this.leftChild = new TreeNode(data);
			}
			else{
				this.leftChild.insert(data);
			}

		}
	}
	//Getters
	public int getData(){

		return this.data;

	}
	public TreeNode getLeftChild(){
		return this.leftChild;
	}
	public TreeNode getRightChild(){

		return this.rightChild;
	}
	//Setters
	public void setLeftChild(TreeNode leftChild){

		this.leftChild = leftChild;
	}

	public void setRightChild(TreeNode rightChild){

		this.rightChild = rightChild;
	}
	/*
	Left most node is the node with the smallest element
	*/
	public int findMin(){

		if(this.leftChild == null){
			return this.data;
		}
		return this.leftChild.findMin();
	}
	/*
	RightMost node is the node with the largest element
	*/
	public int findMax(){
		if(this.rightChild == null){
			return this.data;
		}
		return this.rightChild.findMax();
	}
	/*

			55
		42	   57

		Print: 42, 55, 57
	*/
	public void traverseInOrder() {
		if (this.leftChild != null)
			this.leftChild.traverseInOrder();
		System.out.print(this + " ");
		if (this.rightChild != null)
			this.rightChild.traverseInOrder();
	}
	public int height() {
		if (isLeaf()) return 1;
		int left = 0;
		int right = 0;
		if (this.leftChild != null)
			left = this.leftChild.height();
		if (this.rightChild != null)
			right = this.rightChild.height();
		return (left > right) ? (left + 1) : (right + 1);
	}
	public boolean isLeaf() {
		return this.leftChild == null && this.rightChild == null;
	}
	
	public int numOfLeafNodes() {
		if (isLeaf()) return 1;
		int leftLeaves = 0;
		int rightLeaves = 0;
		if (this.leftChild != null)
			leftLeaves = leftChild.numOfLeafNodes();
		if (this.rightChild != null)
			rightLeaves = rightChild.numOfLeafNodes();
		return leftLeaves + rightLeaves;
	}
	public static TreeNode addSorted(int[] data, int start, int end) {
		if (end >= start) {
			int mid = (start+end)/2;
			TreeNode newNode = new TreeNode(data[mid]);
			newNode.leftChild = addSorted(data, start, mid-1);
			newNode.rightChild = addSorted(data, mid+1, end);
			return newNode;
		}
		return null;
	}
	//ToString

	public String toString(){
		return ""+this.data;
	}	
	
}