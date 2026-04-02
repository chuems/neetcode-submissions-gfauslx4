class LinkedList {
    
    //Node def
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    } 
    private Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if(index < 0)
        return -1;

        int i = 0;
        Node curr = head;

        while (curr != null){
            if(index == i){
                return curr.val;
            }
            curr = curr.next;
            i++;
        } return -1;
    }

    public void insertHead(int val) {
        Node new_Node = new Node(val);
        new_Node.next = head;
        head = new_Node;
    }

    public void insertTail(int val) {
        Node tail = new Node(val);

        if (head == null){
            head = tail;
            return;
        }

       Node walk = head;
       while(walk.next != null){
        walk = walk.next;
       }
       walk.next = tail;

    }

    public boolean remove(int index) {
        if (index < 0 || head == null){
            return false;
        }
        if ( index == 0){
            head = head.next;
            return true;
        }
        int i = 0;
        Node curr = head;
        while( curr.next != null){
            if(index == i + 1){
                curr.next = curr.next.next;
                return true;
            }
            curr = curr.next;
            i++;
        }return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;

        while(curr != null){
            result.add(curr.val);
            curr = curr.next;
        }return result;
}
}