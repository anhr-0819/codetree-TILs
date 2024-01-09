import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 5) {
            System.out.print("A");
        } 
        if(a%2 == 0) {
            System.out.print("B");
        }
    }
}