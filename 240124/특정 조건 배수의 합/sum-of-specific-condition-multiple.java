import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        while(a<=b) {
            if(a%5 == 0) sum+=a;
            a++;
        }
        System.out.print(sum);
    }
}