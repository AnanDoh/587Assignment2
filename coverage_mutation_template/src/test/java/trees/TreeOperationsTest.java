package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TreeOperationsTest {

    @Test
    public void depthTest() {

        Node<Integer> rootNode = new Node(5,null,null);
        assertEquals(0,TreeOperations.maxDepth(rootNode));

        Node<Integer> newNode = new Node(10,rootNode,null);
        // now we have a tree combines the previous tree.
        // max depth should be 1.
        // contents of each node should be 5 and 10.

        // 10
        // |
        // 5

        assertEquals(1,TreeOperations.maxDepth(newNode));

        Node<Integer> nextNode = new Node(10,newNode,null);
        // adds another node to left. depth is now 2.

        // 10
        // |
        // 10
        // |
        // 5

        assertEquals(2,TreeOperations.maxDepth(nextNode));

        newNode = new Node(10,rootNode,rootNode);
        nextNode = new Node(7,null,newNode);

        // 	  7
        //  /   \
        // 	    10
        //   /    \
        //  5	   5

        assertEquals(2,TreeOperations.maxDepth(nextNode));

        ArrayList<Node<Integer>> nodeList = TreeOperations.bfs(nextNode);
        ArrayList<Integer> integerList = convertToContentList(nodeList);

        printIntegerArrayList(integerList);
    
    }

    private Node<Integer> getNodeTree1()
    {
    	Node<Integer> rootNode = new Node(5,null,null);
    	// depth is 0
    	// contents are 5
    	//    5
    	//  /   \
    	return rootNode;
    }

    private ArrayList<Integer> convertToContentList(ArrayList<Node<Integer>> originalList)
    {
    	ArrayList<Integer> newList = new ArrayList<> ();
    	for (int i = 0; i < originalList.size(); i++)
    	{
    		newList.add(originalList.get(i).contents);
    	}
    	return newList;
    }

    private void printIntegerArrayList(ArrayList<Integer> originalList)
    {
    	for (int i = 0; i < originalList.size(); i++)
    	{
    		System.out.println(originalList.get(i));
    	}
    }
}
