public class test {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }

    public static test insert(test linkedlist, int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(linkedlist.head == null){
            linkedlist.head = new_node;
        }
        else{
            Node last = linkedlist.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new_node;
        }

        return linkedlist;
    }

    public static void printlinkedlist(test linkedlist){
        Node currnode = linkedlist.head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        test linkedlist = new test();

        linkedlist = insert(linkedlist,1);
        linkedlist = insert(linkedlist,2);
        linkedlist = insert(linkedlist,3);
        linkedlist = insert(linkedlist,4);
        linkedlist = insert(linkedlist,5);

        printlinkedlist(linkedlist);

    }
}
