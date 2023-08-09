package Lec32.LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList{

    private Node head;
    private int size;

    MyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return this.size == 0;
    }

    int size(){
        return this.size;
    }

    void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    void addLast(int val){
        if(this.isEmpty()){
            this.addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = this.head;
        //temp reaches the end after the loop
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        this.size++;
    }

    void addAt(int val, int idx){
        //idx -> zero based indexing
        if(idx<0 || idx>this.size){
            System.out.println("Insertion not possible...please enter valid index");
            return;
        }
        if(idx == 0) this.addFirst(val);
        else if(idx == this.size) this.addLast(val);
        else{
            Node newNode = new Node(val);
            Node temp = head;
            int cnt = 0;
            while(cnt+1 != idx){
                temp = temp.next;
                cnt++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            this.size++;
        }
    }

    int deleteFirst(){
        if(this.isEmpty()){
            System.out.println("Linked List is empty, so can't delete");
            return -1;
        }
        int deletedVal = head.val;
        this.head = this.head.next;
        this.size--;
        return deletedVal;
    }

    int deleteLast(){
        if(this.size<2){
            return this.deleteFirst();
        }
        Node temp = this.head;
        //go till second last node
        while(temp.next.next != null){
            temp = temp.next;
        }
        int deletedVal = temp.next.val;
        temp.next = null;
        this.size--;
        return deletedVal;
    }

    int deleteAt(int idx){
        if(idx<0 || idx>=this.size){
            System.out.println("Deletion not possible, please enter valid index");
            return -1;
        }
        if(idx == 0){
            return this.deleteFirst();
        }
        else if(idx == this.size()-1){
            return this.deleteLast();
        }
        else{
            Node temp = head;
            int cnt = 0;
            while(cnt+1!=idx){
                temp = temp.next;
                cnt++;
            }
            int deletedVal = temp.next.val;
            temp.next = temp.next.next;
            this.size--;
            return deletedVal;
        }
    }

    void print(){
        if(this.isEmpty()){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
