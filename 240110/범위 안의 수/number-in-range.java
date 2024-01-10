import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=10 && a<=20) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}