import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>112) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}