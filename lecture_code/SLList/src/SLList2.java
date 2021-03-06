public class SLList2 {

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    //The first item (if it exists) is an sentinel.next.
    private IntNode sentinal;
    private int size;

    //constructor
    public SLList2(int x){
        //Attention
        sentinal = new IntNode(1,null);
        sentinal.next = new IntNode(x,null);
        size = 1;
    }

    //creates an empty list
    public SLList2(){
        sentinal = new IntNode(1,null);
        size = 0;
    }

    //addFirst
    public void addFirst(int x){
        size += 1;

        sentinal.next = new IntNode(x,sentinal.next);
    }

    //getFirst
    public int getFirst(){
        return sentinal.next.item;
    }

    //addLast
    public void addLast(int x){
        size += 1;

        //prevent p is null
        IntNode p = sentinal;

        while(p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);
    }

    //size
    public int size(){
        return size;
    }

    //main
    public static void main(String[] args){
        SLList2 L = new SLList2(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }

}
