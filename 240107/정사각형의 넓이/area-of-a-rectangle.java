import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int area = (int) Math.pow(n,2);
        System.out.println(area);
        if(n<5) {
            System.out.print("tiny");
        }
    }
}