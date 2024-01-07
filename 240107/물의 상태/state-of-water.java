import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<0) {
            System.out.print("ice");
        } else if(a>100) {
            System.out.print("vapor");
        } else {
            System.out.print("water");
        }
    }
}