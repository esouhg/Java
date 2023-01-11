

public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
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
        //newNode becomes new head
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
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
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void removeFirst(){
        if(size==0){
            return;
        }
        head = head.next;
        size--;
    }
    public void removeLast(){
        if (size==0){
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node temp = head;
        for(int i=0; i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public int itrSearch(int key){
        Node temp = head;
        for(int i=0; i<size; i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public int recSearch(int key, int idx, Node temp){
        if(temp.data == key){
            return idx;
        }
        if(idx<size-1){
        return recSearch(key, idx+1, temp.next);}
        return -1;
    }
    // public void reverse(){
    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;
    //     while(curr!=null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;
    // }
    public void reverse(){
        Node t = null;
        Node point = head;
        Node nex = head;
        while(nex!=null){
            nex = point.next;
            point.next = t;
            t = point;
            point = nex;

        }
        head=t;
    }
    public void remove(int n){
        if(n==0){
            removeFirst();
            size--;
            return;
        }
        Node temp = head;
        Node temp2 = temp.next;
        for(int i=0; i<n-1; i++){
            temp = temp.next;
            temp2 = temp.next;
        }
        size--;
        temp.next= temp2.next;
    }
    public static boolean detcycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public void rmcycle(){
        Node slow = head;
        Node fast = head;
        int t=0;
        while(slow!=fast || t==0){
            t=1;
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.data);
        }
        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public boolean chekpalin(){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;
        
        Node t = null;
        Node point = mid;
        Node nex = mid;
        while(nex!=null){
            nex = point.next;
            point.next = t;
            t = point;
            point = nex;

        }
        slow.next=t;
        mid = slow.next;
        slow = head;
        while(mid !=null){
            if(slow.data!=mid.data){
                return false;
            }
            slow= slow.next;
            mid = mid.next;
        }
    return true;
    }
    public void zigzag(){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;
        
        Node t = null;
        Node point = mid;
        Node nex = mid;
        while(nex!=null){
            nex = point.next;
            point.next = t;
            t = point;
            point = nex;

        }
        slow.next=t;
        System.out.println(slow.data);
        print();
        Node strt = head;
        Node cup1 = head.next;
        Node cup2 = slow.next.next;
        while(slow.next!=null && slow != strt){
            strt.next = slow.next;
            strt.next.next = cup1;
            slow.next = cup2;
            strt = cup1;
            cup1 = strt.next;
            if(slow.next!=null){
            cup2 = slow.next.next;}
        }


        
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    //ll.addLast(8);
    //ll.print();
    ll.zigzag();
    ll.print();
    // Node temp = head;
    // while(temp.next!=null){
    //     temp=temp.next;
    // }
    // temp.next = head;
    // //     System.out.println(ll.detcycle());
    // System.out.println(detcycle());
    // ll.rmcycle();
    // System.out.println(detcycle());
        
    }
}
