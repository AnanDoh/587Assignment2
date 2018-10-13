package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TreeOperationsTest {

    @Test
    public void depthTest() {

        Node<Integer> rootNode = getNodeTree(1);
        assertEquals(0,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(2);
        assertEquals(1,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(3);
        assertEquals(2,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(4);
        assertEquals(2,TreeOperations.maxDepth(rootNode));

        ArrayList<Node<Integer>> nodeList = TreeOperations.bfs(rootNode);
        ArrayList<Integer> integerList = convertToContentList(nodeList);

        printIntegerArrayList(integerList);
    
    }

    private Node<Integer> getNodeTree(int treeNum)
    {
    	switch(treeNum) {
    		case 1:
    		{
		    	Node<Integer> rootNode = new Node(5,null,null);
		    	// depth is 0
		    	// contents are 5
		    	//    5
		    	//  /   \
		    	return rootNode;
	    	}

	    	case 2:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
		    	// depth is 1
		    	// contents are 5, 10
		    	//    10
		    	//  /   \
		    	// 5   
		    	return rootNode;
	    	}

	    	case 3:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
	    		rootNode = new Node(7,rootNode,null);
	    		// depth is 2
		    	// contents are 7, 10, 5
		    	//     7
		    	//   /   \
		    	//  10
		    	//  /
		    	// 5 
		    	return rootNode;
	    	}

	    	case 4:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);
	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5
		    	return rootNode;
	    	}
    	}
    	return null;
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
