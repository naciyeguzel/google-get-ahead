import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Naciye Guzel
 *
 */
public class TreeTest {

	@Test
	public void test1() {
		//				1
		//			2
		//		3	  10
		//	4		11
		
		List<Tree> children4 = new LinkedList<Tree>();
		Tree tree4 = new Tree(4, children4); 

		List<Tree> children3 = new LinkedList<Tree>();
		children3.add(tree4);
		Tree tree3 = new Tree(3, children3); 

		List<Tree> children11 = new LinkedList<Tree>(); // does not children
		Tree tree11 = new Tree(11, children11); 
		
		List<Tree> children10 = new LinkedList<Tree>();
		children10.add(tree11);
		Tree tree10 = new Tree(10, children10); 

		List<Tree> children2 = new LinkedList<Tree>();
		children2.add(tree3);
		children2.add(tree10);
		Tree tree2 = new Tree(2, children2); 

		List<Tree> children1 = new LinkedList<Tree>();
		children1.add(tree2);

		Tree tree = new Tree(1, children1);
		assertEquals(4, (int) tree.longestPath());
	}

	@Test
	public void test2() {
		//			2
		//		4
		//	5	  10
		//6
		
		List<Tree> children6 = new LinkedList<Tree>();
		Tree tree6 = new Tree(6, children6); 

		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree6);
		Tree tree5 = new Tree(5, children5); 

		List<Tree> children10 = new LinkedList<Tree>();
		Tree tree10 = new Tree(10, children10); 

		List<Tree> children4 = new LinkedList<Tree>();
		children4.add(tree5);
		children4.add(tree10);
		Tree tree4 = new Tree(4, children4); 

		List<Tree> children2 = new LinkedList<Tree>();
		children2.add(tree4); 

		Tree tree = new Tree(2, children2);
		assertEquals(3, (int) tree.longestPath());
	}

	@Test
	public void test3() {
		//						1
		//					2
		//				3	  
		//			4		
		//		5
		//	6
		//7
		
		List<Tree> children7 = new LinkedList<Tree>();
		Tree tree7 = new Tree(7, children7); 	
		
		List<Tree> children6 = new LinkedList<Tree>();
		children6.add(tree7);
		Tree tree6 = new Tree(6, children6); 
		
		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree6);
		Tree tree5 = new Tree(5, children5); 
		
		List<Tree> children4 = new LinkedList<Tree>();
		children4.add(tree5);
		Tree tree4 = new Tree(4, children4); 
		
		List<Tree> children3 = new LinkedList<Tree>();
		children3.add(tree4);
		Tree tree3 = new Tree(3, children3); 	
		
		List<Tree> children2 = new LinkedList<Tree>();
		children2.add(tree3);
		Tree tree2 = new Tree(2, children2); 
		
		List<Tree> children1 = new LinkedList<Tree>();
		children1.add(tree2);
		
		Tree tree = new Tree(1, children1);
		assertEquals(7, (int) tree.longestPath());
	}
	
	@Test
	public void test4() {
		//						1
		//					2
		//				5	  
		//			8		
		//		9
		//	10
		//11
		
		List<Tree> children11 = new LinkedList<Tree>();
		Tree tree11 = new Tree(11, children11);
		
		List<Tree> children10 = new LinkedList<Tree>();
		children10.add(tree11);
		Tree tree10 = new Tree(10, children10); 	
		
		List<Tree> children9 = new LinkedList<Tree>();
		children9.add(tree10);
		Tree tree9 = new Tree(9, children9); 
		
		List<Tree> children8 = new LinkedList<Tree>();
		children8.add(tree9);
		Tree tree8 = new Tree(8, children8); 
		
		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree8);
		Tree tree5 = new Tree(5, children5); 	 	
		
		List<Tree> children2 = new LinkedList<Tree>();
		children2.add(tree5);
		Tree tree2 = new Tree(2, children2); 
		
		List<Tree> children1 = new LinkedList<Tree>();
		children1.add(tree2);
		
		Tree tree = new Tree(1, children1);
		assertEquals(4, (int) tree.longestPath());
	}
	
	@Test
	public void test5() {
		//	1
		List<Tree> children1 = new LinkedList<Tree>();
		
		Tree tree = new Tree(1, children1);
		assertEquals(1, (int) tree.longestPath());
	}
	
	@Test
	public void test6() {
		//							5
		//					6		7		20
		//						8		12		21
		//					9						22
		//				15		10						23
		//													24
		//														25
		
		List<Tree> children15 = new LinkedList<Tree>();
		Tree tree15 = new Tree(15, children15); 	
		
		List<Tree> children10 = new LinkedList<Tree>();
		Tree tree10 = new Tree(10, children10); 
		
		List<Tree> children9 = new LinkedList<Tree>();
		children9.add(tree15);
		children9.add(tree10);
		Tree tree9 = new Tree(9, children9); 
		
		List<Tree> children8 = new LinkedList<Tree>();
		children8.add(tree9);
		Tree tree8 = new Tree(8, children8); 
		
		List<Tree> children12 = new LinkedList<Tree>();
		Tree tree12 = new Tree(12, children12); 	
		
		List<Tree> children6 = new LinkedList<Tree>();
		Tree tree6 = new Tree(6, children6); 
		
		List<Tree> children7 = new LinkedList<Tree>();
		children7.add(tree8);
		children7.add(tree12);
		Tree tree7 = new Tree(7, children7); 
		
		List<Tree> children25 = new LinkedList<Tree>();
		Tree tree25 = new Tree(25, children25); 
		
		List<Tree> children24 = new LinkedList<Tree>();
		children24.add(tree25);
		Tree tree24 = new Tree(24, children24); 
		
		List<Tree> children23 = new LinkedList<Tree>();
		children23.add(tree24);
		Tree tree23 = new Tree(23, children23); 
		
		List<Tree> children22 = new LinkedList<Tree>();
		children22.add(tree23);
		Tree tree22 = new Tree(22, children22); 
		
		List<Tree> children21 = new LinkedList<Tree>();
		children21.add(tree22);
		Tree tree21 = new Tree(21, children21); 
		
		List<Tree> children20 = new LinkedList<Tree>();
		children20.add(tree21);
		Tree tree20 = new Tree(20, children20); 
		
		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree6);
		children5.add(tree7);
		children5.add(tree20);
		
		Tree tree = new Tree(5, children5);
		assertEquals(6, (int) tree.longestPath());
	}
	
	@Test
	public void test7() {
		//							5
		//					6		7		20
		//						8		12		
		//					9						
		//				15		10						
		//													
		//														
		
		List<Tree> children15 = new LinkedList<Tree>();
		Tree tree15 = new Tree(15, children15); 	
		
		List<Tree> children10 = new LinkedList<Tree>();
		Tree tree10 = new Tree(10, children10); 
		
		List<Tree> children9 = new LinkedList<Tree>();
		children9.add(tree15);
		children9.add(tree10);
		Tree tree9 = new Tree(9, children9); 
		
		List<Tree> children8 = new LinkedList<Tree>();
		children8.add(tree9);
		Tree tree8 = new Tree(8, children8); 
		
		List<Tree> children12 = new LinkedList<Tree>();
		Tree tree12 = new Tree(12, children12); 	
		
		List<Tree> children6 = new LinkedList<Tree>();
		Tree tree6 = new Tree(6, children6); 
		
		List<Tree> children7 = new LinkedList<Tree>();
		children7.add(tree8);
		children7.add(tree12);
		Tree tree7 = new Tree(7, children7); 

		List<Tree> children20 = new LinkedList<Tree>();
		Tree tree20 = new Tree(20, children20); 
		
		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree6);
		children5.add(tree7);
		children5.add(tree20);
		
		Tree tree = new Tree(5, children5);
		assertEquals(4, (int) tree.longestPath());
	}	
	
	@Test
	public void test13() {
		//						5
		//					6		7
		//						8		12	  
		//					9		
		//				15		10
		
		List<Tree> children15 = new LinkedList<Tree>();
		Tree tree15 = new Tree(15, children15); 	
		
		List<Tree> children10 = new LinkedList<Tree>();
		Tree tree10 = new Tree(10, children10); 
		
		List<Tree> children9 = new LinkedList<Tree>();
		children9.add(tree15);
		children9.add(tree10);
		Tree tree9 = new Tree(9, children9); 
		
		List<Tree> children8 = new LinkedList<Tree>();
		children8.add(tree9);
		Tree tree8 = new Tree(8, children8); 
		
		List<Tree> children12 = new LinkedList<Tree>();
		Tree tree12 = new Tree(12, children12); 	
		
		List<Tree> children6 = new LinkedList<Tree>();
		Tree tree6 = new Tree(6, children6); 
		
		List<Tree> children7 = new LinkedList<Tree>();
		children7.add(tree8);
		children7.add(tree12);
		Tree tree7 = new Tree(7, children7); 
		
		List<Tree> children5 = new LinkedList<Tree>();
		children5.add(tree6);
		children5.add(tree7);
		
		Tree tree = new Tree(5, children5);
		assertEquals(4, (int) tree.longestPath());
	}
}
