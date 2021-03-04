/*    0 1 2 3 4
items:a b c d e
size:
 */
/*Invariants:
addLast:the index of last is always size;
get:the last index of list is size - 1;
size:the numbers of items is equal to size;
 */
public class AList<T> {

    private T[] items;
    private int size;

    //creates an empty list
    public AList(){
        //casting
        items =(T[]) new Object[100];
        size = 0;
    }

    //array resizing
    private void resize(int capacity){
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        //a[size] = x;
        items = a;
        //size += 1;
    }

    //addLast
    public void addLast(T x){
        if(items.length == size){
            resize(size *2);
        }

        items[size] = x;
        size += 1;
    }

    //getLast
    public T getLast(){
        //Attention
        return items[size - 1];
    }

    //get
    public T get(int x){
        return items[x];
    }

    //size
    public int size(){
        return size;
    }

    //remove last and return it
    public T removeLast(){
        T x = getLast();
        items[size - 1] = null;
        size -= 1;
        return x;
    }

    //main
    public static void main(String[] args){

    }
}
