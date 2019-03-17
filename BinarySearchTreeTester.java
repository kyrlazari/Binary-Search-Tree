public class BinarySearchTreeTester{
	
	public static void main(String[] args) {
		//int[] sample = {  500, 600,100} for case 1 delete
		//int[] sample = {  500, 600,100,50,75 }; for case 2 delete
		int[] sample = {  500, 600,100,150,50,75 };
		BinarySearchTree bst = new BinarySearchTree();
		for (int x : sample) {
			bst.insert(x);
		}
		System.out.println(bst.find(-6));
		
		//Case1
		//bst.delete(100);		
		
		//Case 2 Delete
		/*System.out.println(bst.find(100).getLeftChild() + " " +bst.find(100).getRightChild() );		
		bst.delete(50);	
		System.out.println(bst.find(100).getLeftChild() + " " +bst.find(100).getRightChild() );	
		*/
		//Case 3 Delete
		System.out.println(bst.find(100).getLeftChild() + " " +bst.find(100).getRightChild() );		
		bst.delete(100);	
		System.out.println(bst.find(150).getLeftChild() + " " +bst.find(50).getRightChild() );	

		System.out.println("The minimum is "+bst.getMin());

		System.out.println("The maximum is "+bst.getMax());	
		System.out.println("Traverse in order : ");
		bst.traverseInOrder();

	}
}