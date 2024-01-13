import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int[] a = new int[2];
       int[] b = new int[2];

       a[0] = scan.nextInt();
       a[1] = scan.nextInt();
       b[0] = scan.nextInt();
       b[1] = scan.nextInt();

       char c = ' ';
       if(a[0] == b[0]) {
        c = a[1]>b[1] ? 'A' : 'B';
       } else {
        c = a[0]>b[0] ? 'A' : 'B';
       }
       System.out.print(c);
    }
}