/** An SLList is a list of integers,which hides the terrible truth
 * of the nakedness within. */
public class SLList {

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;

    public SLList(int x){
        first = new IntNode(x,null);
        size = 1;
    }

    /** Creates an empty list. */
    public SLList(){
        first = null;
        size = 0;
    }

    /** Adds the x to the front of the List. */
    public void addFirst(int x){
        first = new IntNode(x,first);

        size += 1;
    }

    /** Return the first item of the List. */
    public int getFirst(){
        return first.item;
    }

    /** Adds the item x to the end of list. */
    public void addLast(int x){
        size += 1;

        IntNode p = first;

        /** Skim p to the end of the list. */
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);
    }

    /** Return the size of list.
    public int size(){
        return size(first);
    }

     Return the size of IntNode.
    private int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }
    */

    /** Return the size of list fast. */
    public int size(){
        return size;
    }
    public static void main(String[] args){
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);

        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
