package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TreeOperationsTest {
    @Test
    public void bogusTest() {
        // illustrates how to write a test
        // assertEquals(expected, expression_being_tested)
        assertEquals(2, 1 + 1);

        Node<Integer> rootNode = new Node(5,null,null);
        assertEquals(0,TreeOperations.maxDepth(rootNode));

        Node<Integer> newNode = new Node(10,rootNode,null);
        // now we have a tree combines the previous tree.
        // max depth should be 1.
        // contents of each node should be 5 and 10.
        assertEquals(1,TreeOperations.maxDepth(newNode));

        ArrayList<Node<Integer>> nodeList = TreeOperations.bfs(newNode);
        ArrayList<Integer> integerList = convertToContentList(nodeList);

        printIntegerArrayList(integerList);
    
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
