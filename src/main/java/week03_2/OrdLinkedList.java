package week03_2;

/**
 * @author Moody
 */
public class OrdLinkedList implements OrdMethods {
    // Write the complete class
    private Link first;            // ref to first link on list
    int n;

    public OrdLinkedList() // constructor
    {
        first = null;               // no links on list yet
        n = 0;
    }


    @Override
    public void clear() {
        first = null;
        n = 0;
    }

    @Override
    public double getFirst() { // O(1)
        if (n == 0) {
            throw new IllegalCallerException("No First yet");
        }
        return first.data;
    }

    @Override
    public double getLast() { // O(n)
        if (n == 0) {
            throw new IllegalCallerException("No Last yet");
        }
        Link cur = first;
        while (cur.next != null) cur = cur.next;

        return cur.data;
    }

    @Override
    public int find(double searchKey) { // O(n)
        if (n == 0) return -1;
        Link cur = first;

        if (first.data == searchKey) return 0;

        while (cur.next != null) {
            if (cur.next.data == searchKey) return 0;
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public void insert(double value) { //O(n)
        Link link = new Link(value);
        if (n == 0) {
            first = link;
            n++;
            return;
        }

        Link cur = first;
        // 1 2 3 4 (5) 6
        if (value < cur.data) {
            link.next = cur;
            first = link;
        } else {
            while (cur.next != null && value > cur.next.data) {
                cur = cur.next;
            }
            link.next = cur.next;
            cur.next = link;
        }
        n++;
    }

    @Override
    public boolean delete(double value) { // O(n)
        if (find(value) == -1) return false;

        Link cur = first;
        if (cur.data == value){
            first = null;
            return true;
        }
        while (cur.next != null){
            if (cur.next.data == value){
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public double findMin() { // O(1)
        return getFirst();
    }

    @Override
    public double findMax() { //O(n)
        return getLast();
    }

    @Override
    public double findNext(double k) {
        int f = find(k);
        if (f == -1) return -1;

        Link cur = first;
        while (cur != null) {
            if (cur.data > k) {
               return cur.data;
            }
            cur = cur.next;
        }
        return k;
    }

    public static void main(String[] args) {
        OrdLinkedList ordLinkedList = new OrdLinkedList();

        ordLinkedList.insert(1);
        ordLinkedList.display();

        ordLinkedList.insert(2);
        ordLinkedList.display();

        ordLinkedList.insert(7);
        ordLinkedList.display();

        ordLinkedList.insert(0);
        ordLinkedList.display();
//
//        System.out.println(ordLinkedList.delete(7));
//        ordLinkedList.display();

        System.out.println(ordLinkedList.findMax());
//        ordLinkedList.display();


        System.out.println(ordLinkedList.findMin());
//        ordLinkedList.display();

        System.out.println(ordLinkedList.findPrev(7));
//        ordLinkedList.display();

        System.out.println(ordLinkedList.findNext(7));
        ordLinkedList.display();



    }

    @Override
    public double findPrev(double k) {
        int f = find(k);
        if (f == -1) return -1;

        Link cur = first;
        while (cur != null) {
            if (cur.data < k) {
                return cur.data;
            }
            cur = cur.next;
        }
        return k;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Link cur = first; // for each element,
        while (cur != null) {
            stringBuilder.append(cur.data).append(" ");
            cur = cur.next;
        }
        return stringBuilder.toString();
    }
}


