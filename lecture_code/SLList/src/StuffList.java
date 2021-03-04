public class StuffList<T> {

    private class StuffNode {
        public T item;
        public StuffNode next;

        public StuffNode(T i, StuffNode n){
            item = i;
            next = n;
        }
    }

    //The first item (if it exists) is an sentinel.next.
    private StuffNode sentinal;
    private int size;

    //constructor
    public StuffList(T x){
        //Attention
        sentinal = new StuffNode(null,null);
        sentinal.next = new StuffNode(null,null);
        size = 1;
    }

    //creates an empty list
    public StuffList(){
        sentinal = new StuffNode(null,null);
        size = 0;
    }

    //addFirst
    public void addFirst(T x){
        size += 1;

        sentinal.next = new StuffNode(x,sentinal.next);
    }

    //getFirst
    public T getFirst(){
        return sentinal.next.item;
    }

    //addLast
    public void addLast(T x){
        size += 1;

        //prevent p is null
        StuffNode p = sentinal;

        while(p.next != null){
            p = p.next;
        }

        p.next = new StuffNode(x,null);
    }

    //size
    public int size(){
        return size;
    }

    //main
    public static void main(String[] args){
        StuffList<String> L = new StuffList<>("c");
        L.addFirst("b");
        L.addFirst("a");
        L.addLast("d");
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }

}

