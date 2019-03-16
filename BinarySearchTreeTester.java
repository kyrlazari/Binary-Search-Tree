public class BinarySearchTreeTester{
	
	public static void main(String[] args) {
		int[] sample = {  500, 600,100 };
		BinarySearchTree bst = new BinarySearchTree();
		for (int x : sample) {
			bst.insert(x);
		}
		System.out.println(bst.find(-6));
		//Case 1 Delete
		bst.delete(100);	
	}
}