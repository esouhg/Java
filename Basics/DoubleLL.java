public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
    public Node head;
    public Node tail;
    public int size;

    
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //head becomes next
        newNode.next=head;
        head.prev = newNode;
        //newNode becomes new head
        head = newNode;
    }
    
    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newnode becomes next of tail
        tail.next=newNode;
        newNode.prev = tail;
        //newNode becomes new tail
        tail = newNode;
    }
    
    public void removeFirst(){
        if(size==0){
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void removeLast(){
        if(size==0){
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public void add(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        newNode.next= temp.next;
        temp.next = newNode;
        size++;
    }
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addLast(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.removeLast();
        dll.print();
    }
    
}
