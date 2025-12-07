public class MyLinkedlist {
    // this is node which represent the head of any linkedlist
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    // add element in last
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // print value of linked list
    public void displayVal(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
