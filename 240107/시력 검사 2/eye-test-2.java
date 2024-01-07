import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        if(d>=1.0) {
            System.out.print("High");
        } else if(d>=0.5) {
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }
    }
}