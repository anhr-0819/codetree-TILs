import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.equals("S")) {
            System.out.print("Superior");
        } else if(s.equals("A")) {
            System.out.print("Excellent");
        } else if(s.equals("B")) {
            System.out.print("Good");
        } else if(s.equals("C")) {
            System.out.print("Usually");
        } else if(s.equals("D")) {
            System.out.print("Effort");
        } else {
            System.out.print("Failure");
        }
    }
}