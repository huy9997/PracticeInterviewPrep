class LinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d)  { data = d;  next=null; } // Constructor 
    } 
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
        llist.head  = new Node(1); 
        Node second = new Node(2); 
        Node third  = new Node(3);   
        Node fourth = new Node(4);
        llist.head.next = second; // Link first node with the second node 
        second.next = third; // Link second node with the third node 
        third.next = fourth; 
        llist.addNode(2);
       // llist.printList();
    } 
    public void printList() 
    { 
        Node currentNode = head; 
        while (currentNode != null) 
        { 
            System.out.println("Printing all the nodes: "+currentNode.data+" "); 
            currentNode = currentNode.next; 
        } 
    }
    public void addNode(int nodeposition)
    {
        Node currentNode = head; 
        Node newNode = new Node(5);
        int currentPosition = 0; 
        while(currentNode != null)
        {
            currentPosition++;
            if(currentPosition==nodeposition){
                newNode = currentNode.next;
                System.out.println("New Node "+newNode.data);
                System.out.println("New currentnode "+ currentNode.data);
                currentNode.next = newNode; 
            }
            currentNode = currentNode.next;
        }
    }
} 