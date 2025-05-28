package arrays_linked_lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    
    @Test
    public void testInsertFirstAndDeleteFirst() {
        LinkedList ll = new LinkedList();
        ll.insertFirst(2);
        ll.insertFirst(5);
        Assertions.assertEquals("5 2", ll.toString().trim());
        
        ll.deleteFirst();
        Assertions.assertEquals("2", ll.toString().trim());
        ll.deleteFirst();
        Assertions.assertTrue(ll.toString().isBlank());
        Assertions.assertFalse(ll.deleteFirst());
    }
    
    @Test
    public void testInsertLastAndDeleteLast() {
        LinkedList ll = new LinkedList();
        ll.insertLast(2);
        ll.insertLast(5);
        Assertions.assertEquals("2 5", ll.toString().trim());
    
        ll.deleteLast();
        Assertions.assertEquals("2", ll.toString().trim());
        ll.deleteLast();
        Assertions.assertTrue(ll.toString().isBlank());
        Assertions.assertFalse(ll.deleteLast());
    }

    @Test
    public void testSize() {
        LinkedList ll = new LinkedList();
        Assertions.assertEquals(0, ll.size());
        ll.insertFirst(2);
        Assertions.assertEquals(1, ll.size());
        ll.insertFirst(5);
        Assertions.assertEquals(2, ll.size());
    }
    
    @Test
    public void testContains() {
        LinkedList ll = new LinkedList();
        Assertions.assertFalse(ll.contains(2));
        
        ll.insertFirst(2);
        ll.insertFirst(5);
        Assertions.assertFalse(ll.contains(-2));
        Assertions.assertTrue(ll.contains(5) && ll.contains(2));
    }
    
    @Test
    public void testInsertAt() {
        LinkedList ll = new LinkedList();
        Assertions.assertFalse(ll.insertAt(2, 10));
        
        ll.insertAt(1, 10);
        ll.insertAt(1, 18);
        ll.insertAt(3, 44);
        Assertions.assertEquals("18 10 44", ll.toString().trim());
        
        ll.insertAt(2, 5);
        ll.insertAt(4, 11);
        Assertions.assertEquals("18 5 10 11 44", ll.toString().trim());
    }
    
    @Test
    public void testDeleteAt() {
        LinkedList ll = new LinkedList();
        Assertions.assertFalse(ll.deleteAt(1));
        
        ll.insertLast(10);
        ll.deleteAt(1);
        Assertions.assertTrue(ll.toString().isBlank());
    
        ll.insertLast(14);
        ll.insertLast(24);
        ll.insertLast(34);
        ll.insertLast(44);
        Assertions.assertEquals("14 24 34 44", ll.toString().trim());
        ll.deleteAt(1);
        Assertions.assertEquals("24 34 44", ll.toString().trim());
        ll.deleteAt(3);
        Assertions.assertEquals("24 34", ll.toString().trim());
        ll.insertLast(100);
        ll.deleteAt(2);
        Assertions.assertEquals("24 100", ll.toString().trim());
    }
}
