public class TestBST {
  public static void main(String[] args) {
	
    Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
    BST<Integer> intTree = new BST<>(numbers); 
    System.out.print("\nInorder (sorted): ");
    intTree.inorder();
  }
}
