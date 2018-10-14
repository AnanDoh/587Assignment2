package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TreeOperationsTest {

    @Test
    public void depthTest() {

        Node<Integer> rootNode;

        rootNode = getNodeTree(1);
        assertEquals(0,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(2);
        assertEquals(1,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(3);
        assertEquals(2,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(4);
        assertEquals(2,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(5);
        assertEquals(1,TreeOperations.maxDepth(rootNode));

        rootNode = getNodeTree(6);
        assertEquals(4,TreeOperations.maxDepth(rootNode));
    
    }

    private void testContents()
    {
    	Node<Integer> rootNode = getNodeTree(4);
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

	    	case 5:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		Node<Integer> otherNode = new Node(10,null,null);
	    		rootNode = new Node(10,otherNode,rootNode);
	    		// depth is 1
		    	// contents are 10, 10, 5
		    	//     10
		    	//   /   \
		    	//  10	 5
		    	// /  \ / \
		    	return rootNode;
	    	}

	    	case 6:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(5,rootNode,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10   
		    	// /  \
		    	// 5  5
		    	// /
		    	// 5
	    		Node<Integer> copyNode = new Node(5,null,null);
	    		copyNode = new Node(10,copyNode,copyNode);
	    		copyNode = new Node(10,copyNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5

		    	rootNode = new Node(15,rootNode,copyNode);
		    	// depth is 4
		    	// contents are 15, 10, 10, 10, 10, 5, 5, 5, 5, 5
		    	//        15  
		    	//      /    \
		    	//     10    10
		    	//   /   \	 / \
		    	//  10      10  5
		    	// /  \     /
		    	// 5  5     5
		    	// /
		    	// 5

		    	return rootNode;
	    	}

    	}
    	return null;
    }

    private Node<Integer> getNodeTree(int treeNum)
    {

    	Node<Integer> rootNode;

    	switch(treeNum) {
    		case 1:
    		{
		    	rootNode = new Node(5,null,null);
		    	// depth is 0
		    	// contents are 5
		    	//    5
		    	//  /   \
		    	return rootNode;
	    	}

	    	case 2:
	    	{
	    		rootNode = new Node(5,null,null);
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
	    		rootNode = new Node(5,null,null);
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
	    		rootNode = new Node(5,null,null);
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

	    	case 5:
	    	{
	    		rootNode = new Node(5,null,null);
	    		Node<Integer> otherNode = new Node(10,null,null);
	    		rootNode = new Node(10,otherNode,rootNode);
	    		// depth is 1
		    	// contents are 10, 10, 5
		    	//     10
		    	//   /   \
		    	//  10	 5
		    	// /  \ / \
		    	return rootNode;
	    	}

	    	case 6:
	    	{
	    		rootNode = new Node(5,null,null);
	    		rootNode = new Node(5,rootNode,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10   
		    	// /  \
		    	// 5  5
		    	// /
		    	// 5
	    		Node<Integer> copyNode = new Node(5,null,null);
	    		copyNode = new Node(10,copyNode,copyNode);
	    		copyNode = new Node(10,copyNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5

		    	rootNode = new Node(15,rootNode,copyNode);
		    	// depth is 4
		    	// contents are 15, 10, 10, 10, 10, 5, 5, 5, 5, 5
		    	//        15  
		    	//      /    \
		    	//     10    10
		    	//   /   \	 / \
		    	//  10      10  5
		    	// /  \     /
		    	// 5  5     5
		    	// /
		    	// 5

		    	return rootNode;
	    	}

    	}
    	return null;
    }

    private <A> Boolean testContentEquality(ArrayList<Node<A>> array1, ArrayList<Node<A>>)
    {
    	if (array1.size() == array2.size())
    	{
    		for (int i = 0; i < array1.size(); i++)
    		{
    			if (array1.get(i) != array2.get(i))
    				return false;
    		}

    		return true;
    	}
    	return false;
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
