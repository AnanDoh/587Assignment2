package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeOperationsTest {
    @Test
    public void bogusTest() {
        // illustrates how to write a test
        // assertEquals(expected, expression_being_tested)
        assertEquals(2, 1 + 1);

        Node rootNode = new Node(5,null,null);
        assertEquals(0,TreeOperations.maxDepth(rootNode));

        Node newNode = new Node(10,rootNode,null);
        // now we have a tree combines the previous tree.
        // max depth should be 1.
        // contents of each node should be 5 and 10.
        assertEquals(1,TreeOperations.maxDepth(newNode));
    
    }
}
