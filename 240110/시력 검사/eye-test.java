import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a>=1.0 && b>=1.0) {
            System.out.print("High");
        }else if(a>=0.5 && b>=0.5) {
            System.out.print("Middle");
        }else {
            System.out.print("Low");
            }
    }
}