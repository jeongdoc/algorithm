import org.junit.Test;

public class LeetCodeEasy {

	@Test
	public void test() {
		SameTree t = new SameTree();
		
		SameTree fstTree = null;
		SameTree addFstTree = new SameTree(1);
		fstTree = addFstTree;
		addFstTree.left = new SameTree(2);
		addFstTree = addFstTree.left;
		addFstTree.right = new SameTree(1);
		
		SameTree sndTree = null;
		SameTree addSndTree = new SameTree(1);
		sndTree = addSndTree;
		addSndTree.left = new SameTree(1);
		addSndTree = addSndTree.left;
		addSndTree.right = new SameTree(2);
		
		t.isSameTree(fstTree, sndTree);
		
	}

	@Test
	public void HappyNumber() {
		HappyNumber.main(null);
	}

}
