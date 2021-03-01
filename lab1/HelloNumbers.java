import java.util.Scanner;

public class HelloNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//
        int n = sc.nextInt();//
        String str = sc.next();//
        sc.close();//
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);//
            if (ch == 'L')//
                for (int j = 0; j < 10; j++) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                        break;
                    }
                }
            else if (ch == 'R')
                for (int j = 9; j >= 0; j--) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                        break;
                    }
                }
            else {
                int idx = Integer.parseInt(ch+"");//
                arr[idx]=0;
            }
        }

        for(int i=0;i<10;i++)
            System.out.print(arr[i]);

    }
}
