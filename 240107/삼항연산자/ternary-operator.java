import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        scan.close();

        String str = sc == 100 ? "pass" : "failure";

        System.out.print(str); 
    }
}