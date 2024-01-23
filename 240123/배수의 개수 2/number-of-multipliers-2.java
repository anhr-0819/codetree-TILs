import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i<10; i++) {
            int input = scan.nextInt();
            if(input%2 != 0) count++;
        }
        System.out.print(count);
    }
}