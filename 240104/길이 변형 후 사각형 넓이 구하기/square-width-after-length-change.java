import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt() + 8;
        int height = scan.nextInt() * 3;

        System.out.printf("%d\n%d\n%d",width,height,width*height);
    }
}