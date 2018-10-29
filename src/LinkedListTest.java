public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.add(2,13);

        ll.printList();

        System.out.println("\n"+ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
        System.out.println("\n"+ll.size());
        System.out.println(ll.indexOf(11)+"\n");

        ll.remove(1);
        ll.removeObject(11);
        ll.printList();

        System.out.println("");

        ll.addLast(9);
        ll.printList();
        System.out.println("");

        LinkedList llClone = new LinkedList(null);
        ll.clone(llClone);
        llClone.printList();
        System.out.println("");


        if(ll.Contains(9)) System.out.println("YES!");

        System.out.println("");
        ll.clear();
        ll.printList();
    }
}
