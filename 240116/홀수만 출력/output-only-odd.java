import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        while(a<=b) {
            if(a%2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}