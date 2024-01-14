import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 2) {
            System.out.print(28);
        } else {
            switch(n) {
                case 4: case 6: case 9: case 11:
                System.out.print(30);
                break;
                default:
                System.out.print(31);
            }
        }
    }
}