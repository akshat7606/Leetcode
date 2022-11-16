class linkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }    

    public static linkedlist insert(linkedlist list , int data){
        //for making the first node and storing the value in it and making the next pointer as null
        Node new_node = new Node(data);
        new_node.next = null;
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }
    public static void printlinkedlist(linkedlist list){
        Node currnode = list.head;
        while(currnode!=null){
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        printlinkedlist(list);
    }
}