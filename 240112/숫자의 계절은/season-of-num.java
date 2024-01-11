import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 3 || n > 11) {
            System.out.print("Winter");
        } else if(n <= 5) {
            System.out.print("Spring");
        } else if(n <= 8) {
            System.out.print("Summer");
        } else {
            System.out.print("Fall");
        }
    }
}