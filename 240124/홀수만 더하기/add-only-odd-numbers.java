import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0; i<n; i++) {
            int input = scan.nextInt();
            if(input%2 != 0 && input%3 == 0) {
                sum += input;
            }
        }
        System.out.print(sum);
    }
}