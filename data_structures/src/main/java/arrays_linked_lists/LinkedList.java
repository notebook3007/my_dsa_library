package arrays_linked_lists;

public class LinkedList {
    
    private Node head;
    
    public void insertFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    
    public void insertLast(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
    
    public boolean deleteFirst() {
        if(head == null)
            return false;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return true;
    }
    
    public boolean deleteLast() {
        if(head == null)
            return false;
        if(head.next == null) {
            head = null;
            return true;
        }
        Node ptr1 = head;
        Node ptr2 = null;
        while(ptr1.next != null) {
            ptr2 = ptr1;
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
        return true;
    }
    
    public int size() {
        int size = 0;
        for(Node temp = head; temp != null; temp = temp.next)
            size++;
        return size;
    }
    
    public boolean contains(int data) {
        for(Node temp = head; temp != null; temp = temp.next) {
            if(temp.data == data)
                return true;
        }
        return false;
    }
    
    public boolean deleteAt(int pos) {
        if(pos <= 0 || pos > size())
            return false;
        
        if(pos == 1) {
            head = head.next;
            return true;
        }
        
        Node temp = head;
        Node ptr = null;
        for(int i=1; i!=pos; i++) {
            ptr = temp;
            temp = temp.next;
        }
        ptr.next = temp.next;
        temp.next = null;
        return true;
    }
    
    public boolean insertAt(int pos, int data) {
        if(pos <= 0 || pos > size()+1)
            return false;
    
        Node node = new Node(data);
        
        // Insert at beginning of linked list
        if (pos == 1) {
            node.next = head;
            head = node;
            return true;
        }
        
        Node temp = head;
        for(int i=1; i!=pos-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        for(Node temp = head; temp != null; temp = temp.next) {
            elements.append(temp.data).append(" ");
        }
        return elements.toString();
    }
    
}
