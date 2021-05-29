public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(19);
        list.show();
        list.reverse();
        list.show();
        list.delete(1);
        list.show();
    }
}
