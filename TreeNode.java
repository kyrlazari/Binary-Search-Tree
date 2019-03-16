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
	//ToString
	public String toString(){
		return "Data : "+this.data;
	}	
	
}