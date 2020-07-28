import java.util.Collections;
import java.util.List;

/**
 * A program to find longest path of consecutive integers in an N-Tree.
 * 
 * @author Naciye Guzel
 *
 */
public class Tree {
   private int mValue;
   private List<Tree> mChildren;

   public Tree(int value, List<Tree> children) {
       mValue = value;
       mChildren = Collections.unmodifiableList(children);   
   }
   
   /**
    * A wrapper over findLongestPath(Tree tree, int expected, int currLen, int longestLen) function.
    * @return the length of the longest path of consecutive integers in a tree.
    */
   public int longestPath() {
	   int currLen = 0;
	   int longestLen = 0;
	   return findLongestPath(this.mValue, currLen, longestLen); 
   }
   
  
   /**
    * 
    * @param expected is the expected value of the current node to find consecutive integers.
    * @param currLen is the current length of the path of consecutive integers from current node to top.
    * @param longestLen is the length of the longest path of consecutive integers in traversed part of tree.
    * @return the length of the longest path of consecutive integers in a tree.
    */
   public int findLongestPath(int expected, int currLen, int longestLen) {	 
	   currLen = (this.mValue == expected)? currLen + 1: 1;
	   longestLen = Math.max(currLen, longestLen);	  
	   
	   for (int i = 0; i < this.mChildren.size(); i++) {		   		   		   
		   longestLen = this.mChildren.get(i).findLongestPath(this.mValue + 1, currLen, longestLen);		   
	   }
	   return longestLen;
   }	
}
