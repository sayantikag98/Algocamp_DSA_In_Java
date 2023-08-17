package Lec34.ProblemSolvingLinkedList3.DoublyLinkedListImplementationDemo;

public class MyDoublyLinkedList {
    Node head;
    int size;

    MyDoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    public Node getHead(){
        return this.head;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        if(this.head != null) this.head.prev = newNode;
        this.head = newNode;
        this.size++;
    }

    public void addLast(int val){
        if(this.isEmpty()){
            this.addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        this.size++;
    }

    public void addAt(int val, int index){
        //index as 0 based index
        if(index<0 || index>this.size){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            this.addFirst(val);
            return;
        }
        if(index == this.size()){
            this.addLast(val);
            return;
        }
        int counter = 0;
        Node newNode = new Node(val);
        Node temp = this.head;
        while(counter+1<index){
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        this.size++;
    }

    public void addMany(int[] arr){
        for(int i: arr){
            this.addLast(i);
        }
    }

    public int deleteFirst(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int delVal = head.val;
        this.head = this.head.next;
        if(!this.isEmpty()){
            this.head.prev.next = null; //optional
            this.head.prev = null;
        }
        this.size--;
        return delVal;
    }

    public int deleteLast(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        if(this.size == 1){
            return this.deleteFirst();
        }
        Node temp = this.head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        int delVal = temp.next.val;
        temp.next.prev = null; //optional
        temp.next = null;
        this.size--;
        return delVal;
    }

    public int deleteAt(int index){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        if(index<0 || index>=this.size()){
            System.out.println("Invalid index");
            return -1;
        }

        if(index == 0){
            return this.deleteFirst();
        }

        if(index == this.size()-1){
            return this.deleteLast();
        }

        int counter = 0;
        Node temp = this.head;
        while(counter<index){
            temp = temp.next;
            counter++;
        }
        int delVal = temp.val;
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null; //optional
        temp.next = null; //optional
        this.size--;
        return delVal;
    }

    public void print(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void print(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
