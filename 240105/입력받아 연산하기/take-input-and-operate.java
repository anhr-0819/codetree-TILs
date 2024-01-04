import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt()+87;
        int b = scan.nextInt()%10;

        System.out.printf("%d\n%d",a,b);
    }
}