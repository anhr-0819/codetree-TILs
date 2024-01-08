import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2 == 0) {
            a = a/2;
        }
        if(a%2 != 0) {
            a = (a+1)/2;
        }
        System.out.print(a);
    }
}