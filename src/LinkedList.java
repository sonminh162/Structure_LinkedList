public class LinkedList {
    private Node head;
    private int numNodes;
    private boolean flag;
    public LinkedList(){
    }
    public LinkedList(Object data){
        head = new Node(data);
        numNodes++;
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }

    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data){
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = new Node(data);
        numNodes++;
    }
    public void remove(int index){
        Node temp = head;
        for(int i = 0; i<index-1;i++){
            temp = temp.next;
        }
        Node current = temp.next;
        temp.next = current.next;
        numNodes--;
    }
    public void removeObject(Object data){
        Node temp = head;
        if(temp.getData()==data){
            head = temp.next;
            numNodes--;
        }
        else {
            while (temp.next != null){
                if (temp.next.getData() == data) {
                    Node current = temp.next.next;
                    temp.next = current;
                    numNodes--;
                }
                temp = temp.next;
            }
        }
    }
    public int size(){
        Node temp = head;
        int size =0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public Object clone(LinkedList list){
        list.head = this.head;
        Node tempNew = list.head;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            tempNew=temp;
            tempNew = tempNew.next;
        }
        return list;
    }
    public boolean Contains(Object data){
        Node temp = head;
        for(int i = 0 ; i < numNodes; i++){
            if(temp.getData().equals(data)){
                flag = true;
                break;
            }
            else{
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }
    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        for(int i = 0; i<numNodes-1;i++) {
            if (temp.getData().equals(data))
                index = i;
            temp = temp.next;
        }
        return index;
    }

    public void clear(){
        head = new Node(null);
        numNodes = 0;
    }
    public Object get(int index){
        Node temp = head;
        for(int i = 0; i<index -1 ; i++){
            temp = temp.next;
        }
        return temp.getData();
    }
    public Object getFirst(){
        Node temp = head;
        return temp.getData();
    }
    public Object getLast(){
        Node temp = head;
        for(int i = 0; i < numNodes -1; i++)
            temp = temp.next;
        return temp.getData();
    }
    public void add(int index, Object data){
        Node temp = head;
        for(int i = 0; i< index -1 && temp.next != null; i++){
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
