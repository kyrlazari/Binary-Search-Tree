public class BinarySearchTreeTester{
	
	public static void main(String[] args) {
		int[] sample = { 212, 580, 6, 7, 28, 84, 112, 434};
		BinarySearchTree bst = new BinarySearchTree();
		for (int x : sample) {
			bst.insert(x);
		}
		System.out.println(bst.find(-6));
	}
}