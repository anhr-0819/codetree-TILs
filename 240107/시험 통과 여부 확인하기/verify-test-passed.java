import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        if(sc>79) {
            System.out.print("pass");
        } else {
            System.out.printf("%d more score",80-sc);
        }
    }
}