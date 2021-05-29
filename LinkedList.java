
public class LinkedList<E> {

    Node head;

    public void insert(E data) {
        Node node = new Node();
        node.data = data;

        if (head == null) head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int pos, E data) {
        if(pos == 0) {
            insertAtStart(data);
            return;
        }
        Node node = new Node();
        node.data = data;
            Node n = head;
            for (int i = 0; i < pos-1; i++){
                n = n.next;
            };
            node.next = n.next;
            n.next = node;
    }


    public void insertAtStart(E data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void delete(int pos){
        Node n = head;
        if(pos == 0){
            head = head.next;
        }
        for(int i = 0; i < pos-1; i++) n = n.next;
        n.next = n.next.next;
    }
    public void reverse(){
        Node i = head.next;
        Node j = i.next;
        head.next = null;
        while(j != null){
            i.next = head;
            head = i;
            i = j;
            j = j.next;
        }
        i.next = head;
        head = i;
    }
    public Node getElementAtIndex(int index){
        if(index < 0) throw new IndexOutOfBoundsException();
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
            if(temp == null) throw new IndexOutOfBoundsException();
        }
        return temp;
    }
    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}
