public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x){
        //find the smallest item
        //move it to the front of the array
        //selection sort the rest
        //sort(x[1:])
        sort( x, 0);

    }

    /** Sort the array for a start point. */
    public static void sort(String[] x,int start){
        //base case ,base case
        if (start == x.length){
            return;
        }
        int smallest = findSmallest(x, start);
        swap(x, start, smallest);
        sort(x, start + 1);
    }

    /** Swap a and b in x. */
    public static void swap(String[] x,int a,int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
    /** Return the smallest String in x.*/
    public static int findSmallest(String[] x,int start){
        int smallestIndex = start;
        for (int i = start;i < x.length;i += 1){
            //if x[i] < x[smallestIndex],return -1,from the internet;
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
